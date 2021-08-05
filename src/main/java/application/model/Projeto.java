package application.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import application.model.enums.ProjetoCategoria;
import lombok.Data;

@Entity
@Data
public class Projeto {
	private long id;
	private List<Participante> participantes;
	private ProjetoCategoria categoria;
	private Date dataDeInicio;
	private Date dataDeConclusao;
}
