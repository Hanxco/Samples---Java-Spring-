package controladores;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.cj.protocol.NetworkResources;

import modelo.negocio.GestorPelicula;
import modelo.entidades.GrupoPeliculas;
import modelo.entidades.Pelicula;

//@Controller
/*@ResponseBody, hacemos que en el body del http response, va el objeto
 * devuelto por el metodod
 * RestController es la suma del controller y del responseBody
 *
 */
@RestController
public class ControladorPelicula {

	@Autowired
	private GestorPelicula gp;
	
	//@RequestMapping(path="peliculas", method=RequestMethod.POST)
	@PostMapping(path="peliculas",
			 	 consumes=MediaType.APPLICATION_JSON_VALUE,
			 	 produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pelicula> insertar( @RequestBody Pelicula pelicula ){
		try {
			gp.insertar(pelicula);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<Pelicula>(pelicula,HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(path="peliculas", 
				produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GrupoPeliculas> listar(){
		List<Pelicula> listaPeliculas = gp.listar();
		GrupoPeliculas lp = new GrupoPeliculas();
		lp.setGrupoPeliculas(listaPeliculas);
		return new ResponseEntity<>(lp,HttpStatus.OK);
	}
	
	@GetMapping(path="peliculas/{id}",
				produces=MediaType.APPLICATION_JSON_VALUE)
	public Pelicula buscarPelicula( @PathVariable("id") int id ) {
		return gp.getPelicula(id);
	}
	
	@DeleteMapping(path="peliculas/{id}",
				   produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> borrarPelicula( @PathVariable("id") int id ) {
		gp.borrarPelicula(id);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}
	
	@PutMapping(path="peliculas/{id}")
	public ResponseEntity<Pelicula> modificarPelicula( @RequestBody Pelicula pelicula, @PathVariable("id") int id ) {
		pelicula.setId(id);
		gp.modificarPelicula(pelicula);
		return new ResponseEntity<Pelicula>(pelicula, HttpStatus.OK);
	}
	/*
	@GetMapping(path="peliculas", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pelicula> listar( @RequestParam("titulo") String titulo,
										    @RequestParam("orden") String orden){
	  return new ResponseEntity<Pelicula>();
	0}
	
	*/
}
