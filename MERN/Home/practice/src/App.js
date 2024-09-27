import logo from './logo.svg';
import './App.css';
import Heading from './component/heading';

const price = 200

function App() {
  return (
    <div className="App">
      <Heading/>
      <h1>hello world</h1>
      <h1>The price is {price}</h1>

    </div>
  );
}

export default App;
