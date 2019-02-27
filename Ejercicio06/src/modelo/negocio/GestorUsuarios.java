package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidades.Usuario;
import modelo.persistencia.UsuarioDAO;
import modelo.persistencia.UsuarioDAOjdbcTemplate;

@Service
public class GestorUsuarios {
	
	@Autowired
	private UsuarioDAO usuarioDao;

	public UsuarioDAO getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDAO usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	
	public boolean buscarUsuario(Usuario usuario) {
		List<Usuario> listUsuario = usuarioDao.buscarUsuario(usuario.getNombre());
		
		if(listUsuario.size() != 0 ) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkCredentials(String username, String password) {
		List<Usuario> listUsuarios = usuarioDao.verificarCredenciales(username, password);
		if(listUsuarios.size() != 0) {
			return true;
		}
		return false;
	}
	
	public boolean insertarUsuario(Usuario usuario) {
		if(!buscarUsuario(usuario)) {
			this.usuarioDao.insertar(usuario);
			return true;
		}
		return false;
	}

}
