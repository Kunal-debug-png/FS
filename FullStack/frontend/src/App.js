import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navbar from './layout/navbar';
import Home from './pages/Home';
import { BrowserRouter as Router,Routes,Route } from 'react-router-dom';
import AddUser from './users/AddUser';
export default function App() {
  return (
    <div className="App">
      <Router>
      <Navbar></Navbar>
      <Routes>
        <Route exact path="/" element={<Home></Home>}/>
        <Route exact path="/adduser" element={<AddUser/>}/>
      </Routes>
      
      </Router>
      
    </div>
  );
}


