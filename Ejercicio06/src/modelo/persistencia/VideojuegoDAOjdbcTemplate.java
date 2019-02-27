package modelo.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import modelo.entidades.Videojuego;

@Repository(value="daovideojuego")
public class VideojuegoDAOjdbcTemplate implements VideojuegoDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private VideojuegoDAORowMapper videojuegoRowMapper;
	
	@Override
	public void insertar(Videojuego juego) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(Videojuego juego) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Integer juegoId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Videojuego> listarVideojuegos() {
		return jdbcTemplate.query("select * from usuarios", videojuegoRowMapper);
	}

}
