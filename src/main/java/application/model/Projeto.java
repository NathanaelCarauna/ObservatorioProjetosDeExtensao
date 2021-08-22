package application.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import application.model.enums.EditalEnum;
import application.model.enums.ModalidadeEnum;
import application.model.enums.SituacaoEnum;
import lombok.Data;

@Entity
@Data
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String titulo;
	private String campus;
	private int cargaHorariaTotal;
	private Date dataDeInicio;
	private Date dataDeConclusao;
	private String diasDaSemana;
	private String publicoAlvo;
	private String parcerias;
	private String linhaDeExtensão;
	private String areaTematica;
	private EditalEnum edital;
	private ModalidadeEnum modalidade;
	private String resumo;
	private String introducao;
	private String justificativa;
	private String objetivos;
	private String metas;
	private String indicadores;
	private String metodologia;
	private int qtdBeneficiados;
	private String relacaoAtividadePesquisa;
	private String avaliacaoPeloPublico;
	private String produtoFinal;
	private double orcamento;
	private String referencias;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "projeto")
	private List<Participacao> participantes;
	private SituacaoEnum situacao;
}
