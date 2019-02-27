package modelo.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import modelo.entidades.Usuario;

@Component
public class UsuarioDAORowMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario u = new Usuario();
		u.setId(rs.getInt("ID"));
		u.setUsuario(rs.getString("USUARIO"));
		u.setPassword(rs.getString("PASSWORD"));
		u.setNombre(rs.getString("NOMBRE"));
		return u;
	}

}
