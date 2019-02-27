package ejemplo3;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static ApplicationContext ctx = null;

	static {
		ctx = new ClassPathXmlApplicationContext("beans3.xml");			
	}
	
	public static void main(String[] args) {
		Persona persona = (Persona) ctx.getBean("personaBean");			
		persona.setNombre("Nacho");
		
		Persona personDirector = (Persona) ctx.getBean("director");			
		
		List<Persona> listaPersonas = ctx.getBean("ListaPersonas", List.class);

		listaPersonas.add(persona);
		listaPersonas.add(personDirector);
		
		otroMetodo();
	}
	
	private static void otroMetodo() {
		otroMetodoMas();
	}
	
	private static void otroMetodoMas() {
		List<Persona> listaPersona = ctx.getBean("ListaPersonas", List.class);
		System.out.println(listaPersona);

	}

}
 