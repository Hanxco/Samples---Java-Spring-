package ejemplo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		try {
			System.out.println("Contexto cargado");
			
			// Son equivalentes
			Mensaje mensaje = (Mensaje) ctx.getBean("mensajeBean");			
			mensaje = ctx.getBean("mensajeBean", Mensaje.class);
			
			System.out.println(mensaje.getCuerpo());
			System.out.println(mensaje.getFirma());
			
			mensaje.setCuerpo("Nuevo Cuerpo");
			mensaje.setFirma("Felix de Pablo");
			
			System.out.println("CAMBIO DE ATRIBUTOS");
			System.out.println(mensaje.getCuerpo());
			System.out.println(mensaje.getFirma());
			
		}finally {
			((AbstractApplicationContext) ctx).close();
		}
	}

}
