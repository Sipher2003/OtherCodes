import React from 'react';
import './Alert.css';

function Alert() {

    const myfunc = () => {
        alert("Thanks for clicking");
    };

    return (
        <div className="alert-container">
            <button className="alert-button" onClick={myfunc}>Click Me</button>
        </div>
    );
}

export default Alert;