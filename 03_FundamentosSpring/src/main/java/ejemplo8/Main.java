package ejemplo8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static ApplicationContext ctx;
	
	static {
		ctx = new ClassPathXmlApplicationContext("beans8.xml");
	}
	
	public static void main(String[] args) {
		Persona per1 = (Persona) ctx.getBean("persona");
		Persona per2 = (Persona) ctx.getBean("persona");
		
		per2.setNombre("Calamardo");
		
		System.out.println(per1);
		System.out.println(per2);
	}

}
