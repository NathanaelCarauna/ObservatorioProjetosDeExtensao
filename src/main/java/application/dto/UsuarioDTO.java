package application.dto;


import lombok.Data;

@Data
public class UsuarioDTO {
	long id;
	String nome;
	String email;	

	public UsuarioDTO(long id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;		
	}

}
