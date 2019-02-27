package modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import modelo.entidades.Operacion;

import java.util.List;

public interface OperacionDAOJpaData extends JpaRepository<Operacion, Integer> {
	
	List<Operacion> findByOperador(String operador);

}
