package application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.dto.Participacao;
import application.model.Projeto;
import application.model.Usuario;
import application.repository.IProjetoDAO;
import application.repository.IUsuarioDAO;
import javassist.NotFoundException;

@Service
public class ProjetoService {
	
	@Autowired
	private IProjetoDAO projetoDao;	
	@Autowired IUsuarioDAO usuarioDao;
	
	@Autowired
	UsuarioService usuarioService;
	
	public List<Projeto> getAll() {
		return projetoDao.findAll();
	}

	public Projeto getById(long id) throws NotFoundException {
		Optional<Projeto> byId = projetoDao.findById(id);
		if(!byId.isPresent()) {
			throw new NotFoundException("Projeto não encontrado");
		}
		return byId.get();
	}

	public Projeto createProjeto(Projeto projetoParam) {						
		Projeto projeto = projetoDao.save(projetoParam);	
		return projeto;
	}

	public Projeto updateProjeto(long id, Projeto projetoP) throws NotFoundException {
		if(getById(id) == null) {
			throw new NotFoundException("Projeto não encontrado");
		}		
		Projeto projeto = projetoDao.save(projetoP);
		return projeto;
	}
	
	public Projeto deleteProjeto(long id) throws NotFoundException {
		Projeto projeto = getById(id);
		if(projeto == null) {
			throw new NotFoundException("Projeto não encontrado");
		}

		projetoDao.deleteById(id);
		return projeto;
	}
}
