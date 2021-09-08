package application.dto;

import java.util.List;

import application.model.Projeto;
import application.model.enums.EditalEnum;
import application.model.enums.ModalidadeEnum;

public class dadosDTO {
	private List<String> campus;
	private List<EditalEnum> edital;
	private List<ModalidadeEnum> modalidade;

	public dadosDTO(List<Projeto> projetos) {
		for(Projeto pro : projetos) {
			this.campus.add(pro.getCampus());
			this.edital.add(pro.getEdital());
			this.modalidade.add(pro.getModalidade());
		}
	}

}
