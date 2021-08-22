package application.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
	@Lob
	@Column
	private String resumo;
	@Lob
	@Column
	private String introducao;
	@Lob
	@Column
	private String justificativa;
	@Lob
	@Column
	private String objetivos;
	@Lob
	@Column
	private String metas;
	@Lob
	@Column
	private String indicadores;
	@Lob
	@Column
	private String metodologia;
	private int qtdBeneficiados;
	@Lob
	@Column
	private String relacaoAtividadePesquisa;
	@Lob
	@Column
	private String avaliacaoPeloPublico;
	private String produtoFinal;
	private double orcamento;
	@Lob
	@Column
	private String referencias;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "projeto")
	private List<Participacao> participantes;
	private SituacaoEnum situacao;
}
