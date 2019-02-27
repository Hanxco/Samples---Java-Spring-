package ejemplo7;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static ApplicationContext ctx; 
	
	static {
		ctx = new ClassPathXmlApplicationContext("beans7.xml");
	}

	public static void main(String[] args) {
		List<String> listaNombres = ctx.getBean("listaNombres", List.class);
		System.out.println("lista de nombres");
		System.out.println(listaNombres);
		
		// Accediendo a las colecciones
		Colecciones colecciones = ctx.getBean("colecciones", Colecciones.class);
		
		for( Persona p : colecciones.getListaPersonas() ) {
			System.out.println(p.getNombre());
		}

		System.out.println("###############");
		System.out.println("Conjunto Strings");
		
		for( String p : colecciones.getConjuntoStrings() ) {
			System.out.println(p);
		}
		
		System.out.println("##############");
		System.out.println("Mapas");

		Map<Integer, Persona> mapaPersonas = colecciones.getMapaPersonas();
		
		for( Integer i : mapaPersonas.keySet() ) {
			System.out.println(mapaPersonas.get(i));
		}
	}

}
