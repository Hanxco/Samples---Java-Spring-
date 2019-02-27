package modelo.persistencia;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import modelo.entidades.Pelicula;

public interface PeliculaDaoJpaData extends JpaRepository<Pelicula, Integer>{
	
	List<Pelicula> findByTitulo(String titulo);
	List<Pelicula> findByTituloAndGenero(String titulo, String genero);
	//JPQL
	@Query("select p from Pelicula p where p.genero = ?1")
	List<Pelicula> findByMovidaDeLaMuerte(String genero);
}
