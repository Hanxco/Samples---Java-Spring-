package modelo.entidades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@Scope("session")
public class Pedido {
	
	private String id;
	private Usuario idUser;
	@Autowired
	private List<Ordenador> listadoOrdenadores;
	private Double precioTotal;
	private Date fechaHoraPedido;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Usuario getIdUser() {
		return idUser;
	}
	public void setIdUser(Usuario idUser) {
		this.idUser = idUser;
	}
	public List<Ordenador> getListadoOrdenadores() {
		return listadoOrdenadores;
	}
	public void setListadoOrdenadores(List<Ordenador> listadoOrdenadores) {
		this.listadoOrdenadores = listadoOrdenadores;
	}
	public Double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public Date getFechaHoraPedido() {
		return fechaHoraPedido;
	}
	public void setFechaHoraPedido(Date fechaHoraPedido) {
		this.fechaHoraPedido = fechaHoraPedido;
	}
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", idUser=" + idUser + ", listadoOrdenadores=" + listadoOrdenadores
				+ ", precioTotal=" + precioTotal + ", fechaHoraPedido=" + fechaHoraPedido + "]";
	}
	
	
	
}
