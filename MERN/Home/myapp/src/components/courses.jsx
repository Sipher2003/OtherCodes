import ReactDOM from 'react-dom'

import React, { Component } from 'react'

export default class Courses extends Component {
  render() {
    return (
      <div>
        <ul style={{textAlign: 'left', listStylePosition: 'inside'}}>
            <li>Course 1</li>
            <li>Course 2</li>
            <li>Course 3</li>
            <li>Course 4</li>
        </ul>
      </div>
    )
  }
}
