package application.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
//	@NotBlank(message = "O campo nome é necessário")
	private String nome;
//	@NotBlank(message = "O campo sobre nome é necessário")
	private String sobrenome;

//	@Email(message = "O email deve ser um email válido")
//	@NotBlank(message = "É necessário um email")
	private String email;

//	@NotBlank(message = "O campo senha é necessário")
	private String password;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)	
	@JsonIgnore
	private List<Projeto> projetos = new ArrayList<Projeto>();

	public void addProject(Projeto projeto) {
		projetos.add(projeto);
	}

	public void removeProject(Projeto projeto) {
		projetos.remove(projeto);
	}
}
