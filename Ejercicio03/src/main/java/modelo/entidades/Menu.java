package modelo.entidades;

import java.util.List;

public class Menu {

	List<Opcion> listaOpciones;

	public List<Opcion> getListaOpciones() {
		return listaOpciones;
	}

	public void setListaOpciones(List<Opcion> listaOpciones) {
		this.listaOpciones = listaOpciones;
	} 

	@Override
	public String toString() {
		return "Menu [listaOpciones=" + listaOpciones + "]";
	}
	
	public void verMenu() {
		System.out.println("######################################");
		System.out.println("	  BBDD CONCESIONARIO ");
		System.out.println("######################################");	
		for(Opcion o : listaOpciones) {
			System.out.println(o.getId() + " - " + o.getTitulo());
		}
		System.out.println("######################################");	
		System.out.println("\n");
		System.out.println("\tSeleccione una opción: ");
	}

}
