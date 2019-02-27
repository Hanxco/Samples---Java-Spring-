package ejemplo0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ImprimirFichero implements Imprimible {

	public void imprimir( String out ) {
		File file = new File("fichero.txt");
		try( PrintWriter pw = new PrintWriter(file) ){			
			pw.print( out );
		}
		catch( FileNotFoundException e ) {
			e.printStackTrace();
		}
	}
}
