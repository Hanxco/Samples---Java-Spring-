package modelo.negocio;

import java.util.Comparator;

import modelo.entidades.Coche;

public class CompararMarca implements Comparator<Coche> {

	public int compare(Coche o1, Coche o2) {
		return o1.getMarca().compareTo(o2.getMarca());
	}

}
