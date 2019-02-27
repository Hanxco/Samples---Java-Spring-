package Herencia;

public class Oso extends Animal {

	@Override
	public void comer(Object o) {
		// TODO Auto-generated method stub
		if( o instanceof Pez) {
			Pez a = (Pez)o;
			System.out.println("Soy un " 
					  + this.getClass().getSimpleName() + ", mi nombre es : " 
					  + this.nombre + " y me voy a comer a : " + a.getNombre());
		}else {
			System.out.println("Puajjjj no se que es eso pero no me gusta");
		}
	}

}
