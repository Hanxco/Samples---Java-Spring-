package Inmobiliaria;

public class Direccion {
	
	private String nombreVia;
	private String tipoVia;
	private int numero;
	private String codPostal;
	
	@Override
	public String toString() {
		return "Direccion [nombreVia=" + nombreVia + ", tipoVia=" + tipoVia + ", numero=" + numero + ", codPostal="
				+ codPostal + "]";
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	
}
