package modelo.negocio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import modelo.entidades.Coche;
import modelo.persistencia.CocheDAO;

@Service(value="gestorcoche")
public class GestorCoche {
	
	@Autowired
	@Qualifier("daoCoche")
	private CocheDAO cocheDao;
	
	public CocheDAO getDaoCoche() {
		return cocheDao;
	}

	public void setDaoCoche(CocheDAO daoCoche) {
		cocheDao = daoCoche;
	}

	public Boolean insertar(Coche c) {
		List<Coche> listado = cocheDao.listarCoches();
		boolean insert = listado.contains(c);
		if(!insert) {
			if(verificacionMatricula(c)) {
				cocheDao.insertar(c);
				return true;
			}
		}
		return false;
	}
	
	public Coche buscar(String matricula) {
		return cocheDao.buscar(matricula);
	}
	
	public void modificar(Coche c) {
		if(verificacionMatricula(c)) {
			cocheDao.modificar(c);
		}
	}
	
	public Boolean verificacionMatricula(Coche c) {
		if(c.getMatricula().length() == 7) {
			return true;
		}else {
			return false;			
		}
	}
	
	public void eliminar(Integer id) {
		cocheDao.borrar(id);
	}
	
	public List<Coche> listado(){
		return cocheDao.listarCoches();
	}
	
} 
