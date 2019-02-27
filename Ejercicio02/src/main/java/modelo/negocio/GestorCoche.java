package modelo.negocio;

import modelo.entidades.Coche;
import modelo.persistencia.DAOCoche;

public class GestorCoche {
	
	private DAOCoche daoCoche;
	
	public DAOCoche getDaoCoche() {
		return daoCoche;
	}

	public void setDaoCoche(DAOCoche daoCoche) {
		this.daoCoche = daoCoche;
	}

	public boolean insertar(Coche c) {
		if(c.getMatricula().length() == 7) {
			return daoCoche.insertar(c);
		}
		return false;
	}
	
}
