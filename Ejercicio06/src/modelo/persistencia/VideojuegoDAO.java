package modelo.persistencia;

import java.util.List;
import modelo.entidades.Videojuego;

public interface VideojuegoDAO {
	void insertar(Videojuego juego);
	void modificar(Videojuego juego);
	void borrar(Integer juegoId);
	List<Videojuego> listarVideojuegos();
}
