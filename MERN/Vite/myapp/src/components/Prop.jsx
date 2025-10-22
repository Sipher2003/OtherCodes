import React from 'react';
import './Prop.css';


function Props(props) {
    return (
        <div className="props-card">
            <h1 className="props-title">The name is {props.name} and the age is {props.age}</h1>
        </div>
    );
}

export default Props;