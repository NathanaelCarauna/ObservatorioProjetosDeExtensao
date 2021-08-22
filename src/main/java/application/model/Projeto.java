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
import application.model.enums.ProjetoCategoria;
import application.model.enums.SituacaoEnum;
import lombok.Data;

@Entity
@Data
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String titulo;
	private EditalEnum edital;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "projeto")
	private List<Participacao> participantes;
	private ProjetoCategoria categoria;
	private SituacaoEnum situacao;
	private Date dataDeInicio;
	private Date dataDeConclusao;
}
