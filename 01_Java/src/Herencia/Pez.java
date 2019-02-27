package Herencia;

public abstract class Pez extends Animal {

	private int numAletas;

	public int getNumAletas() {
		return numAletas;
	}

	public void setNumAletas(int numAletas) {
		this.numAletas = numAletas;
	}

	@Override
	public void comer(Object o) {
		if( o instanceof Placton ) {
			System.out.println("Soy un pez de tipo : " 
							  + this.getClass().getSimpleName() + ", mi nombre es : " 
							  + this.nombre + " y me voy a comer el Placton");
		}else {
			System.out.println("Soy un pez y solo como placton");
		}
	}

}
