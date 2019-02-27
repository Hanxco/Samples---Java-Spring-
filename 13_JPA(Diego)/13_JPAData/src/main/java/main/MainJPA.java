package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuraciones.Configuracion;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;

public class MainJPA {
	
	private final static ApplicationContext context;
	static {
		context = new AnnotationConfigApplicationContext(Configuracion.class);
		}
public static void main(String[] args) {
	System.out.println("Inicializando BBDD...");
	Pelicula p = new Pelicula();
	p.setGenero("Dibujos");
	p.setTitulo("Death Note");
	p.setDirector("Akira Toriyama");
	p.setYear(1992);
	GestorPelicula gp= context.getBean("gestorPelicula", GestorPelicula.class);
	gp.insertar(p);
	List<Pelicula> lista = gp.listar();
	System.out.println(lista);
	
	List<Pelicula> lista2 = gp.listarPorTitulo("Death Note");
	System.out.println(lista2);
	
	
	
	
}
}
