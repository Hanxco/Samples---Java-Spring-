package modelo.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import modelo.entidades.Videojuego;

public class VideojuegoDAORowMapper implements RowMapper<Videojuego>{

	@Override
	public Videojuego mapRow(ResultSet rs, int rowNum) throws SQLException {
		Videojuego v = new Videojuego();
		v.setId(rs.getInt("ID"));
		v.setTitulo(rs.getString("TITULO"));
		v.setEmpresa(rs.getString("EMPRESA"));
		v.setPlataforma(rs.getString("PLATAFORMA"));
		v.setUnidadesStock(rs.getInt("UNIDADESSTOCK"));
		return v;
	}

}
