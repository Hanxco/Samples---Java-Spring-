package modelo.entidades;

public class Coche implements Comparable<Coche> {

	private int Id;
	private String matricula;
	private Marca marca;
	private String modelo;
	private Double kmTotales;
	private Persona propietario;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getKmTotales() {
		return kmTotales;
	}
	public void setKmTotales(Double kmTotales) {
		this.kmTotales = kmTotales;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	
	public void inicializar() {
		Id++;
		matricula = "";
		marca = null;
		modelo = "";
		kmTotales = null;
		propietario = null;
	}
	@Override
	public String toString() {
		return "Coche [Id=" + Id + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ ", kmTotales=" + kmTotales + ", propietario=" + propietario + "]\n";
	}
	
	public int compareTo(Coche o) {
		return this.matricula.compareTo(o.getMatricula());
	}
	
		
}
