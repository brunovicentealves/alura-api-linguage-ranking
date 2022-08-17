package br.com.alura.linguage.model;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.alura.linguage.requestDto.LinguageDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "teste")
public class Linguage {
	
	@Id
	private String id;
	private String title;
	private String image;
	private Integer ranking;
	private Integer numberVotes;

	
	public List<LinguageDTO>  convertEntityListLinguageDto(List<Linguage> linguage) {
		
		return linguage.stream().map(x -> new LinguageDTO(x.getId(),x.getTitle(),x.getImage(), x.getRanking(),x.getNumberVotes())).collect(Collectors.toList());
		
	}
	
	
	public LinguageDTO  convertEntityLinguageDTO(Linguage linguage) {
		
		return LinguageDTO.builder().title(linguage.getTitle()).image(linguage.getImage()).ranking(linguage.getRanking()).build();
		
	}
	
}
