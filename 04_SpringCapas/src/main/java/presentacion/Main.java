package presentacion;

import java.util.Scanner;
import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidades.Director;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;

public class Main {

	private static ApplicationContext ctx;
	
	static {
		ctx = new ClassPathXmlApplicationContext("bean.xml");
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
			
			Director director = ctx.getBean("director", Director.class);
			director.setName(nombreDirector);
			director.setId(1);
			
			Pelicula pelicula = ctx.getBean("pelicula", Pelicula.class);
			pelicula.setId(1);;
			pelicula.setDirector(director);
			pelicula.setGenero(genero);
			pelicula.setTitulo(titulo);
			
			GestorPelicula gp = ctx.getBean("gestorPelicula", GestorPelicula.class);
			boolean respuesta = gp.insertar(pelicula);

			if(respuesta == true) 
				System.out.println("Pelicula insertada");
			else
				System.out.println("Error al guardar");

			System.out.println("¿Continuar?");
			continuar = sc.nextLine();

			}while(continuar.equals("si"));

		List<Pelicula> listaPeliculas = ctx.getBean("listaPeliculas", List.class);
		System.out.println(listaPeliculas);
	}
	

}
