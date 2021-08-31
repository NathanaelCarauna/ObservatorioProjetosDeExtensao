export const Cadastro = (props) => {
    return (
        <div id='about'>
            <div className="container" id='formulario'>
                <div className="conteudo">
                    <form className="formulario">
                        <label className="texto">Cadastro</label>
                        <label id='legenda' for="email">Email</label>
                        <input type="email" name="email" id="Email" placeholder="escreva seu email" />
                        <label id='legenda' for="password">Senha</label>
                        <input type="password" name="password" id="Password" placeholder="escreva sua senha" />
                    </form>
                    <button className="botao" > Cadastrar </button>{' '}
                <a href='/login' className="botao" id='login'  > Login </a>{' '}
                </div>
            </div>

        </div>
    );
};
