package modelo.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Ordenador {

	private Integer Id;
	@Autowired
	private List<Componente> listComponentes;
	private Double precioOrdenador;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public List<Componente> getListComponentes() {
		return listComponentes;
	}
	public void setListComponentes(List<Componente> listComponentes) {
		this.listComponentes = listComponentes;
	}
	public Double getPrecioOrdenador() {
		return precioOrdenador;
	}
	public void setPrecioOrdenador(Double precioOrdenador) {
		this.precioOrdenador = precioOrdenador;
	}
	@Override
	public String toString() {
		return "Ordenador [Id=" + Id + ", listComponentes=" + listComponentes + ", precioOrdenador=" + precioOrdenador
				+ "]";
	}
	
	
}
