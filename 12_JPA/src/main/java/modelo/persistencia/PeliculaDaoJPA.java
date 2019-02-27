package modelo.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import modelo.entidades.Pelicula;

@Repository
public class PeliculaDaoJPA implements PeliculaDAO {

	@PersistenceContext
	EntityManager em;
	
	public void insertar(Pelicula p) {
		em.persist(p);
	}

	public void modificar(Pelicula p) {
		em.merge(p);
	}

	public void borrar(Pelicula p) {
		em.remove(p);
	}

	public Pelicula buscar(int id) {
		return em.find(Pelicula.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Pelicula> listar() {
		return em.createQuery("select p from Pelicula p").getResultList();
	}

}
