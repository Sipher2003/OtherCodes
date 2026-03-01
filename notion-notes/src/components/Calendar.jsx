import { useState } from 'react';
import {
    format,
    addMonths,
    subMonths,
    startOfMonth,
    endOfMonth,
    startOfWeek,
    endOfWeek,
    isSameMonth,
    isSameDay,
    addDays,
    isToday
} from 'date-fns';
import { ChevronLeft, ChevronRight } from 'lucide-react';
import useStore from '../hooks/useStore';

export default function Calendar({ selectedDate, onSelectDate }) {
    const [currentMonth, setCurrentMonth] = useState(new Date());

    // Directly access store to show note indicators
    const store = useStore();
    const getDailyStatus = (date) => {
        const key = format(date, 'yyyy-MM-dd');
        const hasNote = store.notes[key] && store.notes[key].content.trim().length > 0;
        const hasTodos = store.todos[key] && store.todos[key].length > 0;
        return { hasNote, hasTodos };
    };

    const nextMonth = () => setCurrentMonth(addMonths(currentMonth, 1));
    const prevMonth = () => setCurrentMonth(subMonths(currentMonth, 1));
    const goToToday = () => {
        const today = new Date();
        setCurrentMonth(today);
        onSelectDate(today);
    };

    const renderHeader = () => {
        return (
            <div className="flex justify-between items-center mb-6">
                <h2 className="text-xl font-semibold">
                    {format(currentMonth, 'MMMM yyyy')}
                </h2>
                <div className="flex items-center gap-2">
                    <button
                        onClick={goToToday}
                        className="px-3 py-1.5 text-sm border border-border-color rounded-md hover:bg-bg-hover transition-colors"
                    >
                        Today
                    </button>
                    <div className="flex items-center border border-border-color rounded-md overflow-hidden">
                        <button onClick={prevMonth} className="p-1.5 hover:bg-bg-hover transition-colors"><ChevronLeft className="w-5 h-5" /></button>
                        <div className="w-px h-5 bg-border-color"></div>
                        <button onClick={nextMonth} className="p-1.5 hover:bg-bg-hover transition-colors"><ChevronRight className="w-5 h-5" /></button>
                    </div>
                </div>
            </div>
        );
    };

    const renderDaysOfWeek = () => {
        const days = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
        return (
            <div className="grid grid-cols-7 mb-2">
                {days.map((day, i) => (
                    <div key={i} className="text-center text-xs font-semibold text-text-secondary uppercase tracking-wider py-2">
                        {day}
                    </div>
                ))}
            </div>
        );
    };

    const renderCells = () => {
        const monthStart = startOfMonth(currentMonth);
        const monthEnd = endOfMonth(monthStart);
        const startDate = startOfWeek(monthStart);
        const endDate = endOfWeek(monthEnd);

        const rows = [];
        let days = [];
        let day = startDate;
        let formattedDate = '';

        while (day <= endDate) {
            for (let i = 0; i < 7; i++) {
                formattedDate = format(day, 'd');
                const cloneDay = day;

                const isCurrentMonth = isSameMonth(day, monthStart);
                const isSelected = selectedDate && isSameDay(day, selectedDate);
                const isCurrentDay = isToday(day);
                const isPastDate = cloneDay < new Date(new Date().setHours(0, 0, 0, 0));
                const { hasNote, hasTodos } = getDailyStatus(day);

                days.push(
                    <div
                        key={day.toString()}
                        onClick={() => !isPastDate && onSelectDate(cloneDay)}
                        className={`
              relative flex flex-col items-center justify-center p-2 min-h-[80px] border border-border-color/50 transition-all duration-200
              ${isPastDate ? 'cursor-not-allowed opacity-40 bg-bg-main' : 'cursor-pointer'}
              ${!isCurrentMonth ? 'text-text-secondary/30 bg-bg-main' : 'bg-bg-card'}
              ${!isPastDate && isCurrentMonth ? 'hover:bg-bg-hover' : ''}
              ${isSelected ? 'bg-brand/10 border-brand/50 ring-1 ring-brand/50 z-10' : ''}
              ${isCurrentDay && !isSelected ? 'font-bold text-brand border-brand/30' : ''}
            `}
                    >
                        <span className={`text-sm ${isCurrentDay ? 'bg-brand text-white w-6 h-6 rounded-full flex items-center justify-center' : ''}`}>
                            {formattedDate}
                        </span>

                        <div className="absolute bottom-2 flex gap-1">
                            {hasNote && <div className="w-1.5 h-1.5 rounded-full bg-brand"></div>}
                            {hasTodos && <div className="w-1.5 h-1.5 rounded-full bg-success"></div>}
                        </div>
                    </div>
                );
                day = addDays(day, 1);
            }
            rows.push(
                <div className="grid grid-cols-7 gap-0" key={day.toString()}>
                    {days}
                </div>
            );
            days = [];
        }
        return <div className="border border-border-color/50 rounded-lg overflow-hidden bg-bg-card">{rows}</div>;
    };

    return (
        <div className="glass-panel p-6 mb-8">
            {renderHeader()}
            {renderDaysOfWeek()}
            {renderCells()}
        </div>
    );
}
