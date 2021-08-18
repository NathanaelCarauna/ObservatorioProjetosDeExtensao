package application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import application.model.enums.TipoUsuario;
import lombok.Data;

@Entity
@Data
public class Participante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Usuario usuario;
	private TipoUsuario tipo;

	public Participante(Usuario usuario, TipoUsuario tipo) {
		super();
		this.usuario = usuario;
		this.tipo = tipo;
	}

}
