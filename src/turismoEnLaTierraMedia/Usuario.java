package turismoEnLaTierraMedia;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private int presupuesto;
	private double tiempoDisponible;
	private TipoDeAtraccion atraccionPreferida;
//	private float monedasGastadas;
	private List<Ofertables> itinerario = new LinkedList<Ofertables> ();
	
	public Usuario(TipoDeAtraccion atraccionPreferida, int presupuesto, double tiempoDisponible) {
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.atraccionPreferida = atraccionPreferida;
	}
	@Override
	public String toString() {
		return "Usuario [presupuesto=" + presupuesto + ", tiempoDisponible=" + tiempoDisponible
				+ ", atraccionPreferida=" + atraccionPreferida + "]";
	}
	public int getPresupuesto() {
		return presupuesto;
	}
	public double getTiempoDisponible() {
		return tiempoDisponible;
	}
	public TipoDeAtraccion getAtraccionPreferida() {
		return atraccionPreferida;
	}
	public boolean puedeComprar(Ofertables oferta) {
		boolean noEstaEnItinerario=true;
		for (Ofertables atraccion:this.itinerario) {
			if (atraccion.equals(oferta)) {
				noEstaEnItinerario=false;
			}
		}
		return (noEstaEnItinerario && this.presupuesto >= oferta.getCosto()) && (this.getTiempoDisponible()>=oferta.getTiempo()) && (oferta.hayCupo());	
				}
	public void cobrar(Atraccion atraccion) throws Exception {
		if(this.presupuesto >= atraccion.getCosto()) {
			this.presupuesto -= atraccion.getCosto();
		}
		else {
			throw new Exception("No alcanza el dinero para comprar.");
		}
	
	}
	public void restarTiempo(Atraccion atraccion) throws Exception {
		if(this.tiempoDisponible >= atraccion.getTiempo()) {
			this.tiempoDisponible -= atraccion.getTiempo();
		}
		else {
			throw new Exception("El usuario no cuenta con el tiempo necesario.");
		}
			
	}
	public void agregarAlItinerario(Ofertables oferta) {
			for (Atraccion atr2: oferta.atraccionesIncluidas()) {
				try {
						atr2.restarUnCupo();
						this.itinerario.add(atr2);
						this.cobrar(atr2);
						this.restarTiempo(atr2);
					
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
	System.out.println("¡Ya fue agregado al itinerario!");
	}
}
