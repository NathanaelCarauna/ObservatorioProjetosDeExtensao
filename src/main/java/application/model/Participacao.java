package application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import application.model.enums.TipoUsuario;
import lombok.Data;

@Entity
@Data
public class Participacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	@JoinColumn(name = "id_usuario")	
	private Usuario usuario;
	
	private TipoUsuario tipo;

	@ManyToOne
	@JoinColumn(name = "id_projeto")	
	private Projeto projeto;	

}
