package modelo.negocio;

import java.util.Comparator;

import modelo.entidades.Coche;

public class CompararKm implements Comparator<Coche> {

	public int compare(Coche o1, Coche o2) {
		return (int) (o1.getKmTotales() - o2.getKmTotales());
	}

}
