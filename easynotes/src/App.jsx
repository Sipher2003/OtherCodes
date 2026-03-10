import { useState, useEffect } from 'react';
import { format, parseISO, startOfDay, endOfDay, subDays, isSameDay, startOfWeek, eachDayOfInterval } from 'date-fns';
import { ChevronDown, ChevronRight, Search, Filter, X, TrendingUp, Award, Calendar as CalendarIcon, Loader2 } from 'lucide-react';
import Sidebar from './components/Sidebar';
import Calendar from './components/Calendar';
import DayWorkspace from './components/DayWorkspace';
import AuthPage from './components/AuthPage';
import useStore from './hooks/useStore';
import { useAuth } from './contexts/AuthContext';

function Dashboard() {
  const { notes, todos } = useStore();

  // Generate last 365 days for contribution chart
  const generateContributionData = () => {
    const today = new Date();
    const startDate = subDays(today, 364);
    const days = eachDayOfInterval({ start: startDate, end: today });

    return days.map(day => {
      const key = format(day, 'yyyy-MM-dd');
      const hasNote = notes[key] && notes[key].content.trim().length > 0;
      const hasTodos = todos[key] && todos[key].length > 0;
      const completedTodos = todos[key] ? todos[key].filter(t => t.completed).length : 0;
      const totalTodos = todos[key] ? todos[key].length : 0;
      
      let level = 0;
      if (hasNote || hasTodos) {
        level = 1;
        if (hasNote && hasTodos) level = 2;
        if (completedTodos > 0) level = 3;
        if (completedTodos === totalTodos && totalTodos > 0) level = 4;
      }
      
      return { date: day, key, level, hasNote, hasTodos, completedTodos, totalTodos };
    });
  };

  const contributionData = generateContributionData();
  
  // Calculate stats
  const totalNotes = Object.values(notes).filter(n => n.content.trim().length > 0).length;
  const totalTodos = Object.values(todos).flat().length;
  const completedTodosCount = Object.values(todos).flat().filter(t => t.completed).length;
  const daysWithActivity = contributionData.filter(d => d.level > 0).length;

  // Group by weeks
  const weeks = [];
  let currentWeek = [];
  contributionData.forEach((day, index) => {
    currentWeek.push(day);
    if ((index + 1) % 7 === 0 || index === contributionData.length - 1) {
      weeks.push(currentWeek);
      currentWeek = [];
    }
  });

  const getLevelColor = (level) => {
    switch(level) {
      case 0: return 'bg-border-color/20';
      case 1: return 'bg-brand/30';
      case 2: return 'bg-brand/50';
      case 3: return 'bg-brand/70';
      case 4: return 'bg-brand';
      default: return 'bg-border-color/20';
    }
  };

  return (
    <div className="space-y-6">
      {/* Stats Cards */}
      <div className="grid grid-cols-1 md:grid-cols-3 gap-4">
        <div className="glass-panel p-6">
          <div className="flex items-center gap-3 mb-2">
            <CalendarIcon className="w-5 h-5 text-brand" />
            <h3 className="text-sm font-medium text-text-secondary">Active Days</h3>
          </div>
          <p className="text-3xl font-bold">{daysWithActivity}</p>
          <p className="text-xs text-text-secondary mt-1">Last 365 days</p>
        </div>
        
        <div className="glass-panel p-6">
          <div className="flex items-center gap-3 mb-2">
            <TrendingUp className="w-5 h-5 text-success" />
            <h3 className="text-sm font-medium text-text-secondary">Total Notes</h3>
          </div>
          <p className="text-3xl font-bold">{totalNotes}</p>
          <p className="text-xs text-text-secondary mt-1">Journal entries</p>
        </div>
        
        <div className="glass-panel p-6">
          <div className="flex items-center gap-3 mb-2">
            <Award className="w-5 h-5 text-orange-500" />
            <h3 className="text-sm font-medium text-text-secondary">Tasks Done</h3>
          </div>
          <p className="text-3xl font-bold">{completedTodosCount}/{totalTodos}</p>
          <p className="text-xs text-text-secondary mt-1">Completion rate: {totalTodos ? Math.round((completedTodosCount/totalTodos)*100) : 0}%</p>
        </div>
      </div>

      {/* Contribution Chart */}
      <div className="glass-panel p-6">
        <h2 className="text-xl font-semibold mb-4">Activity Overview</h2>
        <p className="text-sm text-text-secondary mb-6">Your daily contribution to notes and tasks over the last year</p>
        
        <div className="overflow-x-auto pb-4">
          <div className="inline-flex gap-1">
            {weeks.map((week, weekIndex) => (
              <div key={weekIndex} className="flex flex-col gap-1">
                {week.map((day, dayIndex) => {
                  const tooltip = `${format(day.date, 'MMM d, yyyy')}\n${day.hasNote ? 'Note ✓' : ''}${day.hasTodos ? `\nTasks: ${day.completedTodos}/${day.totalTodos}` : ''}`;
                  return (
                    <div
                      key={day.key}
                      className={`w-3 h-3 rounded-sm ${getLevelColor(day.level)} transition-all hover:ring-2 hover:ring-brand cursor-pointer`}
                      title={tooltip}
                    ></div>
                  );
                })}
              </div>
            ))}
          </div>
        </div>
        
        <div className="flex items-center gap-4 mt-6 text-xs text-text-secondary">
          <span>Less</span>
          <div className="flex gap-1">
            <div className="w-3 h-3 rounded-sm bg-border-color/20"></div>
            <div className="w-3 h-3 rounded-sm bg-brand/30"></div>
            <div className="w-3 h-3 rounded-sm bg-brand/50"></div>
            <div className="w-3 h-3 rounded-sm bg-brand/70"></div>
            <div className="w-3 h-3 rounded-sm bg-brand"></div>
          </div>
          <span>More</span>
        </div>
      </div>
    </div>
  );
}

