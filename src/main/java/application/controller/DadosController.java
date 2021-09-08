package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import application.dto.dadosDTO;
import application.model.Projeto;
import application.service.ProjetoService;

@Controller
@RequestMapping("/api/dados")
public class DadosController {
	
	@Autowired
	private ProjetoService service;
	

	@GetMapping
	public ResponseEntity<dadosDTO> getDados() {
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

}
