import ReactDOM from 'react-dom'

import React, { Component } from 'react'

export default class Classprop extends Component {
    constructor(props){
      super(props);
    }
  render() {
    return (
      <div>
       <h2>The name is {this.props.name}</h2>
      </div>
    )
  }
}
