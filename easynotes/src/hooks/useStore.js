import { useState, useEffect, useCallback } from 'react';
import { format, differenceInDays } from 'date-fns';
import { api } from '../lib/api';

export default function useStore() {
  const [selectedDate, setSelectedDate] = useState(new Date());
  const [notes, setNotes] = useState({});
  const [todos, setTodos] = useState({});
  const [dataLoaded, setDataLoaded] = useState(false);

  // Load all data from server on mount
  useEffect(() => {
    const token = localStorage.getItem('aura-token');
    if (!token) return;

    Promise.all([api.getAllNotes(), api.getAllTodos()])
      .then(([notesData, todosData]) => {
        setNotes(notesData);
        setTodos(todosData);
        setDataLoaded(true);
      })
      .catch((err) => {
        console.error('Failed to load data:', err);
        setDataLoaded(true);
      });
  }, []);

  const getDateKey = (date) => format(date, 'yyyy-MM-dd');

  const getNote = (date) => notes[getDateKey(date)] || { title: '', content: '', tags: [] };

  const saveNote = useCallback((date, noteData) => {
    const key = getDateKey(date);
    // Optimistic update
    setNotes(prev => ({ ...prev, [key]: noteData }));
    // Persist to server
    api.saveNote(key, noteData).catch(err => {
      console.error('Failed to save note:', err);
    });
  }, []);

  const getTodos = (date) => todos[getDateKey(date)] || [];

  const addTodo = useCallback((date, text) => {
    const key = getDateKey(date);
    const newTodo = { id: Date.now().toString(), text, completed: false };

    // Optimistic update
    setTodos(prev => ({
      ...prev,
      [key]: [...(prev[key] || []), newTodo]
    }));

    // Persist to server
    api.addTodo(key, newTodo).catch(err => {
      console.error('Failed to add todo:', err);
    });
  }, []);

  const toggleTodo = useCallback((date, id) => {
    const key = getDateKey(date);

    // Optimistic update
    setTodos(prev => ({
      ...prev,
      [key]: (prev[key] || []).map(t => t.id === id ? { ...t, completed: !t.completed } : t)
    }));

    // Persist to server
    api.toggleTodo(id).catch(err => {
      console.error('Failed to toggle todo:', err);
    });
  }, []);

  const deleteTodo = useCallback((date, id) => {
    const key = getDateKey(date);

    // Optimistic update
    setTodos(prev => ({
      ...prev,
      [key]: (prev[key] || []).filter(t => t.id !== id)
    }));

    // Persist to server
    api.deleteTodo(id).catch(err => {
      console.error('Failed to delete todo:', err);
    });
  }, []);

  // Streak calculation (client-side from loaded data)
  const getStreak = () => {
    const today = new Date();
    let streak = 0;
    let checkDate = today;

    while (true) {
      const key = format(checkDate, 'yyyy-MM-dd');
      const hasNote = notes[key] && notes[key].content && notes[key].content.trim().length > 0;
      const hasTodos = todos[key] && todos[key].length > 0;

      if (hasNote || hasTodos) {
        streak++;
        checkDate = new Date(checkDate);
        checkDate.setDate(checkDate.getDate() - 1);
      } else {
        // If it's today and no activity, check yesterday to not break streak mid-day
        if (streak === 0 && differenceInDays(today, checkDate) === 0) {
          checkDate = new Date(checkDate);
          checkDate.setDate(checkDate.getDate() - 1);
          continue;
        }
        break;
      }
    }

    return streak;
  };

  return {
    selectedDate,
    setSelectedDate,
    getNote,
    saveNote,
    getTodos,
    addTodo,
    toggleTodo,
    deleteTodo,
    getStreak,
    notes,
    todos,
    dataLoaded
  };
}
