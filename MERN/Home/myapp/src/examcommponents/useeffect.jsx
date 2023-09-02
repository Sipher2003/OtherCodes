import ReactDOM from 'react-dom'

import React, { useEffect, useState } from 'react'

export default function Useeffect() {

    // const [num, setnum] = useState(0);

    // useEffect(() => {
    //     setTimeout(() => {
    //         setnum(num + 1)
    //     }, 1000)
    // },
    // [])

    // return (
    //     <div>
    //         <h1>the num is {num}</h1>
    //     </div>
    // )


    // const [num, setnum] = useState(0);
    // const [calc, setcalc] = useState(0);


    // useEffect(() => {
    //     setcalc(num * 2)
    // },
    //     [num]
    // )

    // return (
    //     <div>
    //         <h1>the num is {num}</h1>
    //         <button onClick={() => setnum(num+1)}>inc</button>
    //         <h1>The multiply is {calc}</h1>
    //     </div>
    // )

    const [message, setMessage] = useState('Hi there, how are you?');
    useEffect(() => {
        console.log('trigger use effect hook');
        setTimeout(() => {
            setMessage("I'm fine, thanks for asking.");
        }, 1000)
    })
    return <h1>{message}</h1>

}
