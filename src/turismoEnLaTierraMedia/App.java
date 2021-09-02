package turismoEnLaTierraMedia;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


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
		for (Usuario user:users) {
			System.out.println(user);}
		List<Atraccion> atracs = App.leerAtracciones();
			for (Atraccion atr:atracs) {
				System.out.println(atr);
			}
		
	}	

}
