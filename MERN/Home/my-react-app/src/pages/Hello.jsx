import React, { useState } from 'react';


export default function Hello(props){
    // const name="Kaustubh"
    const [name,setName]=useState("Kaustubh")
    return(
        <>
        <h1>Hello World</h1>
        <h2>My name is {name}</h2>
        <button onClick={()=>setName("abcd")}>change name</button>
      

        </>
    )
}