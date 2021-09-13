package turismoEnLaTierraMedia;

import java.util.List;

public class PromocionAxB extends Promocion implements Ofertables{

	public PromocionAxB(List<Atraccion> atracciones, Atraccion atraccionGratis) {
		super(atracciones, atraccionGratis);
	
	}

	@Override
	public boolean hayCupo() {
		for (Atraccion atr: this.atracciones) {
			if  (!atr.hayCupo()) {
				return false;
			}
		}
		if (!this.atrGratis.hayCupo()) return false;
		return true;
	}
	
	
	@Override
	public int getCosto() {
		int costoTotal=0;
		for (Atraccion atr: this.atracciones) {
			costoTotal+= atr.getCosto();
		}
		
		return costoTotal;
			
		}
	

	@Override
	public double getTiempo() {
		double tiempoTotal = 0;
		for (Atraccion atr: this.atracciones) {
			tiempoTotal+= atr.getTiempo();
		}
		return tiempoTotal + this.atrGratis.getTiempo();
	}

	@Override
	public String toString() {
		return "Pack "+ getTipo() +" [atracciones=" + atracciones + ", atrGratis=" + atrGratis + ", getCosto()=" + getCosto()
				+ ", getTiempo()=" + getTiempo() + "]";
	}	
}
