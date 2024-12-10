import logo from './logo.svg';
import './App.css';
import Heading from './component/heading';
import Headingg from './component/headingg';
import Item from './component/Item';
import Cardprop from './component/Cardprop';
import Counter from './component/Counter';


const price = 200

function App() {
  return (
    <div className="App">

      <Headingg />
      <Item />

      <Cardprop
      src="https://i.pinimg.com/736x/6e/be/87/6ebe876e9b42a3ece7eabfd6b1185a87.jpg"
      title="Cards"
      dec="This is a card"
      />

<Counter />
    </div>
  );
}

export default App;
