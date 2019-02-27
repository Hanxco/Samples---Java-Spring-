package controladores;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import modelo.entidades.GrupoOperacion;
import modelo.entidades.Operacion;
import modelo.negocio.GestorOperacion;

@RestController
public class ControladorOperacion {

	@Autowired
	private GestorOperacion gp;
	
	/**
	 * Devuelve listado de las operaciones registradas en la base de datos en JSON o XML
	 * @return ResponseEntity<GrupoOperacion>
	 */
	@GetMapping(path = "operacion/listar", 
				produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE } )
	public ResponseEntity<GrupoOperacion> listar() {
		try {
			GrupoOperacion gope1 = new GrupoOperacion();
			List<Operacion> lista = gp.listarOperaciones();
			gope1.setListaOperaciones(lista);
			return new ResponseEntity<>(gope1, HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	/**
	 * Busca una operación por tipo de operador en la base de datos
	 * @param String operador
	 * @return ResponseEntity<GrupoOperacion>
	 */
	@GetMapping(path = "operacion/buscar/{operador}", 
			    produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<GrupoOperacion> buscarPorOperador(@PathVariable("operador") String operador) {
		try {
			if (operador.equals("sum") || operador.equals("minus") || operador.equals("mul")
					|| operador.equals("div")) {
				GrupoOperacion gope = new GrupoOperacion();
				List<Operacion> lista = gp.buscarOperaciones(operador);
				gope.setListaOperaciones(lista);
				return new ResponseEntity<>(gope, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(path="operacion/getpdf",
				produces=MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> getPdf( HttpServletResponse response, HttpServletRequest request ) throws DocumentException, IOException{
 
		
        
        FileOutputStream f1 = new FileOutputStream("C:/tmp/texto.pdf");
        f1.write(2);
        f1.close();
        
        String path = "C:/tmp/texto.pdf";
        File f = new File(path);
        
        InputStreamResource resource = new InputStreamResource(new FileInputStream(f));
 
        return ResponseEntity.ok()
                // Content-Disposition
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + f.getName())
                // Content-Type
                .contentType(MediaType.APPLICATION_PDF)
                // Contet-Length
                .contentLength(f.length()) //
                .body(resource);
		
	}
	
	/**
	 * Crea una operación en la base de datos
	 * @param Operacion operacion
	 * @return ResponseEntity<Operacion>
	 */
	@PostMapping(path = "operacion", 
				 consumes = MediaType.APPLICATION_JSON_VALUE,
				 produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Operacion> insertar( @RequestBody Operacion operacion ) {
		try {
			gp.insertar(operacion);
			return new ResponseEntity<Operacion>(operacion, HttpStatus.CREATED);
		}catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<Operacion>(operacion,HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping(path = "operacion/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> borrarOperacion(@PathVariable("id") int id) {
		gp.borrarOperacion(id);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}
	

}
