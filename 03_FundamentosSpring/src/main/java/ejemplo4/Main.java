package ejemplo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static ApplicationContext ctx = null;

	static {
		ctx = new ClassPathXmlApplicationContext("beans4.xml");			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona person = (Persona) ctx.getBean("paco");	
		System.out.println(person.getDireccion().getNombreVia());
		
		Persona person1 = (Persona) ctx.getBean("marta");	
		System.out.println(person1.getDireccion().getNombreVia());
			
	}

}
