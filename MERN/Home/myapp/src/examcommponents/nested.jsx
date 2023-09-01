import ReactDOM from 'react-dom'


import React from 'react'

function Nested() {
  return (
    <div>
        <h2>This is a nested function</h2>
    </div>
  )
}


export default function Nested2() {
  return (
    <div>
        <Nested />
    </div>
  )
}

