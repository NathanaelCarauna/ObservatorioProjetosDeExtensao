export const CadastrarProjeto = (props) => {
    return (
        <div id='descricao'>
            <div className="container" id='formulario'>
                <div className="conteudoCadastro">
                    <form className="formulario">
                        <label className="texto">Novo Projeto</label>
                        <label id='legenda' for="projectname">Título</label>
                        <textarea rows="3" cols="50" name="projectname" id="novoProjeto" placeholder="Título do projeto" />
                        <label id='legenda' for="campus">Instituição/Campus</label>
                        <textarea  type="text" name="campus" id="campus" placeholder="A qual campus o projeto pertence" />
                        <label id='legenda' for="cargaHoraria">Carga horária</label>
                        <textarea type="number" id="cargaHoraria" name="cargaHoraria" placeholder="Carga horária total do projeto" />
                        <label id='legenda' for="dataInicio">Data de início</label>
                        <textarea type="date" id="dataInicio" name="dataInicio" placeholder="Data de inicio" />
                        <label id='legenda' for="datafinal">Data de conclusão</label>
                        <textarea type="date" id="datafinal" name="datafinal" placeholder="Data de conslusão" />
                        <label id='legenda' for="diasSemana">Dias da semana</label>
                        <textarea type="text" id="diasSemana" name="diasSemana" placeholder="Dias de atividade" />
                        <label id='legenda' for="publicoAlvo">Public alvo</label>
                        <textarea rows="5" cols="50" type="text" id="publicoAlvo" name="publicoAlvo" placeholder="Publico alvo" />
                        <label id='legenda' for="parcerias">Parcerias</label>
                        <textarea rows="5" cols="50" type="text" id="parcerias" name="parcerias" placeholder="Parcerias" />
                        <label id='legenda' for="linhaDeExtensao">Linha de Extensão</label>
                        <textarea rows="5" cols="50" type="text" id="linhaDeExtensao" name="linhaDeExtensao" placeholder="Linha de extensão" />
                        <label  id='legenda' for="areaTematica">Area temática</label>
                        <textarea rows="5" cols="50" type="text" id="areaTematica" name="areaTematica" placeholder="Area temática" />
                        <label id='legenda' for="edital">Edital</label>
                        <textarea type="text" id="edital" name="edital" placeholder="Edital" />
                        <label id='legenda' for="modalidade">Modalidade</label>
                        <textarea rows="5" cols="50" type="text" id="modalidade" name="modalidade" placeholder="Modalidade" />
                        <label id='legenda' for="resumo">Resumo</label>
                        <textarea rows="10" cols="50" type="text" id="resumo" name="resumo" placeholder="Resumo" />
                        <label id='legenda' for="introducao">Introducão</label>
                        <textarea rows="10" cols="50" className='longa' type="text" id="introducao" name="introducao" placeholder="Introdução" />
                        <label id='legenda' for="justificativa">Justificativa</label>
                        <textarea rows="10" cols="50" type="text" id="justificativa" name="justificativa" placeholder="Justificativa" />
                        <label id='legenda' for="objetivos">Objetivos</label>
                        <textarea rows="10" cols="50" type="text" id="objetivos" name="objetivos" placeholder="Objetivos" />
                        <label id='legenda' for="metas">Metas</label>
                        <textarea rows="10" cols="50" type="text" id="metas" name="metas" placeholder="Metas" />
                        <label id='legenda' for="indicadores">Indicadores</label>
                        <textarea type="text" id="indicadores" name="indicadores" placeholder="Indicadores" />
                        <label id='legenda' for="metodologia">Metodologia</label>
                        <textarea rows="10" cols="50" type="text" id="metodologia" name="metodologia" placeholder="Metodologia" />
                        <label id='legenda' for="qtdBeneficiados">Quantidade de beneficiados</label>
                        <input  type="number" id="qtdBeneficiados" name="qtdBeneficiados" placeholder="Quantidade de beneficiados" />
                        <label id='legenda' for="relacaoAtividadePesquisa">Relacão da atividade com a pesquisa</label>
                        <textarea rows="10" cols="50" type="text" id="relacaoAtividadePesquisa" name="relacaoAtividadePesquisa"
                            placeholder="Relacão da atividade com a pesquisa" />
                        <label id='legenda' for="avaliacaoPeloPublico">Forma de avalição pelo público</label>
                        <textarea rows="10" cols="50" id="avaliacaoPeloPublico" name="avaliacaoPeloPublico"
                            placeholder="Forma de avalição pelo público" />
                        <label id='legenda' for="produtoFinal">Produto final</label>
                        <textarea rows="10" cols="50" id="produtoFinal" name="produtoFinal"
                            placeholder="Qual será o produto final" />
                        <label id='legenda' for="orcamento">Orçamento</label>
                        <input type="number" id="orcamento" name="orcamento" placeholder="Orçamento do projeto" />
                        <label id='legenda' for="referencias">Referências bibliográficas</label>
                        <textarea rows="10" cols="50" className='longa' type="text" id="referencias" name="referencias" placeholder="Referências bibliográficas" />


                    </form>
                    <div className='botoes'>
                        <button className="botao" > Cadastrar </button>{' '}
                    </div>
                </div>
            </div>

        </div>
    );
};