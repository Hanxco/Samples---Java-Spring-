package curso.modelo.entidades;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

import java.util.List;
import curso.modelo.entidades.Videojuego;

@Component(value="grupovideojuego")
@XmlRootElement(name="videojuegos")
public class GrupoVideojuegos {

	private List<Videojuego> listaVideojuegos;

	@XmlElement(name="videojuego")
	public List<Videojuego> getListaVideojuegos() {
		return listaVideojuegos;
	}

	public void setListaVideojuegos(List<Videojuego> listaVideojuegos) {
		this.listaVideojuegos = listaVideojuegos;
	}
	
	
}
