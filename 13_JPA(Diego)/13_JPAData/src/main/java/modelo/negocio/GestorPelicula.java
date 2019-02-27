package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import modelo.entidades.Pelicula;
import modelo.persistencia.PeliculaDaoJpaData;
@Service
public class GestorPelicula {
	@Autowired
	private PeliculaDaoJpaData peliculaDAO;

	@Transactional
	public void insertar(Pelicula p) {
		peliculaDAO.save(p);
	}

	@Transactional
	public void borrar(Pelicula p) {
		peliculaDAO.delete(p);
	}
	@Transactional
	public void modificar(Pelicula p) {
		peliculaDAO.save(p);
	}

	@Transactional
	public List<Pelicula> listar() {
		return peliculaDAO.findAll();
	}
	public List<Pelicula> listarPorTitulo(String titulo) {
		return peliculaDAO.findByTitulo(titulo);
	}
	
}
