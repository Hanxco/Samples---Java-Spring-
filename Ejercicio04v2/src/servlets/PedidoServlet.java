package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Ingredientes;
import modelo.entidades.Pedido;
import modelo.entidades.Persona;
import modelo.entidades.Pizza;
import modelo.negocio.GestorPizza;

/**
 * Servlet implementation class PedidoServlet
 */
@WebServlet("/PedidoServlet")
public class PedidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PedidoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GestorPizza gp = new GestorPizza();
		Pizza pizza = new Pizza();
		Pedido pedido = new Pedido();
		Persona p = new Persona();

		String[] ingredientes = request.getParameterValues("ingredientes");
		
		p.setUsername("root");
		p.setPassword("password");
		p.setNombre("Nacho");
		p.setTelefono(652524152);
		p.setDireccion("C/ Gran v�a 46, Madrid");
		
		pizza.setId("1");		
		List<Ingredientes> listaIngredientes = gp.crearListaIngredientes(ingredientes); 
		pizza.setTam(request.getParameter("tamPizza"));
		pizza.setListaIngredientes(listaIngredientes);
		Double precioTotal = gp.calcularPrecioTotal( pizza );
		pizza.setPrecioTotal(precioTotal);
				
		pedido.setId("1");
		pedido.setPizza(pizza);
		pedido.setPersona(p);
		pedido.setPrecioTotal(precioTotal);
				
		RequestDispatcher rd = request.getRequestDispatcher("detallesPedido.jsp");
		
		request.setAttribute("pedido", pedido);
		request.setAttribute("usuario", p);
		
		rd.forward(request, response);	
	}

}
