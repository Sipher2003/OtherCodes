import React from 'react';

function Alert() {

    const myfunc = () => {
        alert("Thanks for clicking")
    }
    return (

        <div>
            <button onClick={myfunc} >click me</button>
        </div>
    );
}

export default Alert;