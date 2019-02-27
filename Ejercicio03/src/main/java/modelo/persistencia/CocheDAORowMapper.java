package modelo.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import modelo.entidades.Coche;

@Component
public class CocheDAORowMapper implements RowMapper<Coche> {

	@Override
	public Coche mapRow(ResultSet rs, int rowNum) throws SQLException {
		Coche coche = new Coche();
		coche.setId(rs.getInt("ID"));
		coche.setMatricula(rs.getString("MATRICULA"));
		coche.setKmTotales(rs.getString("KMTOTALES"));
		coche.setMarca(rs.getString("MARCA"));
		coche.setModelo(rs.getString("MODELO"));
		
		return coche;
	}

}
