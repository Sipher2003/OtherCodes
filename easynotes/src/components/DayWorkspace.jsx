import { useState, useEffect } from 'react';
import { format } from 'date-fns';
import { X, Pin, Save, List, Bold, Italic, CheckSquare } from 'lucide-react';
import useStore from '../hooks/useStore';

export default function DayWorkspace({ date, onClose }) {
    const { getNote, saveNote, getTodos, addTodo, toggleTodo, deleteTodo } = useStore();

    const formattedDate = format(date, 'EEEE, MMMM do, yyyy');
    const noteData = getNote(date);
    const todos = getTodos(date);

    // Note State
    const [title, setTitle] = useState(noteData.title);
    const [content, setContent] = useState(noteData.content);
    const [tags, setTags] = useState(noteData.tags || []);
    const [tagInput, setTagInput] = useState('');
    const [saveStatus, setSaveStatus] = useState('');

    // Todo State
    const [newTodo, setNewTodo] = useState('');

    // Auto-save logic
    useEffect(() => {
        setTitle(noteData.title);
        setContent(noteData.content);
        setTags(noteData.tags || []);
    }, [date]); // Load new data when date changes

    useEffect(() => {
        const timer = setTimeout(() => {
            if (title !== noteData.title || content !== noteData.content || tags !== noteData.tags) {
                saveNote(date, { title, content, tags });
                setSaveStatus('Saved just now');
                setTimeout(() => setSaveStatus(''), 2000);
            }
        }, 1000);
        return () => clearTimeout(timer);
    }, [title, content, tags, date]);

    // Tag Handling
    const handleTagKeydown = (e) => {
        if (e.key === 'Enter' && tagInput.trim()) {
            e.preventDefault();
            if (!tags.includes(tagInput.trim())) {
                setTags([...tags, tagInput.trim()]);
            }
            setTagInput('');
        }
    };

    const removeTag = (tagToRemove) => {
        setTags(tags.filter(t => t !== tagToRemove));
    };

    // Todo Handling
    const handleAddTodo = (e) => {
        e.preventDefault();
        if (newTodo.trim()) {
            addTodo(date, newTodo.trim());
            setNewTodo('');
        }
    };

    const completedTodos = todos.filter(t => t.completed).length;
    const progressPercent = todos.length ? (completedTodos / todos.length) * 100 : 0;

    return (
        <div className="glass-panel overflow-hidden">
            {/* Workspace Header */}
            <div className="flex items-center justify-between p-6 border-b border-border-color">
                <h2 className="text-2xl font-semibold tracking-tight">{formattedDate}</h2>
                <button onClick={onClose} className="p-2 hover:bg-bg-hover rounded-full transition-colors">
                    <X className="w-5 h-5 text-text-secondary" />
                </button>
            </div>

            <div className="grid grid-cols-1 lg:grid-cols-3 divide-y lg:divide-y-0 lg:divide-x divide-border-color min-h-[600px]">

                {/* Note Editor Area (2 columns wide) */}
                <div className="col-span-1 lg:col-span-2 p-6 flex flex-col bg-bg-card/50">
                    <div className="flex justify-between items-center mb-6">
                        <input
                            type="text"
                            value={title}
                            onChange={(e) => setTitle(e.target.value)}
                            placeholder="Untitled Document..."
                            className="text-3xl font-bold bg-transparent border-none focus:outline-none placeholder:text-text-secondary/50 w-full"
                        />
                    </div>

                    <div className="flex flex-wrap gap-2 mb-6 items-center">
                        {tags.map(tag => (
                            <span key={tag} className="flex items-center gap-1 px-3 py-1 bg-bg-hover text-xs rounded-full">
                                {tag}
                                <button onClick={() => removeTag(tag)} className="hover:text-danger"><X className="w-3 h-3" /></button>
                            </span>
                        ))}
                        <input
                            type="text"
                            value={tagInput}
                            onChange={(e) => setTagInput(e.target.value)}
                            onKeyDown={handleTagKeydown}
                            placeholder="Add tag..."
                            className="bg-transparent border-none text-sm focus:outline-none placeholder:text-text-secondary w-24"
                        />
                    </div>

                    <div className="flex-1 relative flex flex-col">
                        <textarea
                            value={content}
                            onChange={(e) => setContent(e.target.value)}
                            placeholder="Start writing..."
                            className="w-full h-full bg-transparent border-none focus:outline-none resize-none text-lg leading-relaxed placeholder:text-text-secondary w-full"
                        />
                    </div>

                    <div className="flex items-center justify-between text-xs text-text-secondary mt-4 border-t border-border-color pt-4">
                        <div>
                            {content.trim() ? content.trim().split(/\s+/).length : 0} words
                        </div>
                        <div className="flex items-center gap-3">
                            <div className="italic text-brand transition-opacity duration-300" style={{ opacity: saveStatus ? 1 : 0 }}>
                                {saveStatus}
                            </div>
                            <button
                                onClick={() => {
                                    saveNote(date, { title, content, tags });
                                    setSaveStatus('Saved!');
                                    setTimeout(() => setSaveStatus(''), 2000);
                                }}
                                className="px-3 py-1.5 bg-brand hover:bg-brand-hover text-white rounded-md transition-colors flex items-center gap-2 text-sm"
                            >
                                <Save className="w-3.5 h-3.5" />
                                Save
                            </button>
                        </div>
                    </div>
                </div>

                {/* Todo List Area (1 column wide) */}
                <div className="col-span-1 flex flex-col bg-bg-sidebar">
                    <div className="p-6 pb-2 border-b border-border-color flex items-center gap-2">
                        <CheckSquare className="w-5 h-5 text-success" />
                        <h3 className="font-semibold text-lg">Tasks</h3>
                    </div>

                    <div className="p-6 flex-1 flex flex-col overflow-hidden">
                        {/* Progress Bar */}
                        <div className="mb-6">
                            <div className="flex justify-between text-xs mb-1 text-text-secondary">
                                <span>Progress</span>
                                <span>{completedTodos} / {todos.length}</span>
                            </div>
                            <div className="h-1.5 w-full bg-border-color rounded-full overflow-hidden">
                                <div
                                    className="h-full bg-success transition-all duration-300"
                                    style={{ width: `${progressPercent}%` }}
                                ></div>
                            </div>
                        </div>

                        <form onSubmit={handleAddTodo} className="mb-6 relative">
                            <input
                                type="text"
                                value={newTodo}
                                onChange={(e) => setNewTodo(e.target.value)}
                                placeholder="Add a new task..."
                                className="w-full bg-bg-hover border border-transparent rounded-md px-4 py-2 text-sm focus:outline-none focus:border-success transition-colors"
                            />
                        </form>

                        <div className="flex-1 overflow-y-auto space-y-2 pr-2">
                            {todos.length === 0 ? (
                                <p className="text-center text-sm text-text-secondary italic mt-4">No tasks for this day.</p>
                            ) : (
                                todos.map(todo => (
                                    <div
                                        key={todo.id}
                                        className={`group flex items-start gap-3 p-2 rounded-md hover:bg-bg-hover transition-colors ${todo.completed ? 'opacity-50' : ''}`}
                                    >
                                        <button
                                            onClick={() => toggleTodo(date, todo.id)}
                                            className={`mt-0.5 w-4 h-4 rounded border flex items-center justify-center shrink-0 transition-colors ${todo.completed
                                                ? 'bg-success border-success text-white'
                                                : 'border-text-secondary hover:border-success'
                                                }`}
                                        >
                                            {todo.completed && <X className="w-3 h-3 hover:transform hover:rotate-180 transition-transform duration-300" style={{ strokeWidth: 3 }} />}
                                        </button>
                                        <span className={`flex-1 text-sm ${todo.completed ? 'line-through' : ''}`}>
                                            {todo.text}
                                        </span>
                                        <button
                                            onClick={() => deleteTodo(date, todo.id)}
                                            className="opacity-0 group-hover:opacity-100 text-text-secondary hover:text-danger transition-all p-1"
                                        >
                                            <X className="w-3 h-3" />
                                        </button>
                                    </div>
                                ))
                            )}
                        </div>
                    </div>
                </div>

            </div>
        </div>
    );
}
