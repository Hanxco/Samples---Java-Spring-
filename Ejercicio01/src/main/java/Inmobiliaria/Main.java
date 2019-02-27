package Inmobiliaria;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Inmobiliaria.Persona;


public class Main {

	public static ApplicationContext ctx = null;

	static {
		ctx = new ClassPathXmlApplicationContext("bean.xml");			
	}
	
	public static void main(String[] args) {
		/* 
		 * 
		 * DECLARACIÓN DE BEANS 
	     *
	     *
		*/
		List<Persona> listaPropietarios1 = ctx.getBean("listaPropietarios", List.class);
		List<Persona> listaInquilinos1 = ctx.getBean("listaInquilinos", List.class);
		List<Habitacion> listaHabitaciones = ctx.getBean("listaHabitaciones", List.class);

		// Personas
		Persona propietario1 = (Persona) ctx.getBean("persona");	
		Persona inquilino1 = (Persona) ctx.getBean("persona");			
		Persona inquilino2 = (Persona) ctx.getBean("persona");			

		// Propietario1
		propietario1.setNombre("Nacho");
		propietario1.setApellidos("Hita");	
		propietario1.setDni("41414141X");
		propietario1.setEdad(25);
		
		// Direccion
		Direccion direccion1 = (Direccion) ctx.getBean("direccion");
			
		direccion1.setNombreVia("Gran via");
		direccion1.setCodPostal("28043");
		direccion1.setNumero(5);
		direccion1.setTipoVia("Calle");
		
		// Inquilinos
		inquilino1.setNombre("Ramon");
		inquilino1.setApellidos("Perez");
		inquilino1.setDni("20202020X");
		inquilino1.setEdad(32);
		inquilino1.setDireccion(direccion1);
		
		inquilino2.setNombre("Joaquin");
		inquilino2.setApellidos("Lopez");
		inquilino2.setDni("8985874X");
		inquilino2.setEdad(38);
		inquilino2.setDireccion(direccion1);
		
		// Habitacion1
		Habitacion habitacion1 = (Habitacion) ctx.getBean("habitacion");	
		habitacion1.setMetros2(45.5);
		habitacion1.setTieneVentanas(true);
		habitacion1.setTipoEstancia("Amplia");
		habitacion1.setTipoHab( TipoHabitacion.COCINA );

		// Habitacion2
		Habitacion habitacion2 = (Habitacion) ctx.getBean("habitacion");	
		habitacion2.setMetros2(25.5);
		habitacion2.setTieneVentanas(false);
		habitacion2.setTipoEstancia("Pequeña");
		habitacion2.setTipoHab( TipoHabitacion.DORMITORIO );

		listaPropietarios1.add(propietario1);
		listaInquilinos1.add(inquilino1);
		listaInquilinos1.add(inquilino2);
		
		listaHabitaciones.add(habitacion1);
		listaHabitaciones.add(habitacion2);
				
		//Casa
		Casa casa1 = (Casa) ctx.getBean("casa");
		casa1.setDireccion(direccion1);
		casa1.setId("1");
		casa1.setMetrosTotales(120.5);
		casa1.setPlazaGaraje(true);
		casa1.setPrecio(500.0);
		casa1.setTrastero(true);
		
		System.out.println(casa1.printPretty());
	}
}
