package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.dto.Participacao;
import application.model.Projeto;
import application.service.ParticipacaoService;
import javassist.NotFoundException;

@RestController
@RequestMapping("api/participacao")
public class ParticipacaoController {
	
	@Autowired
	private ParticipacaoService participacaoService;
	
	@GetMapping("/{id}")	
	public ResponseEntity<List<Projeto>> GetProjetosById(@PathVariable long id){
		List<Projeto> projetos;
		try {
			projetos = participacaoService.getProjetosByUsuarioId(id);
			return ResponseEntity.ok(projetos); 		
		} catch (NotFoundException e) {
			
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping
	public ResponseEntity<Projeto> addParticipante(@RequestBody Participacao participacao){
		Projeto projeto;
		try {
			projeto = participacaoService.addParticipante(participacao);
			return ResponseEntity.ok(projeto); 		
		} catch (NotFoundException e) {
			
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
	}
}
