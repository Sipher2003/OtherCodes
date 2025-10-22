import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
// import car from './components/Func'
import Car from './components/Func'
import Alert from './components/Alert'
import Props from './components/Prop'
import Event from './components/Events'
import Event2 from './components/Event2'
import Event3 from './components/Event3'
import Check from './components/Cond'
import Maping from './components/Mapping'
import Changecolor from './components/Hooks'


function App() {
  
  return (
    <div>
      {/* <h1>hello world my name is kaustubh</h1> */}
      <Car />
      <Alert />
      <Props name={carinfo.name} age={carinfo.age} />
      <Event />
      <Event2 />
      <Event3 />
      <Check isgoal={true} />
      <Maping />
      <Changecolor />
    </div>
  )
}

const carinfo={
  name:"Ford",
  age:21
}

export default App
