package ejemplo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static ApplicationContext ctx = null;

	static {
		ctx = new ClassPathXmlApplicationContext("beans5.xml");			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Persona personaInner = (Persona) ctx.getBean("personaInner");
		Persona personaInner2 = (Persona) ctx.getBean("personaInner2");
		// Se modifica en caliente
		personaInner.setNombre("Luis"); 

		System.out.println(personaInner.toString());
		System.out.println(personaInner.getDireccion());
		System.out.println("##################################");
		
		System.out.println(personaInner2.toString());
	}

}
