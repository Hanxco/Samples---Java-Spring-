package modelo.negocio;

import modelo.entidades.Persona;

public class GestorPersona {
	
	public Boolean validarPersona( Persona p ) {
		if( p.getUsername().equals("root") && p.getPassword().equals("root") ){
			return true;
		}
		return false;
	}

}
