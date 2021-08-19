import { useState, useEffect } from "react";
import './App.css';
import JsonData from "./data/data.json";
import { Navigation } from './Components/navigation';
import { Header } from './Components/header';
import { About } from './Components/about';
import { Noticias } from "./Components/Noticias";

const App = () => {
  const [landingPageData, setLandingPageData] = useState({});
  useEffect(() => {
    setLandingPageData(JsonData);
  }, []);

  return (
    <div>
      <Navigation />
      <Header data={landingPageData.Header} />
      <Noticias data={landingPageData.Gallery}/>

    </div>
  );
};

export default App;
