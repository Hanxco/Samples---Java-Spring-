package modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itextpdf.text.Element;

import modelo.persistencia.OperacionDAOJpaData;

import modelo.entidades.Operacion;
import java.util.List;

@Service
public class GestorOperacion {

	@Autowired
	private OperacionDAOJpaData operacionDao;
	
	@Transactional
	public void insertar(Operacion p) {
		p.operar();
		
		operacionDao.save(p);
	}
	
	@Transactional 
	public List<Operacion> listarOperaciones() {
		return operacionDao.findAll();
	}
	
	@Transactional
	public List<Operacion> buscarOperaciones( String operador ){
		return operacionDao.findByOperador(operador);
	}
	
	@Transactional
	public void borrarOperacion( Integer id ) {
		operacionDao.delete(id);
	}
	
	@Transactional
	public String getStringPdf() {
		List<Operacion> listOperacion = operacionDao.findAll();
		String text = "";
		for(Operacion item : listOperacion) {
			text += item.getNum1() + item.getOperador() + item.getNum2() + " = " + item.getResultado() +"\n";
		}
		return text;
	}
}
