package modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidades.Pelicula;
import modelo.persistencia.DAOPelicula;

@Service
public class GestorPelicula {

	@Autowired
	private DAOPelicula daoPelicula; 
	
	public boolean insertar(Pelicula p) {
		if(p.getTitulo().equals("")) {
			return false;
		}else {
			return daoPelicula.insertar(p);
		}
	}

	public DAOPelicula getDaoPelicula() {
		return daoPelicula;
	}

	public void setDaoPelicula(DAOPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}
	
	
}
