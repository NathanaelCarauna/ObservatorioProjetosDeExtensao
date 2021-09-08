package application.dto;

import java.util.ArrayList;
import java.util.List;

import application.model.Projeto;
import application.model.enums.EditalEnum;
import application.model.enums.ModalidadeEnum;
import lombok.Data;

@Data
public class dadosDTO {
	private List<String> campus = new ArrayList<String>();
	private List<EditalEnum> edital = new ArrayList<EditalEnum>();
	private List<ModalidadeEnum> modalidade = new ArrayList<ModalidadeEnum>();

	public dadosDTO(List<Projeto> projetos) {
		for(Projeto pro : projetos) {
			this.campus.add(pro.getCampus());
			this.edital.add(pro.getEdital());
			this.modalidade.add(pro.getModalidade());
		}
	}

}
