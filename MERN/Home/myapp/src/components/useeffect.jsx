import { useEffect, useState } from 'react'
import ReactDOM from 'react-dom'
import React from 'react'


export default function Useffect() {

    const[num,setnum]=useState(0);

    useEffect(()=>{
        setTimeout(()=>{
          setnum((num)=>num+1)
        },1000)
    })

    return (
    <div>
        <h1>The number is {num}</h1>
    </div>
  )
}

