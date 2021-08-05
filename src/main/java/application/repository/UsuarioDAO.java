package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Long>{	

}
