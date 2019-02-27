package ejemplo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ejemplo6.Persona;

public class Main {

	public static ApplicationContext ctx;
	
	static {
		ctx = new ClassPathXmlApplicationContext("beans6.xml");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona personaInner = (Persona) ctx.getBean("persona");
		System.out.println(personaInner);
		
		Persona p1 = ctx.getBean("personaBean", Persona.class);
		Persona p2 = ctx.getBean("personaBean", Persona.class);
		
		/* El problema esta que para parar el contexto no tiene la parada, esta en una clase superior abstracta. 
		 * Hay que hacer un cast del contexto
		 */
		AbstractApplicationContext aac = (AbstractApplicationContext) ctx;
		aac.close();		
		
	}

}
