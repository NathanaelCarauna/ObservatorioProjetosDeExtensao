package application.service;

import java.util.List;

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

	public List<Projeto> getProjetosByUsuarioId(long id) throws NotFoundException{
		Usuario user = usuarioService.getById(id);
		if(user == null) {
			throw new NotFoundException("Usuario não encontrado");
		}
		List<Projeto> projetos = user.getProjetos();
		return  projetos;
	}
	
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
