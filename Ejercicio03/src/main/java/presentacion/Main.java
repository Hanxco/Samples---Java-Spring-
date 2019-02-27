package presentacion;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidades.Coche;
import modelo.entidades.Menu;
import modelo.negocio.GestorCoche;

public class Main {

	private static ApplicationContext ctx; 
	private static Scanner sc; 
	private static GestorCoche gestorCoche;
	private static Coche coche;
	
	static {
		ctx = new ClassPathXmlApplicationContext("bean.xml");
		sc = new Scanner(System.in);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Integer parada = 1;

		gestorCoche = (GestorCoche) ctx.getBean("gestorcoche");

		do {
			Menu menu = (Menu) ctx.getBean("menu");
			menu.verMenu(); 
			int opcion = Integer.parseInt(sc.next());		

			switch( opcion ) {
				case 1:
					altaCoche();
					break;
				case 2:
					listadoCoches();
					break;
				case 3:
					buscarCoche();
					break;
				case 4:
					modificarCoche();
					break;
				case 5:
					eliminarCoche();
					break;
				case 6:
					break;
			}
		}while(parada == 1);
		
		
	}
	
	public static void eliminarCoche() {
		listadoCoches();
		System.out.println("\nSeleccione el ID del coche para eliminar : ");
	 	int idEliminar = Integer.parseInt(sc.nextLine());
	 	
	 	gestorCoche.eliminar(idEliminar);
		System.out.println("COCHE CON ID = " + idEliminar + " ELIMINADO");

	}
	
	public static void altaCoche() {
		coche = getData();
		boolean booleanVar = gestorCoche.insertar(coche);
		if(booleanVar) {
			System.out.println("COCHE INSERTADO");
			System.out.println(coche);
		}else {
			System.out.println("ERROR");
		}
			
	}
	
	public static Coche getData() {
		System.out.println("Introduce los siguientes datos \n");
		System.out.println("\tMatricula : ");
		String matricula = sc.nextLine();
		System.out.println("\tMarca : ");
		String marca = sc.nextLine();
		System.out.println("\tModelo : ");
		String modelo = sc.nextLine();
		System.out.println("\tKilometros totales: ");
		String kmTotales = sc.nextLine();
		coche = (Coche) ctx.getBean("coche");
		coche.setKmTotales(kmTotales);
		coche.setMarca(marca);
		coche.setModelo(modelo);
		coche.setKmTotales(kmTotales);
		coche.setMatricula(matricula);
		
		return coche;
	}
	
	public static void listadoCoches() {
		List<Coche> listaCoches = gestorCoche.listado();
		
		if(listaCoches.size() == 0) {
			System.out.println("Base de datos vacia");
		}else {
			for(Coche item : listaCoches) {
				System.out.println(item);
			}			
		} 
		System.out.println("\n");
	}

	public static void modificarCoche() {
		listadoCoches();
		System.out.println("Seleccione el id del coche a modificar : ");
	 	int idModificar = Integer.parseInt(sc.nextLine());
	 	
	 	coche = getData();
	 	coche.setId(idModificar);
	 	gestorCoche.modificar(coche);
		System.out.println("COCHE [" + coche.getId() + "] MODIFICADO");

	}
	
	public static void buscarCoche() {
		System.out.println("Introduce matricula : ");
		String matricula = sc.nextLine();
	 	
		coche = gestorCoche.buscar(matricula);
		
		System.out.println(coche);
		System.out.println("\n");
	}
}
