package br.com.alura.linguage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.linguage.model.Linguage;
import br.com.alura.linguage.repository.LinguageRepository;
import br.com.alura.linguage.requestDto.LinguageDTO;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class linguageService {
	
	
	@Autowired
	private LinguageRepository repository;
	
	
	public  void saveLinguage(LinguageDTO dto) {
		
		Linguage linguage =	new LinguageDTO().convertEntity(dto);
		
		log.info("Save linguage:{}",linguage);
		
		repository.save(linguage);
		
	}
	
	
	public LinguageDTO  getLinguage(String id ) {
		
	Optional<Linguage> linguage=repository.findById(id);
		
		return  new Linguage().convertEntityLinguageDTO(linguage.get());
		
	}
	
	
	public List<LinguageDTO> findAllLinguage(){
		
		return new Linguage().convertEntityListLinguageDto(repository.findAll());
	}
	
	
	public void updateLinguage(LinguageDTO dto ,String id) {
		
		
	Optional<Linguage> linguage = repository.findById(id);
	
	repository.save(Linguage.builder().id(linguage.get().getId()).title(dto.getTitle()).image(dto.getImage()).ranking(dto.getRanking()).build());
			
	}
	
	
	public void deleteLinguage(String id) {
		
		LinguageDTO dto =getLinguage(id);
		
		repository.delete(new LinguageDTO().convertEntity(dto, id));
		
	}
	
	
	
	
	
	
	
	
	
	

}
