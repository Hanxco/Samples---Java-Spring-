package modelo.entidades;


import org.springframework.stereotype.Component;

import java.util.List;

public class GrupoOperacion {

	private List<Operacion> listaOperaciones;
	
	public List<Operacion> getListaOperaciones() {
		return listaOperaciones;
	}

	public void setListaOperaciones(List<Operacion> listaOperaciones) {
		this.listaOperaciones = listaOperaciones;
	}

	
	
}
