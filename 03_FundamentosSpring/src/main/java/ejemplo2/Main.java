package ejemplo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception, IllegalAccessException, ClassNotFoundException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans2.xml");
		Imprimible f = ctx.getBean("imprimiblePantalla", Imprimible.class);
		
		f.imprimir("Ola k ase");
		
	}
}
