package turismoEnLaTierraMedia;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private int presupuesto;
	private double tiempoDisponible;
	private TipoDeAtraccion atraccionPreferida;
//	private float monedasGastadas;
	private List<Ofertables> itinerario = new LinkedList<Ofertables> ();
	private final int PRESUPUESTO_INICIAL;
	private final double TIEMPO_DISPONIBLE_INICIAL;
	private String nombre;
	
	public Usuario(TipoDeAtraccion atraccionPreferida, int presupuesto, double tiempoDisponible, String nombre) {
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.atraccionPreferida = atraccionPreferida;
		this.PRESUPUESTO_INICIAL=presupuesto;
		this.TIEMPO_DISPONIBLE_INICIAL=tiempoDisponible;
		this.nombre=nombre;
	}
	@Override
	public String toString() {
		return "Usuario [presupuesto=" + presupuesto + ", tiempoDisponible=" + tiempoDisponible
				+ ", atraccionPreferida=" + atraccionPreferida + "]";
	}
	public int getPresupuesto() {
		return presupuesto;
	}
	public String getNombre() {
		return this.nombre;
	}
	public double getTiempoDisponible() {
		return tiempoDisponible;
	}
	public List<Ofertables> getItinerario(){
		return this.itinerario;
	}
	public TipoDeAtraccion getAtraccionPreferida() {
		return atraccionPreferida;
	}
	public boolean puedeComprar(Ofertables oferta) {
		for (Ofertables atraccion:this.itinerario) {
			if (atraccion.equals(oferta)) {
				System.out.println("Entro al if");
				return false;
			}
			
			
			System.out.println("Fuera del if");
			
		}
		System.out.println("Fuera del for");
		return (this.presupuesto >= oferta.getCosto()) && (this.getTiempoDisponible()>=oferta.getTiempo()) && (oferta.hayCupo());	
				}
	public void cobrar(Ofertables atraccion) throws Exception {
		if(this.presupuesto >= atraccion.getCosto()) {
			this.presupuesto -= atraccion.getCosto();
		}
		else {
			throw new Exception("No alcanza el dinero para comprar.");
		}
	
	}
	public void restarTiempo(Ofertables atraccion) throws Exception {
		if(this.tiempoDisponible >= atraccion.getTiempo()) {
			this.tiempoDisponible -= atraccion.getTiempo();
		}
		else {
			throw new Exception("El usuario no cuenta con el tiempo necesario.");
		}
			
	}
	public int dineroGastado() {
		return this.PRESUPUESTO_INICIAL-this.presupuesto;
	}
	public double tiempoRequerido() {
		return this.TIEMPO_DISPONIBLE_INICIAL - this.tiempoDisponible;
	}
	public void agregarAlItinerario(Ofertables oferta) {
			for (Atraccion atr2: oferta.atraccionesIncluidas()) {
				try {
						
						this.itinerario.add(atr2);
						atr2.restarUnCupo();
						
					
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			try {
				this.cobrar(oferta);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				this.restarTiempo(oferta);
			} catch (Exception e) {
				e.printStackTrace();
			}
	System.out.println("\n¡Ya fue agregado al itinerario!\n");
	}
}
