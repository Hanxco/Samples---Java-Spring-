package controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import modelo.entidades.Componente;
import modelo.entidades.Ordenador;
import modelo.entidades.Pedido;
import modelo.entidades.Tienda;
import modelo.entidades.Usuario;

@Controller
@Scope("request")
public class ControladorTienda {
	
	@Autowired
	private Pedido pedido;
	@Autowired
	private ApplicationContext ctx;
	
	@RequestMapping("/addCesta")
	public ModelAndView addCesta(  HttpServletRequest req ) {
		System.out.println("ADD CESTA");
		Tienda tienda = (Tienda) ctx.getBean("tienda");

		String[] procesadores = req.getParameterValues("procesadores");
		String[] ram = req.getParameterValues("memoriasram");
		String[] almacenamiento = req.getParameterValues("almacenamiento");
		String[] graficas = req.getParameterValues("graficas");
		String[] cajas = req.getParameterValues("cajas");
		
		List<Componente> bean = (List<Componente>) ctx.getBean("listComponentes");
		List<Componente> listComponentes = bean;
		
		for(String i : procesadores) {
			listComponentes.add(tienda.getComponente(Integer.valueOf(i)));
		}
		
		Ordenador pc = (Ordenador) ctx.getBean("ordenador");
		pc.setId(0);
		pc.setListComponentes(listComponentes);
		pc.setPrecioOrdenador(111.0);
		
		List<Ordenador> bean1 = (List<Ordenador>) ctx.getBean("listpcs");
		List<Ordenador> listpcs = bean1;
		
		listpcs.add(pc);
		
		Usuario user = (Usuario) ctx.getBean("usuario");
		pedido.setId("0");
		pedido.setIdUser(user);
		pedido.setListadoOrdenadores(listpcs);

		System.out.println(pedido);
		
		ModelAndView mav = new ModelAndView("principal");
		mav.addObject("listadoProcesadores", tienda.getListadoProcesadores());
		mav.addObject("listadoRAM", tienda.getListadoRAM());
		mav.addObject("listadoAlmacenamiento", tienda.getListadoAlmacenamiento());
		mav.addObject("listadoCajas", tienda.getListadoCajas());
		mav.addObject("listadoGraficas", tienda.getListadoCajas());

		req.getSession().setAttribute("pedido", pedido);

		return mav;
	}
	
	@RequestMapping("/hacerPedido")
	public ModelAndView hacerPedido(  HttpServletRequest req ) {
		System.out.println("HACER PEDIDO");

		ModelAndView mav = new ModelAndView("detalle");
		mav.addObject("pedido", req.getSession().getAttribute("pedido"));

		return mav;
	}
	
	
}
