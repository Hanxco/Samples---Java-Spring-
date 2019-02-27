package modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidades.Pelicula;
import modelo.persistencia.PeliculaDAO;
import java.util.List;

@Service
public class GestorPelicula {
	
	@Autowired
	private PeliculaDAO peliculaDao;

	public PeliculaDAO getPeliculaDao() {
		return peliculaDao;
	}

	public void setPeliculaDao(PeliculaDAO peliculaDao) {
		this.peliculaDao = peliculaDao;
	}
	
	public void insertar(Pelicula p) throws Exception {
		if("".equals(p.getTitulo())) {
			throw new Exception("Titulo requerido");
		}else {
			peliculaDao.insertar(p);
		}
	}
	
	public List<Pelicula> listar(){
		return peliculaDao.listarPeliculas();
	}
	
	public Pelicula getPelicula( int id ) {
		return peliculaDao.buscar(id);
	}

	public void borrarPelicula( int id ) {
		peliculaDao.borrar(id);
	}
	
	public void modificarPelicula( Pelicula pelicula ) {
		peliculaDao.modificar(pelicula);
	}
}
