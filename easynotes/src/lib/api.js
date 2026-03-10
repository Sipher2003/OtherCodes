const API_BASE = '/api';

function getToken() {
  return localStorage.getItem('aura-token');
}

async function request(url, options = {}) {
  const token = getToken();
  const headers = {
    'Content-Type': 'application/json',
    ...(token ? { Authorization: `Bearer ${token}` } : {}),
    ...options.headers,
  };

  const res = await fetch(`${API_BASE}${url}`, { ...options, headers });

  if (res.status === 401 || res.status === 403) {
    localStorage.removeItem('aura-token');
    localStorage.removeItem('aura-user');
    window.location.reload();
    throw new Error('Session expired');
  }

  const data = await res.json();
  if (!res.ok) throw new Error(data.error || 'Request failed');
  return data;
}

// Auth
export const api = {
  register: (email, username, password) =>
    request('/auth/register', {
      method: 'POST',
      body: JSON.stringify({ email, username, password }),
    }),

  login: (email, password) =>
    request('/auth/login', {
      method: 'POST',
      body: JSON.stringify({ email, password }),
    }),

  getMe: () => request('/auth/me'),

  // Notes
  getAllNotes: () => request('/notes'),

  saveNote: (dateKey, noteData) =>
    request(`/notes/${dateKey}`, {
      method: 'PUT',
      body: JSON.stringify(noteData),
    }),

  // Todos
  getAllTodos: () => request('/todos'),

  addTodo: (dateKey, todo) =>
    request(`/todos/${dateKey}`, {
      method: 'POST',
      body: JSON.stringify(todo),
    }),

  toggleTodo: (todoId) =>
    request(`/todos/${todoId}/toggle`, { method: 'PATCH' }),

  deleteTodo: (todoId) =>
    request(`/todos/${todoId}`, { method: 'DELETE' }),
};
