
public class Direccion {

	private String nombreVia;
	private String tipoVia;
	private int numero;
	private String codPostal;
	
	public Direccion() {
		super();
	}
	
	public Direccion(String nombreVia, String tipoVia, int numero, String codPostal, String pais) {
		super();
		this.nombreVia = nombreVia;
		this.tipoVia = tipoVia;
		this.numero = numero;
		this.codPostal = codPostal;
		this.pais = pais;
	}
	
	private String pais;
	
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	@Override
	public String toString() {
		return "Direccion [nombreVia=" + nombreVia + ", tipoVia=" + tipoVia + ", numero=" + numero + ", codPostal="
				+ codPostal + ", pais=" + pais + "]";
	}

	
}
