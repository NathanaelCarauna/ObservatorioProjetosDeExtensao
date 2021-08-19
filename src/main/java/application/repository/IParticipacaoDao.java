package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Participacao;

public interface IParticipacaoDao extends JpaRepository<Participacao, Long>{

}
