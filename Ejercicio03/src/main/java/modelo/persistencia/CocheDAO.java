package modelo.persistencia;

import java.util.List;

import modelo.entidades.Coche;

public interface CocheDAO {

	public void insertar(Coche coche);
	void modificar(Coche coche);
	void borrar(Integer cocheId);
	Coche buscar(String matricula);
	List<Coche> listarCoches();
}
