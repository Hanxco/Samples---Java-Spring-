package ejemplo8;

public class Persona {

	private String nombre; 
	private int edad;
	private Direccion direccion;
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
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
	
	public void inicializar() {
		// Conexión a la bbdd
		// Realizar una conexión
		System.out.println("Inicializando");
		this.nombre = "";
		this.edad = 0;
	}
	
	public void destruir(){
		System.out.println("Argggggg se destruye");
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	
}
