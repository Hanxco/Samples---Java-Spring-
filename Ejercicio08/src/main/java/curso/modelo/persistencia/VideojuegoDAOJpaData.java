package curso.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.modelo.entidades.Videojuego;

import java.util.List;

public interface VideojuegoDAOJpaData extends JpaRepository<Videojuego, Integer>{

	List<Videojuego> findByTitulo( String titulo );
	List<Videojuego> findByPlataforma( String plataforma );
	List<Videojuego> findByTituloAndPlataforma( String titulo, String plataforma );
	
}
