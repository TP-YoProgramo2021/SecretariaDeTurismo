package turismoEnLaTierraMedia;
import java.io.File;
//import java.nio.file.FileSystems;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//import jdk.internal.misc.FileSystemOption;


public class App {
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
	public static List<Promocion> leerPromociones() {
		File f = new File("files/Promociones.txt");
		Scanner sc;
		List<Promocion> promociones = new LinkedList<Promocion>();
		String[] line;
		
		try {
			sc = new Scanner(f);
			
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
//				System.out.println("-----------------");
//				System.out.println(atrDeLaPromo);
				if (line[2] == "0") {
					Promocion promoDescuento = new Promocion(atrDeLaPromo, 20.0);
					System.out.println("----------"+promoDescuento);
					promociones.add(new Promocion(atrDeLaPromo, 20.0));
//					System.out.println(atrDeLaPromo);
				}
				else if (line[2] == "1") {
					promociones.add(new Promocion(atrDeLaPromo, Integer.parseInt(line[1])));
//					System.out.println(promociones);
				}
				else {
//					System.out.println(promociones);
					for (Atraccion atr: leerAtracciones()) {
						if (atr.getNombre().equals(line[2])) {
								promociones.add(new Promocion(atrDeLaPromo, atr));
							}
					}
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
	
	
//	public static Atracciones[] leerAtracciones() {
//		Atracciones[] atracciones = new Atracciones[10];
//		//aca lee atracciones.txt
//		return atracciones;
//	}
//	public static List<Promociones> leerPromociones() {
//		File f = new File("files/Promociones.txt");
//		Scanner sc;
//		List<Promociones> atracciones = new LinkedList<Promociones>();
//		String[] line;
//		
//		try {
//			sc = new Scanner(f);
//			
//			while(sc.hasNextLine()) {
//				line = sc.nextLine().split("-");
//				atracciones.add(new Promociones(
//												)
//								);
//				
//				line = null;
//			}
//			
//			sc.close();
//		} catch (FileNotFoundException e) {
//			System.err.println(e.getMessage());
//		} catch (NumberFormatException e) {
//			System.err.println(e.getMessage());
//		}
//		
//		return atracciones;
//	}
//	public static void main(){
//	   Usuario[] misUsuarios = leerUsuarios();
//	   Atracciones[] misAtracciones = leerAtracciones();
//	}
	public static void main(String[] args) {
		List<Usuario> users = App.leerUsuarios();
//		for (Usuario user:users) {
//			System.out.println(user);}
		List<Atraccion> atracs = App.leerAtracciones();
//		for (Atraccion atr:atracs) {
//				System.out.println(atr);
			}
		List<Promocion> packs = App.leerPromociones();
		System.out.println(packs);
		for (Promocion pack:packs) {
				System.out.println(pack);
			}
		
	}	

	}
	}
