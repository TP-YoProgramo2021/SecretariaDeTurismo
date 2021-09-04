package turismoEnLaTierraMedia;

import java.util.List;

public class Sistema {
	public static List<Usuario> usuarios;
	public static List<Atraccion> atracciones;

	
	public static void main(String[] args) {
		
		System.out.println("Leer\n");
		atracciones = AdministradorDeArchivos.leerAtracciones();
			for(Atraccion atr : atracciones) {
				System.out.println(atr);
			}

		
	
		//Ordena atracciones de mayor a menor costo
		System.out.println("\nOrdenar\n");
		atracciones.sort(new CostoComparator());
			for(Atraccion atr:atracciones) {
				System.out.println(atr);
			}
			
	/*		
		//Ordena atracciones de mayor a menor tiempo
		System.out.println("\nOrdenar\n");
		atracciones.sort(new TiempoComparator());
			for(Atraccion atr:atracciones) {
				System.out.println(atr);	
			}*/
			
		//Escribe en el archivo atraccionesOUT.txt	
		System.out.println("\nEscribir\n");
		AdministradorDeArchivos.escribirAtracciones(atracciones);	
		
	}	

}
