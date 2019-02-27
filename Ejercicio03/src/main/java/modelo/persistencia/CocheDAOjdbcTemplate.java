package modelo.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import modelo.entidades.Coche;

@Repository(value="daoCoche")
public class CocheDAOjdbcTemplate implements CocheDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private CocheDAORowMapper cocheRowMapper;
	
	@Override
	public void insertar(Coche coche) {
		String query = "insert into coches (MATRICULA, MODELO, KMTOTALES, MARCA) values (?,?,?,?)";
		
		jdbcTemplate.update(query,
							coche.getMatricula(),
							coche.getModelo(),
							coche.getKmTotales(),
							coche.getMarca()); 
	}

	@Override
	public void modificar(Coche coche) {
		String query = "update coches set MATRICULA=?,MODELO=?,KMTOTALES=?,MARCA=? where id=?";

		jdbcTemplate.update(query,
						coche.getMatricula(), 
						coche.getModelo(), 
						coche.getKmTotales(), 
						coche.getMarca(),
						coche.getId());
	}
	
	@Override
	public void borrar(Integer id) {
		String query = "delete from coches where id=?";

		jdbcTemplate.update(query,id);		
	}

	@Override
	public Coche buscar(String matricula) {
		String query = "select * from coches where matricula=?";

		return jdbcTemplate.queryForObject(query, cocheRowMapper, matricula); 
	}

	@Override
	public List<Coche> listarCoches() {
		String query = "select * from coches";
		List<Coche> lista = jdbcTemplate.query(query, cocheRowMapper);
		return lista; 
	}

}
