import { createContext, useContext, useState, useEffect } from 'react';
import { api } from '../lib/api';

const AuthContext = createContext(null);

export function AuthProvider({ children }) {
  const [user, setUser] = useState(() => {
    try {
      const stored = localStorage.getItem('aura-user');
      return stored ? JSON.parse(stored) : null;
    } catch {
      return null;
    }
  });
  const [loading, setLoading] = useState(true);

  // Verify token on mount
  useEffect(() => {
    const token = localStorage.getItem('aura-token');
    if (!token) {
      setLoading(false);
      return;
    }

    api.getMe()
      .then(data => {
        setUser(data.user);
        localStorage.setItem('aura-user', JSON.stringify(data.user));
      })
      .catch(() => {
        setUser(null);
        localStorage.removeItem('aura-token');
        localStorage.removeItem('aura-user');
      })
      .finally(() => setLoading(false));
  }, []);

  const login = async (email, password) => {
    const data = await api.login(email, password);
    localStorage.setItem('aura-token', data.token);
    localStorage.setItem('aura-user', JSON.stringify(data.user));
    setUser(data.user);
    return data;
  };

  const register = async (email, username, password) => {
    const data = await api.register(email, username, password);
    localStorage.setItem('aura-token', data.token);
    localStorage.setItem('aura-user', JSON.stringify(data.user));
    setUser(data.user);
    return data;
  };

  const logout = () => {
    localStorage.removeItem('aura-token');
    localStorage.removeItem('aura-user');
    setUser(null);
  };

  return (
    <AuthContext.Provider value={{ user, loading, login, register, logout }}>
      {children}
    </AuthContext.Provider>
  );
}

export function useAuth() {
  const ctx = useContext(AuthContext);
  if (!ctx) throw new Error('useAuth must be used within AuthProvider');
  return ctx;
}
