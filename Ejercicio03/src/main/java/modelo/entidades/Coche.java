package modelo.entidades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Coche implements Comparable<Coche> {

	private int Id;
	private String matricula;
	private String marca;
	private String modelo;
	private String kmTotales;
	
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getKmTotales() {
		return kmTotales;
	}
	public void setKmTotales(String kmTotales) {
		this.kmTotales = kmTotales;
	}
	
	public void inicializar() {
		Id++;
		matricula = "";
		marca = null;
		modelo = "";
		kmTotales = null;
	}
	@Override
	public String toString() {
		return "Id : " + Id + " | Matricula  : " + matricula + " | Marca : " + marca + " | Modelo : " + modelo
				+ " | Kilometros Totales : " + kmTotales;
	}
	
	public int compareTo(Coche o) {
		return this.matricula.compareTo(o.getMatricula());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		result = prime * result + ((kmTotales == null) ? 0 : kmTotales.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;

		return true;
	}
	
		
}
