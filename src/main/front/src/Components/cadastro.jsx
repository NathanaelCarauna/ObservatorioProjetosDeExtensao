export const Cadastro = (props) => {
    return (
        <div id='about'>
            <div className="container" id='formulario'>
                <div className="conteudo">
                    <form className="formulario">
                        <label className="texto">Cadastro</label>
                        <label id='legenda' for="username">Usuario</label>
                        <input type="text" name="username" id="Usuario" placeholder="escreva seu usuario" />
                        <label id='legenda' for="email">Email</label>
                        <input type="email" name="email" id="Email" placeholder="escreva seu email" />
                        <label id='legenda' for="pwd">Senha</label>
                        <input type="password" id="pwd" name="pwd" placeholder="escreva sua senha" />
                    </form>
                    <div className='botoes'>
                        <button className="botao" > Cadastrar </button>{' '}
                        <a href='/login' className="botao" id='login'  > Login </a>{' '}
                    </div>
                </div>
            </div>

        </div>
    );
};
