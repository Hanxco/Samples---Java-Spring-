package modelo.entidades;

public enum TamPizza {
	PEQUE�A("25,4 cent�metros"),
	MEDIANA("30,4 cent�metros"),
	GRANDE("40,6 cent�metros");
	
	private String dimensiones;

	private TamPizza(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	
	
	
}
