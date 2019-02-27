package modelo.entidades;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GrupoPeliculas {

	@XmlElement
	private List<Pelicula> grupoPeliculas;

	public List<Pelicula> getGrupoPeliculas() {
		return grupoPeliculas;
	}

	public void setGrupoPeliculas(List<Pelicula> grupoPeliculas) {
		this.grupoPeliculas = grupoPeliculas;
	}

	
}
