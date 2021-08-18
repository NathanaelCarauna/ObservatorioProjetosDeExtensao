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
	@JsonIgnore
	private Usuario usuario;
	
	private TipoUsuario tipo;

	@ManyToOne
	@JoinColumn(name = "id_projeto")
	@JsonIgnore
	private Projeto projeto;

	public Participacao(Usuario usuario, TipoUsuario tipo) {
		super();
		this.usuario = usuario;
		this.tipo = tipo;
	}

}
