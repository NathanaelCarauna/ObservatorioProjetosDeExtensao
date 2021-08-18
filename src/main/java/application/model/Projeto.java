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

import application.model.enums.ProjetoCategoria;
import lombok.Data;

@Entity
@Data
public class Projeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "projeto")	
	private List<Participacao> participantes;
	private ProjetoCategoria categoria;
	private Date dataDeInicio;
	private Date dataDeConclusao;
}
