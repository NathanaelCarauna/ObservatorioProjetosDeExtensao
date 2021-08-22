import './App.css';
import {Navigation} from './Components/navigation'
import { Header } from './Components/header';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import { About } from './Components/about';
import Projetos from './Components/projetos';
import Estatistica from './Components/estatistica';
import Cadastro from './Components/cadastro';
import Perfil from './Components/perfil';


const App = () => {
  return (
    <Router>
    <div>
      <Navigation />
      <Switch>
        <Route path='/' exact component={Header} ></Route>
        <Route path='/sobre' component={About}></Route>
        <Route path='/projetos' component={Projetos}></Route>
        <Route path='/estatisticas' component={Estatistica}></Route>
        <Route path='/cadastro' component={Cadastro}></Route>
        <Route path='/perfil' component={Perfil}></Route>
      </Switch>
    </div>
    </Router>
    
  );
};

export default App;
