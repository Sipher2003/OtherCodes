import React from 'react'
import { useState } from 'react'

export default function Counter() {
    const[count,setCount]=useState(0)
    const inc=()=>setCount(count+1)
    const dec=()=>setCount(count-1)
    const res=()=>setCount(0)
  return (
    <div>
     <h1>Counter{count}</h1>
     <button onClick={inc}>Inc</button>
     <button onClick={dec}>dec</button>
     <button onClick={res}>res</button>
    </div>
  )
}
