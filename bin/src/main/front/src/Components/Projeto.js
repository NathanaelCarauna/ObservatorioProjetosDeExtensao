import React, { useEffect, useState } from "react";
import ReactDOM from 'react-dom';

export default ({match}) => {
    useEffect(() => {        
        getProjeto(match.params.id);
    }, [])

    const [projeto, setProjeto] = useState({});

    const getProjeto = (id) => {
        fetch(`http://localhost:8080/api/projetos/${id}`)
            .then(async response => {
                const data = await response.json();

                // check for error response
                if (!response.ok) {
                    // get error message from body or default to response statusText
                    const error = (data && data.message) || response.statusText;
                    return Promise.reject(error);
                }
                setProjeto(data);
            })
    }

    return (
        <div id="about">
            ? <h1>{projeto.titulo}</h1>
            <div name="campus">
                <h3> Campus</h3>
                <p>{projeto.campus}</p>
            </div>
            <div name="cargaHorariaTotal">
                <h3>Carga horária total</h3>
                <p>{projeto.cargaHorariaTotal}</p>
            </div>
        </div>
    );
}