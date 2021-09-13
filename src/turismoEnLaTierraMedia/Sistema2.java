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
		List<Usuario> users = AdministradorDeArchivos2.leerUsuarios();
		for (Usuario user:users) {
			System.out.println(user);}
	
		List<Promocion> packs = AdministradorDeArchivos2.leerPromociones();
		System.out.println("----------PACK----------");
//		System.out.println(packs); //imprime vacio
		for (Promocion pack:packs) {
				System.out.println(pack);
		}
		
		System.out.println("Leer\n");
		atracciones = AdministradorDeArchivos2.leerAtracciones();
			for(Atraccion atr : atracciones) {
				System.out.println(atr);
			}

	
			Scanner scanner = new Scanner(System.in); 
			System.out.print("Ingrese 1 para ordenar: ");
			int in1 = scanner.nextInt();
			
			
			if (in1==1) {
		//Ordena atracciones primero por preferencia del usuario, de mayor a menor tiempo y mayor a menor costo.
			System.out.println("\nOrdenar\n");
			usuarios =AdministradorDeArchivos2.leerUsuarios();
			sugerencia.addAll(packs);
			sugerencia.addAll(atracciones);
			
			//Agregar un for para recorrer todos los usuarios y consultarle si quiere o no quiere acptar la sugerencia
			sugerencia.sort(new ComparadorParaSugerencias(usuarios.get(1).getAtraccionPreferida()));
				for(Ofertables atr:sugerencia) {
					System.out.println(atr);	
				}
				
				
			} else System.out.println("mal, lista no ordenada");	
			
			
			Scanner scannerClon = new Scanner(System.in); 
			System.out.print("Ingrese 2 para clonar: ");
			int inclone = scannerClon.nextInt();
			
			
			if(inclone==2) {
				listaParaInteractuar =(LinkedList<Atraccion>) atracciones.clone(); //no se si esta bien el casteo asi
				System.out.println("----------lista clonada-------------");
				//System.out.println(listaParaInteractuar);
				
				Scanner scannerde1;
				for(Atraccion atrC:listaParaInteractuar) {
					scannerde1 = new Scanner(System.in); 
					System.out.print("Ingrese 3 para mostrar: ");
					int intM = scannerde1.nextInt();
					if(intM==3 ) {
						System.out.println(atrC);
					} else System.out.println("se corta muestra");
				}
				
				
				
			} else System.out.println("mal");
			
			
			
			
			
			

			
			
			
		//Escribe en el archivo atraccionesOUT.txt	
		System.out.println("\nEscribir\n");
		AdministradorDeArchivos2.escribirAtracciones(atracciones);	
		
		
		
	}	
	
	
}
