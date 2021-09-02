package application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.dto.AccountDTO;
import application.dto.UsuarioDTO;
import application.model.Usuario;
import application.repository.IUsuarioDAO;
import javassist.NotFoundException;

@Service
public class LoginService {

	@Autowired
	IUsuarioDAO usuarioDAO;
	@Autowired
	UsuarioService usuariosService;
	@Autowired
	PasswordEncriptionAndDecription encription;
	
	public UsuarioDTO login(AccountDTO account) throws NotFoundException {
		String email = account.getEmail();
		String pass = encription.encode(account.getPassword());
		Optional<Usuario> usuario = usuarioDAO.findByEmail(email);
		if(usuario.isPresent()) {
			if(usuario.get().getEmail().equals(email) && usuario.get().getPassword().equals(pass)) {
				return new UsuarioDTO(usuario.get().getId(), usuario.get().getNome(), usuario.get().getEmail());
			}
		}		
		throw new NotFoundException("Email ou senha inválidos");
	}

}
