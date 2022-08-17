package br.com.alura.linguage.requestDto;

import br.com.alura.linguage.model.Linguage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LinguageDTO {
	
	private String id;
	private String title;
	private String image;
	private Integer ranking;
	private Integer numberVotes;
	
	
	
	
	
	
public Linguage  convertEntity(LinguageDTO dto) {
		
		return Linguage.builder().id(dto.getId()).title(dto.getTitle()).image(dto.getImage()).ranking(dto.getRanking()).build();
		
	}


public LinguageDTO(String id, String title, String image, Integer ranking) {
	super();
	this.id = id;
	this.title = title;
	this.image = image;
	this.ranking = ranking;
}

}
