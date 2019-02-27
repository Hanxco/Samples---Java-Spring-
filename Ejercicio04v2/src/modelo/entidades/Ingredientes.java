package modelo.entidades;

public enum Ingredientes {
	JAM�N(1.5),
	BACON(1.5),
	QUESO(1),
	ACEITUNAS(0.5),
	AT�N(1.2),
	CEBOLLA(0.5),
	PI�A(2),
	CHAMPI�ON(1);
	
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
