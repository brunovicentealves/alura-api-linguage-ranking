package br.com.alura.linguage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.linguage.model.Linguage;
import br.com.alura.linguage.repository.LinguageRepository;
import br.com.alura.linguage.requestDto.LinguageDTO;
import br.com.alura.linguage.service.linguageService;

@RestController
@RequestMapping(value = "/linguage")
public class LiguangeApiController {
	
	@Autowired
	private LinguageRepository repository;
	
	@Autowired
	private linguageService service;
	
	@GetMapping("/title")
	public List<Linguage> getTItle (@RequestParam String title) {
		
		return repository.findByTitle(title);
	}
	
	
	
	@PostMapping
	public void createLinguagem (@RequestBody LinguageDTO  dto) {
	
		service.saveLinguage(dto);
		
	}
	
	
	@GetMapping("/findAll")
	public List<LinguageDTO> findAllLinguage(){
		
		return service.findAllLinguage();
		
	}
	
	
	
	@DeleteMapping
	public void deleteLinguagem (@RequestParam String id) {
	
		service.deleteLinguage(id);
			
	}
	
	
}
