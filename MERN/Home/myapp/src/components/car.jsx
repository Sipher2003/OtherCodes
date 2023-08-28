import ReactDOM from 'react-dom'

import React, { Component } from 'react'

export default class Car extends Component {
    constructor(props) {
        super(props);
        this.state = {
            brand: 'ford',
            model: "Mustang",
            color: "red",
            year: 1964
        }
    }

    changecolor = () => {
        this.setState({ color: 'blue' })
    }

    render() {
        return (
            <div>
                <h1>Brand name is {this.state.brand}</h1>
                <h1>Model name is {this.state.model}</h1>
                <h1>Colour name is {this.state.color}</h1>
                <h1>Year name is {this.state.year}</h1>
                <button type="submit" onClick={this.changecolor}>Submit</button>
            </div>
        )
    }
}
