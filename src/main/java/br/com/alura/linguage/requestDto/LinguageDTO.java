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
	
	private String title;
	private String image;
	private Integer ranking;
	
	
	
	
	
	
public Linguage  convertEntity(LinguageDTO dto) {
		
		return Linguage.builder().title(dto.getTitle()).image(dto.getImage()).ranking(dto.getRanking()).build();
		
	}


public Linguage  convertEntity(LinguageDTO dto ,String id) {
	
	return Linguage.builder().id(id).title(dto.getTitle()).image(dto.getImage()).ranking(dto.getRanking()).build();
	
}

}
