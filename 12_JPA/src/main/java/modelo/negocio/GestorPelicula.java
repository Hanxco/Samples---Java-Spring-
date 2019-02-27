package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import modelo.entidades.Pelicula;
import modelo.persistencia.PeliculaDaoJPA;

@Service
public class GestorPelicula {
	
	@Autowired
	private PeliculaDaoJPA peliculaDao;
	
	@Transactional
	public void insertar(Pelicula p) {
		peliculaDao.insertar(p);
	}
	
	public List<Pelicula> listar(){
		return peliculaDao.listar();
	}
	
}
