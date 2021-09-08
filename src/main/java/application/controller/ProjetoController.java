package application.controller;

import java.util.List;

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

import application.dto.dadosDTO;
import application.model.Projeto;
import application.service.ProjetoService;
import javassist.NotFoundException;

@Controller
@RequestMapping("/api/projetos")
public class ProjetoController {
	
	@Autowired
	private ProjetoService service;
	@GetMapping("/dados")
	public ResponseEntity<dadosDTO> getDados(){
		List<Projeto> projeto;
		try {
			projeto = service.getAll();
			dadosDTO dados = new dadosDTO(projeto);
			return ResponseEntity.ok(dados);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping
	public ResponseEntity<List<Projeto>> getAll(){
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Projeto> getById(@PathVariable long id){
		Projeto projeto;
		try {
			projeto = service.getById(id);
			return ResponseEntity.ok(projeto);
		} catch (NotFoundException e) {
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping()
	public ResponseEntity<Projeto> createProjeto(@RequestBody Projeto projetoParam){
		Projeto projeto = service.createProjeto(projetoParam);
		return ResponseEntity.ok(projeto);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Projeto> updateProjeto(@PathVariable long id, @RequestBody Projeto projetoP){
		Projeto projeto;
		try {
			projeto = service.updateProjeto(id, projetoP);
			return ResponseEntity.ok(projeto);
		} catch (NotFoundException e) {
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Projeto> deleteProjeto(@PathVariable long id){
		Projeto projeto;
		try {
			projeto = service.deleteProjeto(id);
			return ResponseEntity.ok(projeto);
		} catch (NotFoundException e) {
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
	}
	
	
}
