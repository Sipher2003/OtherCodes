import { useState, useEffect } from 'react';
import { format, differenceInDays } from 'date-fns';

const ST_NOTES = 'aura-notes';
const ST_TODOS = 'aura-todos';
const ST_STREAK = 'aura-streak';

export default function useStore() {
    const [selectedDate, setSelectedDate] = useState(new Date());

    // Load from LocalStorage
    const loadStoredData = (key, fallback) => {
        try {
            const item = window.localStorage.getItem(key);
            return item ? JSON.parse(item) : fallback;
        } catch {
            return fallback;
        }
    };

    const [notes, setNotes] = useState(() => loadStoredData(ST_NOTES, {}));
    const [todos, setTodos] = useState(() => loadStoredData(ST_TODOS, {}));
    // Store streak tracking {"lastDate": "2026-03-01", "count": 5}
    const [streakData, setStreakData] = useState(() => loadStoredData(ST_STREAK, { lastDate: null, count: 0 }));

    // Save to LocalStorage whenever state changes
    useEffect(() => {
        window.localStorage.setItem(ST_NOTES, JSON.stringify(notes));
    }, [notes]);

    useEffect(() => {
        window.localStorage.setItem(ST_TODOS, JSON.stringify(todos));
    }, [todos]);

    useEffect(() => {
        window.localStorage.setItem(ST_STREAK, JSON.stringify(streakData));
    }, [streakData]);

    const getDateKey = (date) => format(date, 'yyyy-MM-dd');

    const getNote = (date) => notes[getDateKey(date)] || { title: '', content: '', tags: [] };

    const saveNote = (date, noteData) => {
        const key = getDateKey(date);
        const newNotes = { ...notes, [key]: noteData };
        setNotes(newNotes);
        updateStreak(date);
    };

    const getTodos = (date) => todos[getDateKey(date)] || [];

    const addTodo = (date, text) => {
        const key = getDateKey(date);
        const currentList = getTodos(date);
        setTodos({
            ...todos,
            [key]: [...currentList, { id: Date.now().toString(), text, completed: false }]
        });
        updateStreak(date);
    };

    const toggleTodo = (date, id) => {
        const key = getDateKey(date);
        const list = getTodos(date);
        setTodos({
            ...todos,
            [key]: list.map(t => t.id === id ? { ...t, completed: !t.completed } : t)
        });
    };

    const deleteTodo = (date, id) => {
        const key = getDateKey(date);
        setTodos({
            ...todos,
            [key]: getTodos(date).filter(t => t.id !== id)
        });
    };

    // Streak Logic
    const updateStreak = (date) => {
        const todayStr = format(new Date(), 'yyyy-MM-dd');
        const updateDateStr = getDateKey(date);

        // Only update streak if we're working on today's note
        if (todayStr !== updateDateStr) return;

        if (!streakData.lastDate) {
            setStreakData({ lastDate: todayStr, count: 1 });
            return;
        }

        if (streakData.lastDate === todayStr) return; // Already counted today

        const diff = differenceInDays(new Date(todayStr), new Date(streakData.lastDate));
        if (diff === 1) {
            // Consecutive day
            setStreakData({ lastDate: todayStr, count: streakData.count + 1 });
        } else if (diff > 1) {
            // Streak broken
            setStreakData({ lastDate: todayStr, count: 1 });
        }
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
        getStreak: () => streakData.count,
        notes,
        todos
    };
}
