package modelo.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import modelo.entidades.Usuario;

@Repository(value="daousuario")
public class UsuarioDAOjdbcTemplate implements UsuarioDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private UsuarioDAORowMapper usuarioDaoRowMapper;
	
	@Override
	public void insertar(Usuario usuario) {
		String query = "insert into usuarios (USUARIO, PASSWORD, NOMBRE) values (?,?,?)";
		
		jdbcTemplate.update(query,
							usuario.getUsuario(),
							usuario.getPassword(),
							usuario.getNombre());
	}

	@Override
	public void modificar(Usuario usuario) {
		String query = "update usuarios set USUARIO=?,PASSWORD=?,NOMBRE=? WHERE id=?";
		
		jdbcTemplate.update(query,
							usuario.getUsuario(),
							usuario.getPassword(),
							usuario.getNombre());
	}

	@Override
	public void borrar(Integer userId) {
		String query = "delete from usuarios WHERE id=?";
		
		jdbcTemplate.update(query,userId);
	}

	@Override
	public List<Usuario> listarUsuario() {
		return jdbcTemplate.query("select * from usuarios", usuarioDaoRowMapper);
	}
	
	@Override
	public List<Usuario> verificarCredenciales( String username, String password ) {
		String query = "select * from usuarios where USUARIO='"+username+"' and PASSWORD='"+password+"'";
		
		return jdbcTemplate.query(query, usuarioDaoRowMapper);
	}

	@Override
	public List<Usuario> buscarUsuario(String username) {
		return jdbcTemplate.query("SELECT * FROM usuarios where USUARIO='"+username+"'", usuarioDaoRowMapper);
	}
		
}
