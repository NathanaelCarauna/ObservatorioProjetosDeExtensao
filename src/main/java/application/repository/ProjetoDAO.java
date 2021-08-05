package application.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Projeto;

public interface ProjetoDAO extends JpaRepository<Projeto, Long>{

}
