package controladores;

import modelo.entidades.Saludos;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import modelo.entidades.Persona;

@Controller
@Scope("request")
public class ControladorSaludos {
	
	@Autowired
	private Saludos saludos;

	@RequestMapping("verFormularioSaludo")
	public ModelAndView verFormulario() {
		ModelAndView mav = new ModelAndView("formularioSaludo");
		return mav;
	}
	
	@RequestMapping("saludo")
	public ModelAndView metodoSaludo( @RequestParam("nombre") String nombre,
									  HttpServletRequest req ) {
		String saludo = "Yo te saludo " + nombre;
		String nombreAux = req.getParameter("nombre");
		System.out.println(nombreAux);
		System.out.println(nombre);
		
		Persona p = new Persona();
		p.setNombre(nombre);
		saludos.getListaSaludos().add(nombre);
		
		// Call to the services
		ModelAndView mav = new ModelAndView("saludo");
		mav.addObject("saludo", saludo);
		mav.addObject("persona", p);
		mav.addObject("listaSaludos", saludos.getListaSaludos());
		return mav;
	}
	
	@RequestMapping("verEntradas")
	public ModelAndView verEntradas() {
		ModelAndView mav = new ModelAndView("entradas");
		return mav;
	}
	
}
