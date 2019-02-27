package curso.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import curso.modelo.entidades.GrupoVideojuegos;
import curso.modelo.negocio.GestorVideojuego;
import curso.modelo.entidades.Videojuego;

import java.util.List;

@RestController
public class ControladorVideojuego {

	@Autowired
	private GestorVideojuego gp;
	
	private ApplicationContext ctx;
	/*
	 * Method : GET
	 * URI : videojuego/viewall
	 * Description : ver listado de todos los videojuegos
	 */
	@GetMapping(path="videojuego/viewall",
				produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }  )
	public ResponseEntity<GrupoVideojuegos> listar(){
		try {
			GrupoVideojuegos grupo = new GrupoVideojuegos();
			
			List<Videojuego> lista = gp.listarVideojuegos();
			grupo.setListaVideojuegos(lista);
			return new ResponseEntity<GrupoVideojuegos>(grupo, HttpStatus.OK);			
		}catch(Exception ex) {
			return new ResponseEntity<GrupoVideojuegos>(HttpStatus.BAD_REQUEST);
		}
	}
	
	/*
	 * Method : POST
	 * URI : videojuego/add
	 * Description : insertar un videojuego
	 */
	@PostMapping(path="videojuego/add",
				 consumes = MediaType.APPLICATION_JSON_VALUE,
				 produces= { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }  )
	public ResponseEntity<Videojuego> insertar( @RequestBody Videojuego v ){
		try {
			gp.insertar(v);
			return new ResponseEntity<Videojuego>(v, HttpStatus.CREATED);
		}catch(Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<>(v, HttpStatus.BAD_REQUEST);
		}
	}
	
	/*
	 * Method : GET
	 * URI : videojuego/search
	 * Description : buscar por titulo o plataforma
	 */
	@GetMapping(path="videojuego/search",
				produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }  )
	public ResponseEntity<GrupoVideojuegos> buscarTitulo( @RequestParam(value="titulo", required=false) String titulo,
														  @RequestParam(value="plataforma", required=false) String plataforma ){
		
		try {
			GrupoVideojuegos gpVideojuegos = gp.filtrarVideojuegos(titulo, plataforma);
			return new ResponseEntity<GrupoVideojuegos>(gpVideojuegos, HttpStatus.OK);					
		}catch(Exception ex) {
			return new ResponseEntity<GrupoVideojuegos>(HttpStatus.NOT_FOUND);
		}
	}
	
	/*
	 * Method : GET
	 * URI : videojuego/{id}
	 * Description : buscar videojuego por id
	 */
	@GetMapping(path="videojuego/{id}",
				produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }  )
	public ResponseEntity<Videojuego> buscarJuego( @PathVariable("id") int id ){
		try {
			Videojuego video = gp.buscarPorId(id);
			return new ResponseEntity<Videojuego>(video, HttpStatus.OK);			
		}catch(Exception ex) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	/*
	 * Method : DELETE
	 * URI : videojuego/{id}
	 * Description : eliminar un juego por id
	 */
	@DeleteMapping(path = "videojuego/{id}",
				   produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE } )
	public ResponseEntity<Videojuego> borrarJuego( @PathVariable("id") int id ) {
		try {
			gp.eliminarVideojuego(id);
			return new ResponseEntity<Videojuego>(HttpStatus.OK);			
		}catch(Exception ex) {
			return new ResponseEntity<Videojuego>(HttpStatus.NOT_FOUND);
		}
	}
	
	/*
	 * Method : PUT
	 * URI : videojuego/modify
	 * Description : modificar videojuego
	 */
	@PutMapping(path = "videojuego/{id}",
				produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }  )
	public ResponseEntity<Videojuego> modificarJuego( @RequestBody Videojuego v, @PathVariable("id") int id ){
		try {
			v.setId(id);
			Videojuego juego = gp.modificarJuego(v);
			return new ResponseEntity<Videojuego>(juego, HttpStatus.ACCEPTED);			
		}catch(Exception ex) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
}
