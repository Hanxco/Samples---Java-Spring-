package curso.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.entidades.GrupoVideojuegos;
import curso.modelo.entidades.Videojuego;
import curso.modelo.persistencia.VideojuegoDAOJpaData;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GestorVideojuego {

	@Autowired
	private VideojuegoDAOJpaData videojuegoDao;

	@Transactional
	public Videojuego insertar(Videojuego v) {
		videojuegoDao.save(v);
		return v;
	}
	
	@Transactional
	public VideojuegoDAOJpaData getVideojuegoDao() {
		return videojuegoDao;
	}

	@Transactional
	public void setVideojuegoDao(VideojuegoDAOJpaData videojuegoDao) {
		this.videojuegoDao = videojuegoDao;
	}
	
	@Transactional
	public List<Videojuego> listarVideojuegos() {
		return videojuegoDao.findAll();
	}
	
	@Transactional
	public Videojuego modificarVideojuego( Videojuego v ) {
		return videojuegoDao.save(v);
	}
	
	@Transactional
	public void eliminarVideojuego( Integer id ) {
		videojuegoDao.deleteById(id);
	}
	
	@Transactional
	public Videojuego buscarPorId( int id ) {
		Optional<Videojuego> opVideojuego = videojuegoDao.findById(id);
		return opVideojuego.get();
	}
	
	@Transactional
	public GrupoVideojuegos filtrarVideojuegos( String titulo, String plataforma ) {
		List<Videojuego> lista = new ArrayList<>();
		GrupoVideojuegos grupo = new GrupoVideojuegos();
		
		if(!titulo.equals("") && plataforma.equals("")) {
			lista = videojuegoDao.findByTitulo(titulo);
		}else if(!plataforma.equals("") && titulo.equals("")) {
			lista = videojuegoDao.findByPlataforma(plataforma);
		}else if(!titulo.equals("") && !plataforma.equals("")) {
			lista = videojuegoDao.findByTituloAndPlataforma(titulo, plataforma);
		}
		else {
			lista = videojuegoDao.findAll();
		}
		
		grupo.setListaVideojuegos(lista);
		return grupo;
	}
	
	@Transactional
	public Videojuego modificarJuego( Videojuego v ) {
		if(videojuegoDao.existsById(v.getId())) {
			return videojuegoDao.save(v);			
		}
		return null;
	}
		
}
