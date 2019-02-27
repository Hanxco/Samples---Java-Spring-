package controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import modelo.entidades.Componente;
import modelo.entidades.Tienda;
import modelo.entidades.Usuario;

@Controller
@Scope("request")
public class ControladorUsuario {

	@Autowired
	private Usuario usuario;
	
	@Autowired
	private ApplicationContext ctx;

	@RequestMapping("/")
	public ModelAndView verFormulario( @RequestParam("username") String username,
									   @RequestParam("password") String password,
									   HttpServletRequest req ) {
		
		ModelAndView mav;
		
		Tienda tienda = (Tienda) ctx.getBean("tienda");
		if( username.equals("root") && password.equals("root") ) {
			mav = new ModelAndView("principal");
			mav.addObject("listadoProcesadores", tienda.getListadoProcesadores());
			mav.addObject("listadoRAM", tienda.getListadoRAM());
			mav.addObject("listadoAlmacenamiento", tienda.getListadoAlmacenamiento());
			mav.addObject("listadoCajas", tienda.getListadoCajas());
			mav.addObject("listadoGraficas", tienda.getListadoCajas());
			req.getSession().setAttribute("username", username);
			req.getSession().setAttribute("password", password);
		}else {
			mav = new ModelAndView("redirect:/index.jsp");	
			String msgReturn = "Usuario o contrasenas incorrectos. Vuelva a intentarlo";
			mav.addObject("confirmacion", msgReturn);
		}
		return mav;
	}
	
	
}
