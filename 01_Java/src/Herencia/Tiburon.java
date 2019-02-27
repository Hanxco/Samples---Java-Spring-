package Herencia;

public class Tiburon extends Pez{

	@Override
	public void comer(Object o) {
		if( o instanceof Animal) {
			Animal a = (Animal)o;
			System.out.println("Soy un " 
					  + this.getClass().getSimpleName() + ", mi nombre es : " 
					  + this.nombre + " y me voy a comer a : " + a.getNombre());
		}else {
			System.out.println("Puajjjj no se que es eso pero no me gusta");
		}
	}

}
