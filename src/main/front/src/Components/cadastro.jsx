export const Cadastro = (props) => {
    return (
        <div id='about'>
            <div className="container">
                <div className="conteudo">
                    <form className="formulario">
                        <legend className="texto">Cadastro</legend>
                        <label className="label" for="email">Email</label>
                        <input type="email" name="email" id="Email" placeholder="escreva seu email" />
                        <label className="label" for="password">Senha</label>
                        <input type="password" name="password" id="Password" placeholder="escreva sua senha" />

                        <legend className="texto">Tipo de Usuario</legend>
                        <label className="texto" check>
                            <input type="radio" name="tipo" />{' '}
                            Psicologo
                        </label>

                        <label className="texto" check>
                            <input type="radio" name="tipo" />{' '}
                            Paciente
                        </label>
                    </form>
                </div>
                <div className="botoes">
                    <button className="botao" size="lg" > Cadastrar </button>{' '}
                </div>
            </div>

        </div>
    );
};
