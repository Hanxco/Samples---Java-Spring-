import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Colecciones {

	public static void main(String[] args) {
		// ArrayList<TiposGenericos>
		List<String> arrString = new ArrayList<>();
		arrString.add("Felix");
		arrString.add("Nacho");
		arrString.add("Ana");
		arrString.add("Marcos");
		
		System.out.println("arrString[0] => " + arrString.get(0));
		
		ArrayList<String> lista1 = new ArrayList<>();
		lista1.add("Felix");
		lista1.add("Ana");
		
		Vector<String> lista2 = new Vector<>();
		lista2.add("Marcos");
		lista2.add("Ana");
		
		// Se implemtna a partir del interfaz lista y así no es necesario repetir un metodo para 
		// cada tipo de lista
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Marcos");
		linkedList.add("Pedro");
		
		System.out.println("Recorrer una Lista 1");
		recorrerArray( lista1 );
		System.out.println("Recorrer una Lista 2");
		recorrerArray( lista2 );
		System.out.println("Recorrer la Linked List");
		recorrerArray( linkedList );
		
		System.out.println("-------------");
		System.out.println("MAPA HASH");
		
		Persona per1 = new Persona("Jhon Buddy", "Spark", 35, 63.2);
		Persona per2 = new Persona("Bud Spencer", "Lsa", 12, 7);
		
		// Objetos wrapper son inmutables 
		Map<Integer, Persona> map1 = new HashMap<>();
		map1.put(per1.hashCode(), per1);
		map1.put(per2.hashCode(), per2);
		
		verMapa(map1);
		System.out.println( getValueMap(map1, -621901769) );

		System.out.println("-------------");
		System.out.println("LISTA DE PERSONAS");
		ArrayList<Persona> arrPersonas = new ArrayList<>();
		arrPersonas.add(per1);
		arrPersonas.add(per2);
		
		per1 = new Persona();
		per1.setNombre("Ana");
		per1.setApellidos("Gomez"); 
		per1.setEdad(32);
		per1.setPeso(88);
		
		arrPersonas.add(per1);
		
		Persona per3 = new Persona("Jhon Buddy", "Spark", 4, 64.2);
		
		// Se basa en el equals del objeto 
		System.out.println("Array personas contiene persona 1 => " + arrPersonas.contains(per1));
		System.out.println("Array personas contiene persona 3 => " + arrPersonas.contains(per3));
				
		/** Ordenaciones
		Comparable --> ordena de forma natural
		Comparator
		 */
		Collections.sort(arrString);
		System.out.println("COMPARE POR EDAD");
		Collections.sort(arrPersonas);
		
		for( Persona item : arrPersonas ) {
			System.out.println(item);
		}
		
		System.out.println("COMPARAR CON NOMBRE");
		Collections.sort(arrPersonas, new CompararPorNombre());
		
		for( Persona item : arrPersonas ) {
			System.out.println(item);
		}
	}
	
	public static void verMapa( Map<Integer, Persona> mapa ) {
		System.out.println(mapa);
	}
	
	public static Persona getValueMap( Map<Integer, Persona> mapa, Integer key ) {
		return mapa.get(key);
	}
	
	public static void recorrerArray( ArrayList<String> lista ) {
		for(String s : lista) {
			// Todo...
			System.out.println(s);
		}
	}
	
	public static void recorrerArray( Vector<String> lista ) {
		for(String s : lista) {
			// Todo...
			System.out.println(s);
		}
	}
	
	public static void recorrerArray( List<String> lista ) {
		for(String s : lista ) {
			System.out.println( s );
		}
	}

}
