package ejemplo0;

public class Main {

	public static void main(String[] args) throws Exception, IllegalAccessException, ClassNotFoundException {
/*		String opcion = args[0];
		// Desde la v. 1.7 se peuden comparar también cadenas en las sentencias switch

		Imprimible f = new FactoriaImprimibles().crear(opcion);
		f.imprimir("ola");
		*/
		
		Imprimible f = (Imprimible) Class.forName(args[0]).newInstance();
		f.imprimir("Imprimible con la carga dinámica de clases	");
	}
}
