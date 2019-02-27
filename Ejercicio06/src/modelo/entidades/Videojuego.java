package modelo.entidades;

import java.util.Date;

public class Videojuego {

	private Integer id;
	private String titulo;
	private Double precio;
	private String empresa;
	private String plataforma;
	private Date fechaLanzamiento;
	private Integer unidadesStock;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	public Integer getUnidadesStock() {
		return unidadesStock;
	}
	public void setUnidadesStock(Integer unidadesStock) {
		this.unidadesStock = unidadesStock;
	}
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", titulo=" + titulo + ", precio=" + precio + ", empresa=" + empresa
				+ ", plataforma=" + plataforma + ", fechaLanzamiento=" + fechaLanzamiento + ", unidadesStock="
				+ unidadesStock + "]";
	}

	
}
