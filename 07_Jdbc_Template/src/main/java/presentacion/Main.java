package presentacion;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidades.Pelicula;
import modelo.persistencia.PeliculaDAOjdbcTemplate;

public class Main {

	private static ApplicationContext ctx; 
	private static Scanner scan;
	private static PeliculaDAOjdbcTemplate jdbc;

	static {
		ctx = new ClassPathXmlApplicationContext("bean.xml");
		jdbc = (PeliculaDAOjdbcTemplate) ctx.getBean("daopelicula");
	 	scan = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
        Integer parada = 1;
        Scanner scan = new Scanner(System.in);
        
        do {
        	menu();
			int opcion = Integer.parseInt(scan.next());		
			
			switch( opcion ) {
				case 1:
					addPelicula();		
					break;
				case 2:
					verListado();
					break;
				case 3:
					buscarPelicula();
					break;
				case 4:
					modificarPelicula();
					break;
				case 5:
					borrarPelicula();
					break;
				case 6:
					break;
			}
        }while(parada == 1);
	}
	
	public static void menu(){
		System.out.println("######################################");
		System.out.println("	   PELICULAS ");
		System.out.println("######################################");	
		System.out.println("1. Añadir una pelicula \r\n" + 
						   "2. Ver peliculas disponibles\r\n" + 
						   "3. Buscar una pelicula\r\n" + 
						   "4. Modificar una pelicula\r\n" + 
						   "5. Borrar una pelicula\r\n" + 
						   "6. Salir");
		System.out.println("######################################");	
		System.out.println("\n");
		System.out.println("\tSeleccione una opción: ");
	}
	
	public static void addPelicula() {
		Pelicula newPeli = ctx.getBean("pelicula", Pelicula.class);
		newPeli = addPeliculaScan();
		
		System.out.println("\n Pelicula Insertada \n");
	
		jdbc.insertar(newPeli);
	}
	
	public static Pelicula addPeliculaScan() {
		Pelicula newPeli = ctx.getBean("pelicula", Pelicula.class);

	 	System.out.println("Titulo");
	 	String titulo = scan.nextLine();
	 	System.out.println("Director");
	 	String director = scan.nextLine();
	 	System.out.println("Genero");
	 	String genero = scan.nextLine();
	 	System.out.println("Año");
	 	int year = Integer.parseInt(scan.nextLine());
	 	
		newPeli.setTitulo(titulo);
		newPeli.setDirector(director);
		newPeli.setGenero(genero);
		newPeli.setYear(year);
		
		return newPeli;
	}
	
	public static void verListado() {
		List<Pelicula> listaPeliculas = (List<Pelicula>) ctx.getBean("listaPeliculas");
		listaPeliculas = jdbc.listarPeliculas();
		
		System.out.println("\n");
		System.out.println("PELICULAS DISPONIBLES");
		System.out.println("\n");
		for( Pelicula i : listaPeliculas ) {
			System.out.println(i);
		}
		System.out.println("\n");
	}
	
	public static void modificarPelicula() {
		System.out.println("Introduce el ID de la pelicula : ");
		int idPeli = Integer.parseInt(scan.nextLine());
		
		Pelicula pel1 = ctx.getBean("pelicula", Pelicula.class);
		pel1 = jdbc.buscar(idPeli);
		
		System.out.println("PELICULA : " + pel1 + "\n");
		System.out.println("¿Modificar?");
		Pelicula newPeli = ctx.getBean("pelicula", Pelicula.class);
		newPeli = addPeliculaScan();
		newPeli.setId(pel1.getId());
		
		jdbc.modificar(newPeli);
		
		System.out.println("\n PELICULA MODIFICADA \n");
	}
	
	public static void borrarPelicula() {
		System.out.println("Introduce el ID de la pelicula : ");
		int idPeli = Integer.parseInt(scan.nextLine());
		
		jdbc.borrar(idPeli);
		
		System.out.println("\n PELICULA BORRADA \n");
	}
	
	public static void buscarPelicula() {
		System.out.println("Introduce el ID de la pelicula : ");
		int idPeli = Integer.parseInt(scan.nextLine());
		
		Pelicula pel1 = ctx.getBean("pelicula", Pelicula.class);
		pel1 = jdbc.buscar(idPeli);
		
		System.out.println(pel1 + "\n");
	}

}