package modelo.entidades;

import java.util.List;

public class Pizza {

	private String id;
	private String tam;
	private Double precioTotal;
	private List<Ingredientes> listaIngredientes;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTam() {
		return tam;
	}
	public void setTam(String tam) {
		this.tam = tam;
	}
	public Double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public List<Ingredientes> getListaIngredientes() {
		return listaIngredientes;
	}
	public void setListaIngredientes(List<Ingredientes> listaIngredientes) {
		this.listaIngredientes = listaIngredientes;
	}
	@Override
	public String toString() {
		return "Pizza [id=" + id + ", tam=" + tam + ", precioTotal=" + precioTotal + ", listaIngredientes="
				+ listaIngredientes + "]";
	}
	
	
	
}
