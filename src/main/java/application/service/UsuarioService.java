package application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Usuario;
import application.repository.UsuarioDAO;
import javassist.NotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDAO dao;
	
	public List<Usuario> getAll() {
		return dao.findAll();
	}

	public Usuario getById(long id) throws NotFoundException {
		Optional<Usuario> byId = dao.findById(id);
		if(!byId.isPresent()) {
			throw new NotFoundException("Usuario não encontrado");
		}
		return byId.get();
	}

	public Usuario createUsuario(Usuario usuarioParam) {
		Usuario usuario = dao.save(usuarioParam);		
		return usuario;
	}

	public Usuario updateUsuario(long id, Usuario usuarioP) throws NotFoundException {
		if(getById(id) == null) {
			throw new NotFoundException("Usuario não encontrado");
		}
		Usuario user = dao.save(usuarioP);
		return user;
	}

	public Usuario deleteUsuario(long id) throws NotFoundException {
		Usuario usuario = getById(id);
		if(usuario == null) {
			throw new NotFoundException("Usuario não encontrado");
		}
		dao.deleteById(id);
		return usuario;
	}

}
