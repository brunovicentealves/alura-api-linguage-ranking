package br.com.alura.linguage.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.linguage.model.Linguage;


@Repository
public interface LinguageRepository extends MongoRepository<Linguage, String> {
	
	
	List<Linguage> findByTitle(String title);
	
	
	
	List<Linguage> findByOrderByNumberVotesDesc();

}
