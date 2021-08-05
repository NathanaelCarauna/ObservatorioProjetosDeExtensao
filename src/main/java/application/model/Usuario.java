package application.model;

import java.util.List;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Usuario {	
	private long id;
	private String nome;
	private String sobrenome;
	private String email;
	private String password;
	private List<Projeto> projetos;
	
}
