package Herencia;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Animal tiburon1 = new Tiburon();
		Tiburon tiburon = (Tiburon)tiburon1;
		tiburon.setNombre("Tiburçio");
		tiburon.setEdad(15);
		tiburon.setId(1);	
		tiburon.setNumAletas(4);
		
		Trucha trucha = new Trucha();
		trucha.setNombre("Robustiana");
		trucha.setEdad(1);
		trucha.setId(2);
		trucha.setNumAletas(2);
		
		Oso oso = new Oso();
		oso.setNombre("Yogi");
		oso.setEdad(8);
		oso.setId(3);
	
		List<Animal> listaAnimales = new ArrayList<>();
		
		listaAnimales.add(tiburon);
		listaAnimales.add(trucha);
		listaAnimales.add(oso);
		
		Animal comida = new Oso();
		comida.setNombre("Plactonitus");
		
		for(Animal a : listaAnimales) {
			a.comer(comida);
		}
	}
}
