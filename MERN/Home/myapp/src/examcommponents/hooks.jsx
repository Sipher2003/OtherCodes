import ReactDOM from 'react-dom'
import React, { useState } from 'react'


let str='neither';

export default function Examhook() {

  const [num,setnum]=useState(0)
  const [col,setcol]=useState("blue")
  const [stat,setstat]=useState(str)


  const changenum=()=>{
    setnum(num+1)
    setstat((num%2==0)?"odd":"even")
  }

  const changecol=()=>{
    setcol("red")
  }

  function handleClick() {
    changenum();
    changecol();
  }



  return (
    <div>
        <h1 style={{color:col}}>The number is {num} and colour is {col} and status is {stat}</h1>
        {/* <button type="submit" onClick={changenum}>inc</button> */}
        <button type="submit" onClick={handleClick}>change</button>
    </div>
  )
}
