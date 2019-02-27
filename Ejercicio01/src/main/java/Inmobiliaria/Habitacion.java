package Inmobiliaria;

public class Habitacion {

	private String tipoEstancia; 
	private Double metros2;
	private Boolean tieneVentanas;
	private TipoHabitacion tipoHab;
	
	public String getTipoEstancia() {
		return tipoEstancia;
	}
	
	public TipoHabitacion getTipoHab() {
		return tipoHab;
	}

	public void setTipoHab(TipoHabitacion tipoHab) {
		this.tipoHab = tipoHab;
	}

	@Override
	public String toString() {
		return "[tipoEstancia=" + tipoEstancia + ", metros2=" + metros2 + ", tieneVentanas=" + tieneVentanas + ", tipohab : " + tipoHab
				+ "]\n";
	}

	public void setTipoEstancia(String tipoEstancia) {
		this.tipoEstancia = tipoEstancia;
	}
	public Double getMetros2() {
		return metros2;
	}
	public void setMetros2(Double metros2) {
		this.metros2 = metros2;
	}
	public Boolean getTieneVentanas() {
		return tieneVentanas;
	}
	public void setTieneVentanas(Boolean tieneVentanas) {
		this.tieneVentanas = tieneVentanas;
	}
	
	
}
