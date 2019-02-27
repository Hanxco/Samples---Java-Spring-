package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import modelo.negocio.GestorVideojuegos;

@Controller
@Scope("request")
public class ControladorTienda {

	@Autowired
	private GestorVideojuegos gestorJuegos;
	
	@RequestMapping("verlistado")
	public ModelAndView verTienda() {
		ModelAndView mav = new ModelAndView("listadoTienda");
		mav.addObject("listajuegos", gestorJuegos.getListaJuegos());
		return mav;
	}	
	
}
