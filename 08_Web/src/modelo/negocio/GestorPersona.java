package modelo.negocio;

import modelo.entidades.Persona;

public class GestorPersona {

	public Boolean validar(Persona p) {
		if(p.getNombre().equals("pepe")) {
			return true;
		}
		return false;
	}
	
}
