import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
// import car from './components/Func'
import Car from './components/Func'
import Alert from './components/Alert'

function App() {
  
  return (
    <div>
      {/* <h1>hello world my name is kaustubh</h1> */}
      <Car />
      <Alert />
    </div>
  )
}

export default App
