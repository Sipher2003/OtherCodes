import logo from './logo.svg';
import './App.css';
import First from './components/class';
import Courses from './components/courses';
import Props from './components/props';
import Car from './components/car';
import Counter from './components/counter';
import Student from './components/student';
import Hooks2 from './components/hooks2';
import Useffect from './components/useeffect';
import Examhook from './examcommponents/hooks';
import Nested2 from './examcommponents/nested';
import Classprop from './examcommponents/classprop';
import Useeffect from './examcommponents/useeffect';
import { BrowserRouter, Routes,Route } from 'react-router-dom';
import Home from './pages/home';
import Blogs from './pages/blogs';
import Contact from './pages/contact';
import Nopage from './pages/nopage';
import Layout from './pages/layout';





function App() {
  return (
    <div className="App">
     {/* <Useffect />
     <Examhook />
     <Nested2 />
    <Classprop name="Kaustubh"/>
    <Useeffect /> */}

    <BrowserRouter>
      <Routes>
      <Route path="/" element={<Layout />}>
          <Route index element={<Home />} />
          <Route path="blogs" element={<Blogs />} />
          <Route path="contact" element={<Contact />} />
          <Route path="*" element={<Nopage />} />
        </Route>
      </Routes>
    </BrowserRouter>
    </div>
  );
}

export default App;
