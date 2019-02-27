package modelo.entidades;

public class Opcion {

	private String id;
	private String titulo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	} 
	
	@Override
	public String toString() {
		return "Opcion [id=" + id + ", titulo=" + titulo + "]";
	}
}
