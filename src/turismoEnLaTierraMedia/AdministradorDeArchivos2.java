package turismoEnLaTierraMedia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AdministradorDeArchivos2 {
	
	public static List<Usuario> leerUsuarios() {
		File f = new File("files/Usuarios.txt");
		Scanner sc;
		List<Usuario> usuarios = new LinkedList<Usuario>();
		String[] line;
		
		try {
			sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				line = sc.nextLine().split("-");
//				System.out.println(line.toString());
				usuarios.add(new Usuario(TipoDeAtraccion.valueOf(line[0]),
						Integer.parseInt(line[1]),Double.parseDouble(line[2])));
				
				line = null;
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		}
		
		return usuarios;
	}


	public static LinkedList<Atraccion> leerAtracciones() {
	
		File f = new File("files/Atracciones.txt");
		Scanner sc;
		//List<Atraccion> atracciones = new LinkedList<Atraccion>();
		LinkedList<Atraccion> atracciones = new LinkedList<Atraccion>();
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
	
	
	
	
	public static List<Promocion> leerPromociones() {
		File f = new File("files/Promociones.txt");
		Scanner sc;
		List<Promocion> promociones = new LinkedList<Promocion>();
		String[] line;
		
		try {
			sc = new Scanner(f);
			//String[] atraccionesStr;
			while(sc.hasNextLine()) {
				String[] atraccionesStr;
				
				line = sc.nextLine().split("-");
				List<Atraccion> atrDeLaPromo = new LinkedList<Atraccion>();
				atraccionesStr = line[0].split(", ");
				for (Atraccion atr: leerAtracciones()) {
					for (String str: atraccionesStr) {
						if (atr.getNombre().equals(str)) {
							atrDeLaPromo.add(atr);
						}
					}
					
				}
				
				if ( Integer.parseInt(line[2]) == 0) {
					Promocion promoDescuento = new PromocionPorcentual(atrDeLaPromo, 20.0);
					promociones.add(promoDescuento);

				}
				else if (Integer.parseInt(line[2]) == 1) {
					promociones.add(new PromocionAbsoluta(atrDeLaPromo, Integer.parseInt(line[1])));
				}
				else {
					for (Atraccion atr: leerAtracciones()) {
						
						if (atr.getNombre().equals(line[1])) {
								promociones.add(new PromocionAxB(atrDeLaPromo, atr));
								
							}
					}
					System.out.println(promociones.size());
				}
				line = null;
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		}
		
		return promociones;
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
