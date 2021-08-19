package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long>{	

}
