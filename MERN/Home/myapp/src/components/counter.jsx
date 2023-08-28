import ReactDOM from 'react-dom'

import React, { Component } from 'react'

export default class Counter extends Component {
    constructor(props) {
        super(props);
        this.state = {
            counter: 0
        }
    }

    increment = () => {
        this.setState({ counter: this.state.counter + 1 })
    }

    render() {
        return (
            <div>
                <h1>The value is {this.state.counter}</h1>
                <button type="submit" onClick={this.increment}>Increase</button>
            </div>
        )
    }
}
