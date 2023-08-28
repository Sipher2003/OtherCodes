import ReactDOM from 'react-dom'

import React, { Component } from 'react'

export default class Student extends Component {
    constructor(props) {
        super(props);
        this.state = {
            name: "Kaustubh",
            color: "red"
        }
    }

    changecolor = () => {
        this.setState({ color: "blue",name:"Sipher"})
    }


    render() {
        return (
            <div>
                <h1 style={{ color: this.state.color }}>Name is {this.state.name}</h1>
                <button type="submit" onClick={this.changecolor}>Colour change</button>
            </div>
        )
    }
}

