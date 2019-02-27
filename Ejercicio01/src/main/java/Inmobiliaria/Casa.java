package Inmobiliaria;

import java.util.Arrays;

public class Casa {

	private String id;
	private Double precio;
	private Direccion direccion;
	private Boolean plazaGaraje;
	private Boolean trastero;
	private Double metrosTotales;
	private Habitacion[] habitaciones;
	private Persona[] propietarios;
	private Persona[] inquilinos;	
	
	public String getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Casa [id=" + id + ", precio=" + precio + ", direccion=" + direccion + ", plazaGaraje=" + plazaGaraje
				+ ", trastero=" + trastero + ", metrosTotales=" + metrosTotales + ", habitaciones="
				+ Arrays.toString(habitaciones) + ", propietarios=" + Arrays.toString(propietarios) + ", inquilinos="
				+ Arrays.toString(inquilinos) + "]";
	}
	
	public String printPretty() {
		return "Casa \n id = " + id + "\n precio = " + precio + "\n direccion = " + direccion + "\n plazaGaraje = " + plazaGaraje
				+ "\n trastero = " + trastero + "\n metrosTotales = " + metrosTotales + "\n habitaciones : \n"
				+ Arrays.toString(habitaciones) + "\n propietarios : \n " + Arrays.toString(propietarios) + "\n inquilinos : \n "
				+ Arrays.toString(inquilinos);
	}
	
	public void setId(String id) {
		this.id = id; 
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Boolean getPlazaGaraje() {
		return plazaGaraje;
	}
	public void setPlazaGaraje(Boolean plazaGaraje) {
		this.plazaGaraje = plazaGaraje;
	}
	public Boolean getTrastero() {
		return trastero;
	}
	public void setTrastero(Boolean trastero) {
		this.trastero = trastero;
	}
	public Double getMetrosTotales() {
		return metrosTotales;
	}
	public void setMetrosTotales(Double metrosTotales) {
		this.metrosTotales = metrosTotales;
	}
	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}
	public Persona[] getPropietarios() {
		return propietarios;
	}
	public void setPropietarios(Persona[] propietarios) {
		this.propietarios = propietarios;
	}
	public Persona[] getInquilinos() {
		return inquilinos;
	}
	public void setInquilinos(Persona[] inquilinos) {
		this.inquilinos = inquilinos;
	}
}
