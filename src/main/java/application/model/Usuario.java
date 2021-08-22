package application.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class Usuario {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotBlank(message = "O campo nome é necessário")
	private String nome;
	@NotBlank(message = "O campo sobre nome é necessário")
	private String sobrenome;
	
	@Email(message = "É necessário um email válido")
	private String email;
	
	@NotBlank(message = "O campo senha é necessário")
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")	
	private List<Participacao> participacao;
	
}
