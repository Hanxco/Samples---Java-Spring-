package modelo.entidades;

public enum Ingredientes {
	JAMÓN(1.5),
	BACON(2),
	QUESO(0.5);
	
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
