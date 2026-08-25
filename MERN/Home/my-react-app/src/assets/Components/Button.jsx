import React, { act } from 'react';

export default function Button(){
    const action=(e)=>{
        alert(e)
    }
    return(
<>
<button onClick={()=>action("Button clicked")}>Click me</button>
</>
    )
}