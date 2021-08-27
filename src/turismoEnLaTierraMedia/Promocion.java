package turismoEnLaTierraMedia;

public class Promocion {

	private Atraccion [] arrayAtracciones;
	private TipoReduccion tipoReduccion;
	private double costo;
	
	private String valorReduccion;
	private double porcentaje;
	private int monedas;
	private Atraccion atraccionGratis;
	
	
	
	public Promocion(Atraccion[] arrayAtracciones, TipoReduccion tipoReduccion,double porcentaje) {
		
		this.arrayAtracciones = arrayAtracciones;
		this.tipoReduccion = tipoReduccion;
		this.porcentaje=porcentaje;
		this.costo= calcularCosto();
		
	}
	
	
	public Promocion(Atraccion[] arrayAtracciones, TipoReduccion tipoReduccion,int monedas) {
		
		this.arrayAtracciones = arrayAtracciones;
		this.tipoReduccion = tipoReduccion;
		this.monedas=monedas;
		this.costo= calcularCosto();
		
	
	}
	
	
	public Promocion(Atraccion[] arrayAtracciones, TipoReduccion tipoReduccion,Atraccion atraccionGratis) {
		
		this.arrayAtracciones = arrayAtracciones;
		this.tipoReduccion = tipoReduccion;
		this.atraccionGratis=atraccionGratis;
		this.costo= calcularCosto();
	
	}
	
	
	
	private double calcularCosto() {
		
		double costoPromo=0;
		
		if (this.tipoReduccion.getReduccion().equals("Porcentual")) {
			
			costoPromo = sumarCostos() - (sumarCostos()*porcentaje);
		
		}else if (this.tipoReduccion.getReduccion().equals("AXB")) {
			
			costoPromo = sumarCostos();
			//falta agregar al array de atracciones.
		
		}else {
			
			costoPromo=this.monedas;
		
		}
		
		return costoPromo;
	
	}
	
		//Recorre el array de atraccion y suma el costo de las atracciones para luego calcular costo de promocion
		private double sumarCostos() {
			
			double costoPromo=0;
			
			for (Atraccion atraccion : arrayAtracciones) {
				costoPromo += atraccion.getCosto();
			}
			
			return (costo);
			
		}
}
