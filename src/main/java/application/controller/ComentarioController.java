package application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.Comentario;
import application.service.ComentarioService;
import javassist.NotFoundException;

@Controller
@RequestMapping("/api/comentario")
public class ComentarioController {

	@Autowired
	private ComentarioService service;
	
	@GetMapping
	public ResponseEntity<List<Comentario>> getAll(){
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Comentario> getById(@PathVariable long id) throws NotFoundException{
		Comentario comentario;
		comentario = service.getById(id);
		return ResponseEntity.ok(comentario);
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<Comentario> createComentario(@PathVariable long id, @Valid @RequestBody Comentario comentarioParam) throws NotFoundException{
		Comentario comentario = service.createComentario(id, comentarioParam);
		return ResponseEntity.ok(comentario);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Comentario> updateComentario(@PathVariable long id, @RequestBody Comentario comentarioP){
		Comentario comentario;
		try {
			comentario = service.updateComentario(id, comentarioP);
			return ResponseEntity.ok(comentario);
		} catch (NotFoundException e) {
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Comentario> deleteComentario(@PathVariable long id){
		Comentario comentario;
		try {
			comentario = service.deleteComentario(id);
			return ResponseEntity.ok(comentario);
		} catch (NotFoundException e) {
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
	}
	
}
