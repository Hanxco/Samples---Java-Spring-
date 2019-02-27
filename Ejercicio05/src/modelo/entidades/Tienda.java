package modelo.entidades;

import java.util.List;

public class Tienda {
	
	private List<Componente> listadoProcesadores;
	private List<Componente> listadoRAM;
	private List<Componente> listadoAlmacenamiento;
	private List<Componente> listadoCajas;
	private List<Componente> listadoGraficas;

	public List<Componente> getListadoProcesadores() {
		return listadoProcesadores;
	}
	
	public Componente getComponente( Integer id ) {
		for( Componente comp : listadoProcesadores ) {
			if(comp.getId() == id)
				return comp;
		}
		return null;
	}

	public void setListadoProcesadores(List<Componente> listadoProcesadores) {
		this.listadoProcesadores = listadoProcesadores;
	}

	public List<Componente> getListadoRAM() {
		return listadoRAM;
	}

	public void setListadoRAM(List<Componente> listadoRAM) {
		this.listadoRAM = listadoRAM;
	}

	public List<Componente> getListadoAlmacenamiento() {
		return listadoAlmacenamiento;
	}

	public void setListadoAlmacenamiento(List<Componente> listadoAlmacenamiento) {
		this.listadoAlmacenamiento = listadoAlmacenamiento;
	}

	public List<Componente> getListadoCajas() {
		return listadoCajas;
	}

	public void setListadoCajas(List<Componente> listadoCajas) {
		this.listadoCajas = listadoCajas;
	}

	public List<Componente> getListadoGraficas() {
		return listadoGraficas;
	}

	public void setListadoGraficas(List<Componente> listadoGraficas) {
		this.listadoGraficas = listadoGraficas;
	}

	@Override
	public String toString() {
		return "Tienda [listadoProcesadores=" + listadoProcesadores + ", listadoRAM=" + listadoRAM
				+ ", listadoAlmacenamiento=" + listadoAlmacenamiento + ", listadoCajas=" + listadoCajas
				+ ", listadoGraficas=" + listadoGraficas + "]";
	}	
	
	

}
