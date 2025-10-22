import React, { useState } from 'react';

export default function Changecolor() {
    const [num, setnum] = useState(1);

    return (
        <div>
            <h1>The num is {num}</h1>
            <button 
                onClick={() => setnum(num+1)}
                // style={{ backgroundColor: color, color: "white"}}
            >
                add
            </button>
        </div>
    );
}