import ReactDOM from 'react-dom'
import React, { useEffect, useState } from 'react'


export default function Hooks() {

    const [num,setnum] = useState(0);
    const [status,setstatus] = useState();
    

    const increment=()=>{
      setnum(num+1);
      setstatus(num%2==0?"odd":"even")
    }


    return (
        <div>
            <h1>The number is {num} and its {status} number</h1>
            <button type="submit" onClick={increment}>Increment</button>
        </div>
    )
}
