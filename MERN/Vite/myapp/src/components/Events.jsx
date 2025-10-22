import React from 'react';
import './Events.css';

const shoot = () => {
    alert("Good shot bhaiya!");
};

export default function Event() {
    return (
        <div className="event-container">
            <button className="event-button" onClick={shoot}>Take the Shot</button>
        </div>
    );
}

