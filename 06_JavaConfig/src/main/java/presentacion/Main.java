package presentacion;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;
import modelo.persistencia.DAOPelicula;
import modelo.entidades.Director;

public class Main {

	private static ApplicationContext ctx;
	
	static {
		ctx = new AnnotationConfigApplicationContext(Configuracion.class);
	}
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);

		String continuar = "si";
		do {
			System.out.println("Introduce el titulo : ");
			String titulo = sc.nextLine();
			System.out.println("Introduce el genero : ");
			String genero = sc.nextLine();
			System.out.println("Introduce el nombre del director : ");
			String nombreDirector = sc.nextLine();
			
			Director director = (Director) ctx.getBean("director");
			director.setName(nombreDirector);
			director.setId(1);
			
			Pelicula pelicula = ctx.getBean("pelicula", Pelicula.class);
			pelicula.setId(1);
			pelicula.setDirector(director);
			pelicula.setGenero(genero);
			pelicula.setTitulo(titulo);
			
			GestorPelicula gp = ctx.getBean("gestorPeliculas", GestorPelicula.class);
			boolean respuesta = gp.insertar(pelicula);

			if(respuesta == true) 
				System.out.println("Pelicula insertada");
			else
				System.out.println("Error al guardar");

			List<Pelicula> listaPeliculas = gp.getDaoPelicula().getListaPeliculas();
			
			System.out.println("LISTADO DE PELICULAS");
			System.out.println(listaPeliculas);
			
			System.out.println("Continuar?");
			continuar = sc.nextLine();

			}while(continuar.equals("si"));

		
	}
	

}
