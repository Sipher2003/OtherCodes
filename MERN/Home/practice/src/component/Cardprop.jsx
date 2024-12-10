import React from 'react'

export default function Cardprop({src,title,dec}) {
  return (
    <div style={{border:'4px solid #ccc',maxWidth:"300px"}}>

        <img src={src} alt={dec} style={{width:"100%"}} />
        <h1>{title}</h1>
        <h5>{dec}</h5>

    </div>
  )
}
