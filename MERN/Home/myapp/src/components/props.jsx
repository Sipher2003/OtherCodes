import ReactDOM from 'react-dom'


import React from 'react'

export default function Props(props) {
  return (
    <div>
        
       <h1>Welcome {props.name}. Your age is {props.age}</h1>   
       <h2> Your college is {props.class}</h2>
    </div>
  )
}
