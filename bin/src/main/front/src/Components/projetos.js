import '../App.css'
import React, { useEffect, useState } from "react";
import ReactDOM from 'react-dom';
import { Link } from "react-router-dom";


function Projetos(){
    useEffect(() => {
        getProjetos();
    }, [])

    const [projetos, setProjetos] = useState([]);

    const getProjetos = () => {
        fetch('http://localhost:8080/api/projetos')
            .then(async response => {
                const data = await response.json();

                // check for error response
                if (!response.ok) {
                    // get error message from body or default to response statusText
                    const error = (data && data.message) || response.statusText;
                    return Promise.reject(error);
                }
                console.log(data);
                setProjetos(data);
            })
    }

    return (
        <div id="about">
            <h1>Projetos</h1>
            {projetos.map(projeto => (                
                <Link to={`/projetos/${projeto.id}`}>
                    <div key={projeto.id}>
                        <h3>{projeto.titulo}</h3>
                    </div>
                </Link>
            ))}
        </div>
    )
}

export default Projetos;