function AllNotesView() {
  const { notes } = useStore();
  const [expandedNote, setExpandedNote] = useState(null);
  const [searchQuery, setSearchQuery] = useState('');
  const [dateFilter, setDateFilter] = useState('');

  // Convert notes object to array and sort by date (newest first)
  let notesList = Object.entries(notes)
    .filter(([_, note]) => note.content.trim().length > 0 || note.title.trim().length > 0)
    .sort(([dateA], [dateB]) => new Date(dateB) - new Date(dateA));

  // Apply search filter
  if (searchQuery.trim()) {
    const query = searchQuery.toLowerCase();
    notesList = notesList.filter(([_, note]) => {
      const titleMatch = note.title.toLowerCase().includes(query);
      const contentMatch = note.content.toLowerCase().includes(query);
      const tagsMatch = note.tags?.some(tag => tag.toLowerCase().includes(query));
      return titleMatch || contentMatch || tagsMatch;
    });
  }

  // Apply date filter
  if (dateFilter) {
    const filterDate = new Date(dateFilter);
    notesList = notesList.filter(([dateKey]) => {
      const noteDate = parseISO(dateKey);
      return startOfDay(noteDate).getTime() === startOfDay(filterDate).getTime();
    });
  }

  if (notesList.length === 0) {
    return (
      <div className="space-y-4">
        <div className="glass-panel p-4">
          <div className="flex flex-col sm:flex-row gap-3">
            <div className="relative flex-1">
              <Search className="w-4 h-4 absolute left-3 top-1/2 -translate-y-1/2 text-text-secondary" />
              <input
                type="text"
                value={searchQuery}
                onChange={(e) => setSearchQuery(e.target.value)}
                placeholder="Search by title, content, or tags..."
                className="w-full bg-bg-hover border border-border-color rounded-md py-2 pl-9 pr-3 text-sm focus:outline-none focus:border-brand transition-colors"
              />
            </div>
            <div className="relative flex items-center gap-2">
              <Filter className="w-4 h-4 text-text-secondary" />
              <input
                type="date"
                value={dateFilter}
                onChange={(e) => setDateFilter(e.target.value)}
                className="bg-bg-hover border border-border-color rounded-md py-2 px-3 text-sm focus:outline-none focus:border-brand transition-colors"
              />
              {dateFilter && (
                <button
                  onClick={() => setDateFilter('')}
                  className="p-1 hover:bg-bg-hover rounded transition-colors"
                  title="Clear date filter"
                >
                  <X className="w-4 h-4 text-text-secondary" />
                </button>
              )}
            </div>
          </div>
        </div>
        <div className="glass-panel p-8 text-center text-text-secondary">
          {searchQuery || dateFilter ? 'No notes match your filters.' : 'No notes yet. Start writing in the calendar!'}
        </div>
      </div>
    );
  }

  return (
    <div className="space-y-4">
      <div className="glass-panel p-4">
        <div className="flex flex-col sm:flex-row gap-3">
          <div className="relative flex-1">
            <Search className="w-4 h-4 absolute left-3 top-1/2 -translate-y-1/2 text-text-secondary" />
            <input
              type="text"
              value={searchQuery}
              onChange={(e) => setSearchQuery(e.target.value)}
              placeholder="Search by title, content, or tags..."
              className="w-full bg-bg-hover border border-border-color rounded-md py-2 pl-9 pr-3 text-sm focus:outline-none focus:border-brand transition-colors"
            />
          </div>
          <div className="relative flex items-center gap-2">
            <Filter className="w-4 h-4 text-text-secondary" />
            <input
              type="date"
              value={dateFilter}
              onChange={(e) => setDateFilter(e.target.value)}
              className="bg-bg-hover border border-border-color rounded-md py-2 px-3 text-sm focus:outline-none focus:border-brand transition-colors"
            />
            {dateFilter && (
              <button
                onClick={() => setDateFilter('')}
                className="p-1 hover:bg-bg-hover rounded transition-colors"
                title="Clear date filter"
              >
                <X className="w-4 h-4 text-text-secondary" />
              </button>
            )}
          </div>
        </div>
      </div>
      {notesList.map(([dateKey, note]) => {
        const isExpanded = expandedNote === dateKey;
        const date = parseISO(dateKey);
        const formattedDate = format(date, 'EEEE, MMMM do, yyyy');

        return (
          <div key={dateKey} className="glass-panel overflow-hidden">
            <button
              onClick={() => setExpandedNote(isExpanded ? null : dateKey)}
              className="w-full flex items-center justify-between p-6 hover:bg-bg-hover transition-colors text-left"
            >
              <div className="flex-1">
                <h3 className="text-xl font-semibold mb-1">
                  {note.title || 'Untitled Note'}
                </h3>
                <p className="text-sm text-text-secondary">{formattedDate}</p>
                {note.tags && note.tags.length > 0 && (
                  <div className="flex flex-wrap gap-2 mt-2">
                    {note.tags.map(tag => (
                      <span key={tag} className="px-2 py-0.5 bg-bg-hover text-xs rounded-full">
                        {tag}
                      </span>
                    ))}
                  </div>
                )}
              </div>
              {isExpanded ? (
                <ChevronDown className="w-5 h-5 text-text-secondary" />
              ) : (
                <ChevronRight className="w-5 h-5 text-text-secondary" />
              )}
            </button>

            {isExpanded && (
              <div className="px-6 pb-6 border-t border-border-color pt-6 animate-in fade-in slide-in-from-top-2 duration-300">
                <div className="prose prose-invert max-w-none">
                  <p className="text-lg leading-relaxed whitespace-pre-wrap">
                    {note.content || 'No content'}
                  </p>
                </div>
              </div>
            )}
          </div>
        );
      })}
    </div>
  );
}

