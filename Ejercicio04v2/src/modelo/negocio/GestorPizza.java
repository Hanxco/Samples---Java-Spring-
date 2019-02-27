package modelo.negocio;

import modelo.entidades.Ingredientes;
import modelo.entidades.Pizza;

import java.util.ArrayList;
import java.util.List;

public class GestorPizza {

	public void CrearPizza( Pizza p ) {
		
	}
	
	public List<Ingredientes> crearListaIngredientes( String[] listaIngredientes ) {
		List<Ingredientes> ingre = new ArrayList<>(); 
		
		for(String i : listaIngredientes ) {	
			ingre.add(Ingredientes.values()[Integer.parseInt(i)]);
		}
		
		return ingre;
	}
	
	public Double calcularPrecioTotal( Pizza p ) {
		Double precio = 0.0;
		String tam = p.getTam();
		
		if( tam.equals("Individual") ) 
			precio += 5.0;
		else if( tam.equals("Normal") )
			precio += 10.0;
		else if( tam.equals("Familiar") )
			precio += 15.0;
		
		for( Ingredientes i : p.getListaIngredientes() ) {
			precio += i.getPrecio();
		}
		
		return precio;
	}
}
