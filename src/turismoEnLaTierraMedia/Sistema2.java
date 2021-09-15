package turismoEnLaTierraMedia;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sistema2 {
	public static List<Usuario> usuarios;
	//public static List<Atraccion> atracciones;
	public static LinkedList<Atraccion> atracciones;
	public static LinkedList<Atraccion> listaParaInteractuar;

	
	public static void main(String[] args) {
		List<Ofertables> sugerencia = new LinkedList<Ofertables>();
		List<Atraccion> atracciones = AdministradorDeArchivos2.leerAtracciones();
		List<Usuario> users = AdministradorDeArchivos2.leerUsuarios();
		List<Promocion> packs = AdministradorDeArchivos2.leerPromociones(atracciones);
		sugerencia.addAll(packs);
		sugerencia.addAll(atracciones);
		try (Scanner scanner = new Scanner(System.in)) {
			for (Usuario usuario:users) {
				System.out.println("Bienvenido "+ usuario.getNombre());
				sugerencia.sort(new ComparadorParaSugerencias(usuario.getAtraccionPreferida()));
				
				for(Ofertables oferta:sugerencia) {
//				System.out.println(oferta);
					
					if (usuario.puedeComprar(oferta)) {
						System.out.println(oferta);	
						System.out.print("Ingrese S para aceptar o N para no hacerlo: ");
						String in1 = scanner.nextLine();
						if (in1.toUpperCase().equals("S")) {
							usuario.agregarAlItinerario(oferta);
						}
					}
//					else {
//						System.out.println("La oferta:\n"+oferta.toString()+"\nNo puede ser adquirida por este usuario\n"+usuario.toString()+"\n------------------------------------------");
//					}
				}
				System.out.println("Terminaron las sugerencias para este usuario\nPresione enter para continuar...");
				String in1 = scanner.nextLine();
				System.out.println("\nEscribir\n");
				AdministradorDeArchivos2.escribirAtracciones(usuario.getItinerario());	
			}
			String in1 = scanner.nextLine();
			System.out.println(in1);
		}
		//Escribe en el archivo atraccionesOUT.txt	
		System.out.println("\nEscribir\n");
//		AdministradorDeArchivos2.escribirAtracciones(atracciones);	
	}	
}