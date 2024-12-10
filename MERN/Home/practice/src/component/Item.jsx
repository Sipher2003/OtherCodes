import React, { Component } from 'react'

export default class Item extends Component {
  render() {
    const items=["item1","item2","item3"]
    return (
      <div>
        <ul>
            {items.map((item,index)=>(
                <li key={index}>{item}</li>
            ))}
        </ul>

      </div>
    )
  }
}
