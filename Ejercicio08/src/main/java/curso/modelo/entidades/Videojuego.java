package curso.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity(name="videojuego")
@XmlRootElement(name="videojuego")
@XmlType(propOrder = {
		"id",
		"titulo",
		"precio",
		"empresa",
		"plataforma",
		"unidadesStock"
})
@Table(name="videojuego")
public class Videojuego implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -786429079577837391L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private Double precio;
	private String empresa;
	private String plataforma;
	private Integer unidadesStock;
	
	@XmlAttribute
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@XmlAttribute
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@XmlAttribute
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	@XmlAttribute
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@XmlAttribute
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	@XmlAttribute
	public Integer getUnidadesStock() {
		return unidadesStock;
	}
	public void setUnidadesStock(Integer unidadesStock) {
		this.unidadesStock = unidadesStock;
	}

	
}
