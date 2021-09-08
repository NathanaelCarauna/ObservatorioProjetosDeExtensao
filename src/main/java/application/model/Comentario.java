package application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Comentario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String usuario;
	private String comentario;

	@ManyToOne
	@JsonIgnore
	private Projeto projeto;

	public Comentario(String nome, String comentario) {
		this.usuario = nome;
		this.comentario = comentario;
	}

	public Comentario() {
		super();
	}

}
