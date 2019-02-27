package modelo.persistencia;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import modelo.entidades.*;
import modelo.negocio.CompararKm;
import modelo.negocio.CompararMarca;
import modelo.negocio.CompararMatricula;
import presentacion.Main;

public class DAOCoche {
	
	private Map<String, Coche> mapaCoches;
	
	public boolean insertar(Coche c) {
		if( !mapaCoches.containsKey(c.getMatricula()) ) {
			mapaCoches.put(c.getMatricula(), c);
			return true;
		}
		return false;
	}

	public Map<String, Coche> getMapaCoches() {
		return mapaCoches;
	}

	public void setMapaCoches(Map<String, Coche> mapaCoches) {
		this.mapaCoches = mapaCoches;
	}
	
	public void verListadoCoches() {
		for( Map.Entry<String, Coche> pair : mapaCoches.entrySet() ) {
			System.out.println(pair.getValue());
		}
	}
	
	public void ordenar(int opcionOrden) {
		List<Coche> total = Main.ctx.getBean("arrOrdenCoches",ArrayList.class);
		
		total.clear();
		
		for (Coche lis : mapaCoches.values()) 
		    total.add(lis);
		
		if( total.size() != 0 ) {
			if(opcionOrden == 1) {
				Collections.sort(total, new CompararMatricula());
			}
			else if(opcionOrden == 2) {
				Collections.sort(total, new CompararKm());
			}
			else if(opcionOrden == 3) {
				Collections.sort(total, new CompararMarca());
			}
		}
	}
}
