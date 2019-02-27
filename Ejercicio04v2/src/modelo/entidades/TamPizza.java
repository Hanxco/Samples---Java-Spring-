package modelo.entidades;

public enum TamPizza {
	PEQUEÑA("25,4 centímetros"),
	MEDIANA("30,4 centímetros"),
	GRANDE("40,6 centímetros");
	
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
