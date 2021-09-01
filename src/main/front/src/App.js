import './App.css';
import {Navigation} from './Components/navigation'
import { Header } from './Components/header';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import { About } from './Components/about';
import Projetos from './Components/projetos';
import Estatistica from './Components/estatistica';
import Perfil from './Components/perfil';
import { Cadastro } from './Components/cadastro.jsx';
<<<<<<< HEAD
import { Login } from './Components/login.jsx';
=======
import Projeto from './Components/Projeto';
>>>>>>> development


const App = () => {
  return (
    <Router>
    <div>
      <Navigation />
      <Switch>
        <Route path='/' exact component={Header} ></Route>
        <Route path='/sobre' component={About}></Route>
        <Route path='/projetos' exact component={Projetos}></Route>
        <Route path='/projetos/:id' component={Projeto}></Route>
        <Route path='/estatisticas' component={Estatistica}></Route>
        <Route path='/cadastro' component={Cadastro}></Route>
        <Route path='/login' component={Login}></Route>
        <Route path='/perfil' component={Perfil}></Route>
      </Switch>
    </div>
    </Router>
    
  );
};

export default App;
