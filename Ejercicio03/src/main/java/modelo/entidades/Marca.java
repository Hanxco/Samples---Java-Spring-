package modelo.entidades;

public enum Marca {
	TOYOTA,
	HONDA,
	MAZDA,
	SEAT;
	
	public static String verMarcas() {
		String aux = "";
		for( Marca i : Marca.values() ) {
			aux += i.name() + " ";
		}
		return aux;
	}
}


