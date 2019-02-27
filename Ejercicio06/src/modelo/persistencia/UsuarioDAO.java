package modelo.persistencia;

import java.util.List;
import modelo.entidades.Usuario;

public interface UsuarioDAO {

	void insertar(Usuario usuario);
	void modificar(Usuario usuario);
	void borrar(Integer userId);
	List<Usuario> listarUsuario();
	List<Usuario> verificarCredenciales(String username, String password);
	List<Usuario> buscarUsuario(String username);
	
}
