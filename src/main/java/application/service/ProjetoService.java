package application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Participacao;
import application.model.Projeto;
import application.repository.IParticipacaoDao;
import application.repository.IProjetoDAO;
import javassist.NotFoundException;

@Service
public class ProjetoService {
	
	@Autowired
	private IProjetoDAO projetoDao;
	@Autowired IParticipacaoDao participacaoDao;
	
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
		List<Participacao> participantes = projetoParam.getParticipantes();
		for(Participacao participante : participantes) {
			participacaoDao.save(participante);
		}
		Projeto projeto = projetoDao.save(projetoParam);		
		return projeto;
	}

	public Projeto updateProjeto(long id, Projeto projetoP) throws NotFoundException {
		if(getById(id) == null) {
			throw new NotFoundException("Projeto não encontrado");
		}
		List<Participacao> participantes = projetoP.getParticipantes();
		for(Participacao participante : participantes) {
			participacaoDao.save(participante);
		}
		Projeto user = projetoDao.save(projetoP);
		return user;
	}

	public Projeto deleteProjeto(long id) throws NotFoundException {
		Projeto projeto = getById(id);
		if(projeto == null) {
			throw new NotFoundException("Projeto não encontrado");
		}
		List<Participacao> participantes = projeto.getParticipantes();
		for(Participacao participante : participantes) {
			participacaoDao.delete(participante);
		}
		projetoDao.deleteById(id);
		return projeto;
	}
}
