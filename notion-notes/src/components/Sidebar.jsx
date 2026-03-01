import { Moon, Calendar, FileText, LayoutDashboard, Flame, Sun } from 'lucide-react';
import { useState, useEffect } from 'react';

export default function Sidebar({ currentView, setCurrentView, streak }) {
    const [isDark, setIsDark] = useState(true);

    // Toggle dark mode classes on html/body
    useEffect(() => {
        if (isDark) {
            document.documentElement.classList.add('dark');
            document.body.classList.add('dark-theme');
        } else {
            document.documentElement.classList.remove('dark');
            document.body.classList.remove('dark-theme');
        }
    }, [isDark]);

    return (
        <aside className="w-64 bg-bg-sidebar border-r border-border-color flex flex-col shrink-0 h-full">
            <div className="p-4 pb-2">
                <div className="flex items-center gap-3 font-semibold text-lg text-text-primary mb-6">
                    <Moon className="w-5 h-5 text-brand" />
                    <span>Your Workspace</span>
                </div>
            </div>

            <nav className="flex-1 overflow-y-auto px-2 pb-4 space-y-6">
                <div>
                    <h3 className="text-xs uppercase font-semibold text-text-secondary tracking-wider px-2 mb-2">Views</h3>
                    <div className="space-y-1">
                        <button
                            onClick={() => setCurrentView('calendar')}
                            className={`w-full flex items-center gap-3 px-2 py-2 rounded-md text-sm transition-colors ${currentView === 'calendar' ? 'bg-bg-hover text-text-primary font-medium' : 'text-text-secondary hover:bg-bg-hover hover:text-text-primary'
                                }`}
                        >
                            <Calendar className="w-4 h-4" />
                            Calendar
                        </button>
                        <button
                            onClick={() => setCurrentView('notes')}
                            className={`w-full flex items-center gap-3 px-2 py-2 rounded-md text-sm transition-colors ${currentView === 'notes' ? 'bg-bg-hover text-text-primary font-medium' : 'text-text-secondary hover:bg-bg-hover hover:text-text-primary'
                                }`}
                        >
                            <FileText className="w-4 h-4" />
                            All Notes
                        </button>
                        <button
                            onClick={() => setCurrentView('dashboard')}
                            className={`w-full flex items-center gap-3 px-2 py-2 rounded-md text-sm transition-colors ${
                                currentView === 'dashboard' ? 'bg-bg-hover text-text-primary font-medium' : 'text-text-secondary hover:bg-bg-hover hover:text-text-primary'
                            }`}
                        >
                            <LayoutDashboard className="w-4 h-4" />
                            Dashboard
                        </button>
                    </div>
                </div>
            </nav>

            <div className="p-4 border-t border-border-color space-y-2 mt-auto">
                <button
                    onClick={() => setIsDark(!isDark)}
                    className="w-full flex items-center gap-3 px-2 py-2 rounded-md text-sm text-text-secondary hover:bg-bg-hover transition-colors"
                >
                    {isDark ? <Sun className="w-4 h-4" /> : <Moon className="w-4 h-4" />}
                    Toggle Theme
                </button>

                <div className="flex items-center gap-2 px-2 py-2 text-sm text-text-secondary">
                    <Flame className="w-4 h-4 text-orange-500" />
                    <span>{streak} Days Streak</span>
                </div>
            </div>
        </aside>
    );
}
