package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findByEmail(String email);	
	
}
