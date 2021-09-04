package turismoEnLaTierraMedia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AdministradorDeArchivos {

	public static List<Atraccion> leerAtracciones() {
		File f = new File("files/Atracciones.txt");
		Scanner sc;
		List<Atraccion> atracciones = new LinkedList<Atraccion>();
		String[] line;
		
		try {
			sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				line = sc.nextLine().split("-");
				atracciones.add(new Atraccion(
						line[0],
						Integer.parseInt(line[1]),
						Double.parseDouble(line[2]),
						Integer.parseInt(line[3]),
						TipoDeAtraccion.valueOf(line[4])
												)
								);
				
				line = null;
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		}
		
		return atracciones;
	}
	
	public static void escribirAtracciones(List<Atraccion> atracciones) {
		File f = new File("files/atraccionesOUT.txt");
		PrintWriter pw;
		
		try {
			pw = new PrintWriter(f);
			
			for(Atraccion v : atracciones) 
				pw.write(v.toString()+"\n");
			
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			
	}
}
