import React from 'react';
import './App.css';
import {BrowserRouter as Router,Route,Routes,Switch} from 'react-router-dom';
import Footer from './components/Footer';
import  GetAllStudent from './components/GetAllStudent';
import Header from './components/Header';
import CreateStudent from './components/CreateStudent';

function App() {
  return (
   <div>
<Router>

<Header/>
        <div className="container">
          <switch>
            <Routes>
            <Route path="/" exact component={GetAllStudent}></Route>
            <Route path="/students" component={GetAllStudent}></Route>
            <Route path="/add-student" component={CreateStudent}></Route>
           
            </Routes>
            < GetAllStudent/>
         </switch>
         {/* <CreateStudent/> */}
          </div>
        
    <Footer/>
</Router>

    
   </div>

   
  );
}

export default App;
