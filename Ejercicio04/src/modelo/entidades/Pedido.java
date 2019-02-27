package modelo.entidades;

import java.sql.Date;

public class Pedido {
	
	private String id;
	private Persona persona;
	private Pizza pizza;
	private Date fechaHora;
	private Double precioTotal;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public Double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", persona=" + persona + ", pizza=" + pizza + ", fechaHora=" + fechaHora
				+ ", precioTotal=" + precioTotal + "]";
	}
	
	

}
