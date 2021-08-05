package application.model;

import javax.persistence.Entity;

import application.model.enums.TipoUsuario;
import lombok.Data;

@Entity
@Data
public class Participante {
	private long id;
	private Usuario usuario;
	private TipoUsuario tipo;

	public Participante(Usuario usuario, TipoUsuario tipo) {
		super();
		this.usuario = usuario;
		this.tipo = tipo;
	}

}
