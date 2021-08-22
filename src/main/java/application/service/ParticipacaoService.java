package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.dto.Participacao;
import application.model.Projeto;
import application.model.Usuario;
import application.repository.IProjetoDAO;
import application.repository.IUsuarioDAO;
import javassist.NotFoundException;

@Service
public class ParticipacaoService {

	@Autowired
	private IProjetoDAO projetoDao;
	@Autowired
	private IUsuarioDAO usuarioDao;
	@Autowired
	private ProjetoService projetoService;
	@Autowired
	private UsuarioService usuarioService;

//	public List<Projeto> getProjetosByUsuarioId(long id) throws NotFoundException{
//		Optional<List<Projeto>> byUsuarios = projetoDao.getByUsuarioID(id);
//		if(!byUsuarios.isPresent()) {
//			throw new NotFoundException("Projetos não encontrados");
//		}
//		return  byUsuarios.get();
//	}
	
	public Projeto addParticipante(Participacao participacao) throws NotFoundException {
		Projeto projeto = projetoService.getById(participacao.getProjeto_id());
		if (projeto == null) {
			throw new NotFoundException("Projeto não encontrado");
		}
		Usuario user = usuarioService.getById(participacao.getUsuario_id());
		if (user == null) {
			throw new NotFoundException("Usuario não encontrado");
		}
		projeto.addUser(user);
		user.addProject(projeto);
		projetoDao.save(projeto);
		usuarioDao.save(user);
		return projeto;
	}
}
