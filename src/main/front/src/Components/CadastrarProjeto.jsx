export const CadastrarProjeto = (props) => {
    return (
        <div id='descricao'>
            <div className="container" id='formulario'>
                <div className="conteudoCadastro">
                    <form className="formulario">
                        <label className="texto">Novo Projeto</label>
                        <label id='legenda' for="projectname">Título</label>
                        <input type="text" name="projectname" id="novoProjeto" placeholder="Título do projeto" />
                        <label id='legenda' for="campus">Instituição/Campus</label>
                        <input  type="text" name="campus" id="campus" placeholder="A qual campus o projeto pertence" />
                        <label id='legenda' for="cargaHoraria">Carga horária</label>
                        <input type="number" id="cargaHoraria" name="cargaHoraria" placeholder="Carga horária total do projeto" />
                        <label id='legenda' for="dataInicio">Data de início</label>
                        <input type="date" id="dataInicio" name="dataInicio" placeholder="Data de inicio" />
                        <label id='legenda' for="datafinal">Data de conclusão</label>
                        <input type="date" id="datafinal" name="datafinal" placeholder="Data de conslusão" />
                        <label id='legenda' for="diasSemana">Dias da semana</label>
                        <input type="text" id="diasSemana" name="diasSemana" placeholder="Dias de atividade" />
                        <label id='legenda' for="publicoAlvo">Public alvo</label>
                        <input className='medio'type="text" id="publicoAlvo" name="publicoAlvo" placeholder="Publico alvo" />
                        <label id='legenda' for="parcerias">Parcerias</label>
                        <input className='medio' type="text" id="parcerias" name="parcerias" placeholder="Parcerias" />
                        <label id='legenda' for="linhaDeExtensao">Linha de Extensão</label>
                        <input className='medio' type="text" id="linhaDeExtensao" name="linhaDeExtensao" placeholder="Linha de extensão" />
                        <label  id='legenda' for="areaTematica">Area temática</label>
                        <input className='medio' type="text" id="areaTematica" name="areaTematica" placeholder="Area temática" />
                        <label id='legenda' for="edital">Edital</label>
                        <input type="text" id="edital" name="edital" placeholder="Edital" />
                        <label id='legenda' for="modalidade">Modalidade</label>
                        <input className='medio' type="text" id="modalidade" name="modalidade" placeholder="Modalidade" />
                        <label id='legenda' for="resumo">Resumo</label>
                        <input className='longa' type="text" id="resumo" name="resumo" placeholder="Resumo" />
                        <label id='legenda' for="introducao">Introducão</label>
                        <input className='longa' className='longa' type="text" id="introducao" name="introducao" placeholder="Introdução" />
                        <label id='legenda' for="justificativa">Justificativa</label>
                        <input className='longa' type="text" id="justificativa" name="justificativa" placeholder="Justificativa" />
                        <label id='legenda' for="objetivos">Objetivos</label>
                        <input className='longa' type="text" id="objetivos" name="objetivos" placeholder="Objetivos" />
                        <label id='legenda' for="metas">Metas</label>
                        <input className='longa' type="text" id="metas" name="metas" placeholder="Metas" />
                        <label id='legenda' for="indicadores">Indicadores</label>
                        <input type="text" id="indicadores" name="indicadores" placeholder="Indicadores" />
                        <label id='legenda' for="metodologia">Metodologia</label>
                        <input className='longa' type="text" id="metodologia" name="metodologia" placeholder="Metodologia" />
                        <label id='legenda' for="qtdBeneficiados">Quantidade de beneficiados</label>
                        <input  type="text" id="qtdBeneficiados" name="qtdBeneficiados" placeholder="Quantidade de beneficiados" />
                        <label id='legenda' for="relacaoAtividadePesquisa">Relacão da atividade com a pesquisa</label>
                        <input className='longa' type="text" id="relacaoAtividadePesquisa" name="relacaoAtividadePesquisa"
                            placeholder="Relacão da atividade com a pesquisa" />
                        <label id='legenda' for="avaliacaoPeloPublico">Forma de avalição pelo público</label>
                        <input type="text" id="avaliacaoPeloPublico" name="avaliacaoPeloPublico"
                            placeholder="Forma de avalição pelo público" />
                        <label id='legenda' for="produtoFinal">Produto final</label>
                        <input className='longa' type="text" id="produtoFinal" name="produtoFinal"
                            placeholder="Qual será o produto final" />
                        <label id='legenda' for="orcamento">Orçamento</label>
                        <input type="number" id="orcamento" name="orcamento" placeholder="Orçamento do projeto" />
                        <label id='legenda' for="referencias">Referências bibliográficas</label>
                        <input className='longa' type="text" id="referencias" name="referencias" placeholder="Referências bibliográficas" />


                    </form>
                    <div className='botoes'>
                        <button className="botao" > Cadastrar </button>{' '}
                    </div>
                </div>
            </div>

        </div>
    );
};