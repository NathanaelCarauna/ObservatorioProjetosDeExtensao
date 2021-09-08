package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Comentario;

public interface IComentarioDAO extends JpaRepository<Comentario, Long> {

}
