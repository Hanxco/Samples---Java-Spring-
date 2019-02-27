package modelo.persistencia;

import modelo.entidades.Pelicula;
import java.util.List;

public interface PeliculaDAO {
	
	void insertar(Pelicula pelicula);
	void modificar(Pelicula pelicula);
	void borrar(Integer pelicula);
	Pelicula buscar(Integer id);
	List<Pelicula> listarPeliculas();
	
}
