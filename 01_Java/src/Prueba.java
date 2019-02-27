import java.util.ArrayList;

public class Prueba {

	// Bloques estáticos
	static {
		Persona p = new Persona();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getString();
		// Aquí morira el objeto String "s"
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		// Compara si dos objetos apunta a la misma referencia
		// Son equivalentes "equals" y el operador "=="
		System.out.println( obj1.equals(obj2) );		
		System.out.println(obj1 == obj2);
		
		System.out.println("CADENAS STRING ");
		
		String s1 = "FELIX";
		String s2 = "FELIX";
		
		String s3 = new String("Felix");
		String s4 = new String("Felix");
		
		System.out.println( s1.equals(s2) );
		System.out.println( s3.equals(s4) );
		
		System.out.println( s3 == s4 );
		System.out.println( s1 == s2 );
	
		System.out.println("OBJETO PERSONA");
		// Inicialización de un objeto y modificación con sus accesores
		Persona p1 = new Persona();
		p1.setNombre("Nacho");
		p1.setEdad(25);
		p1.setPeso(82.0);
		p1.setApellidos("Hita");
		
		System.out.println(p1.getNombre() + " " + p1.getApellidos());

		// PERSONA 2 
		Persona p2 = new Persona("Nacho", "Hita", 25, 75.5);
		System.out.println(p2.getNombre() + " " + p2.getApellidos());
		System.out.println( p1 == p2 );
		System.out.println( p1.equals(p2) );
		
		p1 = p2; 
		p1.setEdad(55);
		System.out.println("Edad p1 => " + p1.getEdad());
		System.out.println("Edad p2 => " + p2.getEdad());
	
		cambiarEdad( p1 );
		System.out.println("[cambiarEdad] Edad p1 => " + p1.getEdad());
	
		int numero = 33;
		cambiarNum( numero );
		System.out.println("Numero => " + numero);
		
		int cp = 07051; // Base octal
		System.out.println("Base Octal => " + cp);
		
		int cp1 = 0xABC; // Base hexadecimal
		System.out.println("Base hexa => " + cp1);
		
		int bi1 = 0b0101; // Base binaria
		System.out.println("Base binaria => " + bi1);
		
		numero = 10_000_000; // No cambia al valor interno y mejora la visualización 
		
		int n1 = 10;
		int n2 = 3;
		double n3 = n1 / n2; 
		double n4 = (double)n1 / n2; // Casteo  
		System.out.println(n3);
		System.out.println(n4);
			
		Direccion dir1 = new Direccion("Gran via", "Calle", 4, "28034", "España");
		Persona per1 = new Persona("Nacho", "Hita", 25, 75.5, dir1);
		System.out.println(per1);
		
		per1.getDireccion().setPais("Italia");
		
		System.out.println(per1);
		
		// Accediendo a una variable estática
		System.out.println("num personas => " + Persona.numPersonas);
		/** Desde un contexto estático no se puede acceder a un contenido dinámico, al reves si */
		
		Prueba.holaStatic();
		
		Prueba prueba = new Prueba();
		prueba.hola();
		
		final int n5 = 6;
		/** No se puede es constante
		n5 = 7; */ 
		
		final Persona p3 = new Persona("Ana", "Gomez", 29, 58);
		p3.setNombre("Pepa");
		System.out.println(p3);
		// No se puede modificar la referencia
		//p3 = new Persona();
		System.out.println(p3.toStringObj());
		
		System.out.println("ARRAYS");
		// Array estático de 10 pos
		int[] any = new int[10];
		ArrayList arrList = new ArrayList<>();
		arrList.add(p3);
		System.out.println(arrList);
		
	}
	
	public void hola() {
		System.out.println("Hola");
	}
	public static void holaStatic() {
		System.out.println("Hola");
	}
	
	public static void cambiarNum( int numero ) {
		numero = 55;
		System.out.println(numero);
	}
	
	public static void cambiarEdad( Persona p ) {
		p.setEdad(33);
		System.out.println(p.getEdad());
	}

	public static String getString() {
		String s = new String("felix");
		return s;
	}
	
	/** No puede ser debido a que tienen la misma firma del método no esta incluido el return
	    Solo entra el nombre y los parametro
		Tiene la misma firma:
			- numero de argumentos
			- tipo de los argumentos
			- nombre del metodo
	/*public static void getString() {
		
	}*/
}
