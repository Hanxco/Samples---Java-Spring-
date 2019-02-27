package presentacion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidades.*;
import modelo.negocio.GestorCoche;
import modelo.persistencia.DAOCoche;

public class Main {

	public static ApplicationContext ctx;
	private static Scanner sc;
	private static GestorCoche gc;
	private static DAOCoche daoCoches;
	private static List<Coche> listCochesOrdenada;
	private static Persona per1;
	
	static {
		ctx = new ClassPathXmlApplicationContext("bean.xml");
		gc = (GestorCoche) ctx.getBean("gestorCoche");

		daoCoches = (DAOCoche) ctx.getBean("daoCoche");
		listCochesOrdenada = ctx.getBean("arrOrdenCoches", List.class);
		per1 = (Persona) ctx.getBean("persona");
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int senParada = 1;

		per1.setDni("47147414X");
		per1.setNombre("Nacho");
		per1.setEdad(25);
		per1.setId("1"); 
				
		do {
			menu();
			System.out.println("\tSeleccione una opción : ");
			int opcion = Integer.parseInt(sc.next());		
			
			switch( opcion ) {
				case 1:				
					altaCoche();					
					break;
				case 2:					
					daoCoches.verListadoCoches();
					System.out.println("\n");
					break;
				case 3:			
					daoCoches.ordenar(1);
					System.out.println(listCochesOrdenada);
					break;
				case 4:
					daoCoches.ordenar(2);
					System.out.println(listCochesOrdenada);
					break;
				case 5:
					daoCoches.ordenar(3);
					System.out.println(listCochesOrdenada);
					break;
				case 6:
					senParada = 0;
					break;
			}
		}while( senParada == 1 );
	}

	public static void menu(){
		System.out.println("######################################");
		System.out.println("	   CONCESIONARIO");
		System.out.println("######################################");	
		System.out.println("1. Introducir un coche\r\n" + 
						   "2. Listar coches\r\n" + 
						   "3. Ordenar los coches (matricula)\r\n" + 
						   "4. Ordenar los coches (km)\r\n" + 
						   "5. Ordenar los coches (marca)\n"	+
						   "6. Salir");
		System.out.println("######################################");	
		System.out.println("\n");
	}
	
	public static void altaCoche() {
		Coche car1 = (Coche) ctx.getBean("coche");
		System.out.println("Introduzca una de las marcas disponibles");
		System.out.println(Marca.verMarcas());
		System.out.println("> ");
		Marca valueMarca = Marca.valueOf(sc.next().toUpperCase());
		
		System.out.println("Introduzca el modelo : ");
		String modelo = sc.next();
		System.out.println("Introduzca la matricula : ");
		String matricula = sc.next();
		System.out.println("Introduzca los km totales : ");
		Double kmTotales = Double.parseDouble(sc.next());
		
		car1.setKmTotales(kmTotales);
		car1.setMarca(valueMarca);
		car1.setMatricula(matricula);
		car1.setModelo(modelo);
		car1.setPropietario(per1);
		
		boolean respuesta = gc.insertar(car1);
		
		System.out.println("\n");
		if(respuesta) {
			System.out.println("REGISTRO CREADO");
		}else {
			System.out.println("ERROR EN LA CREACIÓN");
		}
	}
	
}