function App() {
  const { user, loading: authLoading } = useAuth();
  const {
    selectedDate,
    setSelectedDate,
    getStreak,
    dataLoaded
  } = useStore();

  const [currentView, setCurrentView] = useState('calendar'); // 'calendar', 'notes'

  // Show loading while checking auth
  if (authLoading) {
    return (
      <div className="flex items-center justify-center h-screen w-screen bg-bg-main">
        <Loader2 className="w-8 h-8 animate-spin text-brand" />
      </div>
    );
  }

  // Show auth page if not logged in
  if (!user) {
    return <AuthPage />;
  }

  // Show loading while fetching data
  if (!dataLoaded) {
    return (
      <div className="flex items-center justify-center h-screen w-screen bg-bg-main">
        <div className="text-center">
          <Loader2 className="w-8 h-8 animate-spin text-brand mx-auto mb-4" />
          <p className="text-text-secondary text-sm">Loading your notes...</p>
        </div>
      </div>
    );
  }

  return (
    <div className="flex bg-bg-main text-text-primary h-screen w-screen overflow-hidden dark">
      <Sidebar
        currentView={currentView}
        setCurrentView={setCurrentView}
        streak={getStreak()}
      />

      <main className="flex-1 overflow-y-auto relative p-8 md:p-12">
        {currentView === 'dashboard' && (
          <div className="max-w-5xl mx-auto animate-in fade-in slide-in-from-bottom-4 duration-500">
            <header className="mb-8">
              <h1 className="text-3xl font-bold tracking-tight">Dashboard</h1>
              <p className="text-text-secondary mt-2">Track your progress and activity.</p>
            </header>
            <Dashboard />
          </div>
        )}

        {currentView === 'calendar' && (
          <div className="max-w-5xl mx-auto animate-in fade-in slide-in-from-bottom-4 duration-500">
            <header className="mb-8">
              <h1 className="text-3xl font-bold tracking-tight">Calendar Journal</h1>
            </header>

            <Calendar
              selectedDate={selectedDate}
              onSelectDate={setSelectedDate}
            />

            {selectedDate && (
              <div className="mt-8 animate-in fade-in slide-in-from-bottom-4 duration-500">
                <DayWorkspace date={selectedDate} onClose={() => setSelectedDate(null)} />
              </div>
            )}
          </div>
        )}

        {currentView === 'notes' && (
          <div className="max-w-5xl mx-auto animate-in fade-in slide-in-from-bottom-4 duration-500">
            <header className="mb-8">
              <h1 className="text-3xl font-bold tracking-tight">All Notes</h1>
              <p className="text-text-secondary mt-2">Browse your recent journal entries.</p>
            </header>
            <AllNotesView />
          </div>
        )}
      </main>
    </div>
  );
}

export default App;
