package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidades.Videojuego;
import modelo.persistencia.VideojuegoDAOjdbcTemplate;

@Service
public class GestorVideojuegos {

	@Autowired
	private VideojuegoDAOjdbcTemplate videojuegoDao;
	
	public List<Videojuego> getListaJuegos(){
		return videojuegoDao.listarVideojuegos();
	}

	public VideojuegoDAOjdbcTemplate getVideojuegoDao() {
		return videojuegoDao;
	}

	public void setVideojuegoDao(VideojuegoDAOjdbcTemplate videojuegoDao) {
		this.videojuegoDao = videojuegoDao;
	}
	
	
}
