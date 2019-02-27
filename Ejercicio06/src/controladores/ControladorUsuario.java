package controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import modelo.entidades.Usuario;
import modelo.negocio.GestorUsuarios;

@Controller
@Scope("request")
public class ControladorUsuario {
	
	@Autowired
	private Usuario usuario;
	@Autowired
	private GestorUsuarios gestorUsuarios;
		
	@RequestMapping(path="/", method=RequestMethod.POST)
	public ModelAndView login( @RequestParam("usuario") String usuario,
							   @RequestParam("password") String password,
							   HttpServletRequest req  ) {
		
		ModelAndView mav;
		if(gestorUsuarios.checkCredentials(usuario, password)){
			System.out.println("ENTRA LOGIN");
			mav = new ModelAndView("tiendaPrincipal");
		}else {
			mav = new ModelAndView("redirect:/index.jsp");
		}
		return mav;
	}	
	
	@RequestMapping("usuarios/crear")
	public ModelAndView creacionUsuario() {
		return new ModelAndView("usuarios/crearUsuario");
	}
	
	@RequestMapping(path="usuarios/crear", method=RequestMethod.POST)
	public ModelAndView guardarUsuario( @Valid Usuario usuarioValid, 
										BindingResult br,
										@ModelAttribute Usuario usuario, 
										HttpServletRequest request ) {
		ModelAndView mav;
		
		if(br.hasErrors()) {
			mav = new ModelAndView("usuarios/crearUsuario");
			String msgErrores = "";
			for(FieldError fe : br.getFieldErrors()) {
				msgErrores += "El campo: " + fe.getField() + fe.getDefaultMessage() + "\n";
			}
			mav.addObject("msgErrores", msgErrores);
		}else {
			if(gestorUsuarios.insertarUsuario(usuario)) {
				mav = new ModelAndView("redirect:/index.jsp");			
			}else {
				mav = new ModelAndView("usuarios/crearUsuario");
				mav.addObject("msgError", "Usuario ocupado, vuelva a intentarlo con otro nombre de usuario");
			}
		}
		
		return mav;
	}
	
}
