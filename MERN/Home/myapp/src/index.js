import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import First from './components/class';
import Courses from './components/courses';


const rootElement = (
  <div>
   <App />
  </div>
);

ReactDOM.render(rootElement, document.getElementById('root'));