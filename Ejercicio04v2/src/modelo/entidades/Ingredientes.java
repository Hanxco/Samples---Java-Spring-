package modelo.entidades;

public enum Ingredientes {
	JAMÓN(1.5),
	BACON(1.5),
	QUESO(1),
	ACEITUNAS(0.5),
	ATÚN(1.2),
	CEBOLLA(0.5),
	PIÑA(2),
	CHAMPIÑON(1);
	
	private double precio;

	private Ingredientes(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
