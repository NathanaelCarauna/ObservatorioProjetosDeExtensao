package application.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import application.model.enums.ProjetoCategoria;
import lombok.Data;

@Entity
@Data
public class Projeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private List<Participante> participantes;
	private ProjetoCategoria categoria;
	private Date dataDeInicio;
	private Date dataDeConclusao;
}
