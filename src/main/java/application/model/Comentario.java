package application.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import application.model.enums.EditalEnum;
import application.model.enums.ModalidadeEnum;
import application.model.enums.SituacaoEnum;
import lombok.Data;

@Entity
@Data
public class Comentario {
	
	private Long id;
	private String nome;
	private String comentario;
	
	@ManyToOne
	private Projeto projeto;

	
	public Comentario(String nome, String comentario) {
		this.nome = nome;
		this.comentario = comentario;
	}

}
