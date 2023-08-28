import ReactDOM from 'react-dom'
import React, { useState } from 'react'

export default function Hooks2() {

    const [num, updateNum] = useState(1)

    const inc=()=>{
        updateNum(num+1)
    }

    const dec=()=>{
        updateNum(num-1)
    }

    const inc10=()=>{
        updateNum(num+10)
    }

    const reset=()=>{
        updateNum(1)
    }


    return (
        <div>
           <h1>Number is {num}</h1>
           <button type="submit" onClick={inc}>Increment</button>
           <button type="submit" onClick={dec}>Decrement</button>
           <button type="submit" onClick={inc10}>+10</button>
           <button type="submit" onClick={reset}>Reset</button>
        </div>
    )

}
