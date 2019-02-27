package modelo.persistencia;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import modelo.entidades.Pelicula;

@Repository
public class DAOPelicula {
	// Si ponemos autowire también inyectaría un tipo pelicula al array	
	@Resource
	private List<Pelicula> listaPeliculas;
	@Autowired
	private int numeroMaximoPeliculas;

	/*
	 * Metodo que inserta una pelicula a la vista
	 * @param p la pelicula a insertar
	 * @return true en caso correcto de insercci�n o false en el caso de que el array este lleno o ya este la pelicula en el array
	 */
	public boolean insertar(Pelicula p) {
		if( listaPeliculas.size() <= numeroMaximoPeliculas && !listaPeliculas.contains(p)) {
			listaPeliculas.add(p);
			return true;
		}
		return false;
	}

	public int getNumeroMaximoPeliculas() {
		return numeroMaximoPeliculas;
	}

	public void setNumeroMaximoPeliculas(int numeroMaximoPeliculas) {
		this.numeroMaximoPeliculas = numeroMaximoPeliculas;
	}

	public List<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(List<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}

}
