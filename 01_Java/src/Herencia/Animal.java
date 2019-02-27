package Herencia;

public abstract class Animal {

	protected int id;
	protected String nombre; 
	protected int edad;
	protected TipoAlimentacion tipoAlimentacion;
	
	public Animal() {
		super();
	}
	
	public Animal(int id, String nombre, int edad, TipoAlimentacion tipoAlimentacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.tipoAlimentacion = tipoAlimentacion;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public TipoAlimentacion getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(TipoAlimentacion tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}
	
	public abstract void comer(Object o);	
}
