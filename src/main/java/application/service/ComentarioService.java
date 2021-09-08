package application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Comentario;
import application.model.Projeto;
import application.repository.IComentarioDAO;
import application.repository.IProjetoDAO;
import javassist.NotFoundException;

@Service
public class ComentarioService {

	@Autowired
	private IComentarioDAO dao;
	@Autowired
	IProjetoDAO projetoDao;
	@Autowired
	private PasswordEncriptionAndDecription encription;

	public List<Comentario> getAll() {
		return dao.findAll();
	}

	public Comentario getById(long id) throws NotFoundException {
		Optional<Comentario> byId = dao.findById(id);
		if (!byId.isPresent()) {
			throw new NotFoundException("Comentario não encontrado");
		}
		return byId.get();
	}

	public List<Comentario> getProjectComentarios(long id) throws NotFoundException {
		Optional<Projeto> byId = projetoDao.findById(id);
		if (!byId.isPresent()) {
			throw new NotFoundException("Comentario não encontrado");
		}
		return byId.get().getComentarios();
	}

	public Comentario createComentario(long id, Comentario comentarioParam) throws NotFoundException {
		Optional<Projeto> findById = projetoDao.findById(id);
		if(!findById.isPresent()) {
			throw new NotFoundException("Projeto não encontrado");
		}
		comentarioParam.setProjeto(findById.get());
		Comentario comentario = dao.save(comentarioParam);
		return comentario;
	}

	public Comentario updateComentario(long id, Comentario comentarioP) throws NotFoundException {
		if (getById(id) == null) {
			throw new NotFoundException("Comentario não encontrado");
		}
		Comentario comentario = dao.save(comentarioP);
		return comentario;
	}

	public Comentario deleteComentario(long id) throws NotFoundException {
		Comentario comentario = getById(id);
		if (comentario == null) {
			throw new NotFoundException("Comentario não encontrado");
		}
		dao.deleteById(id);
		return comentario;
	}

}
