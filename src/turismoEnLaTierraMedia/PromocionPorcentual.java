package turismoEnLaTierraMedia;

import java.util.List;

public class PromocionPorcentual extends Promocion {

	public PromocionPorcentual(List <Atraccion> atracciones, double descuentoPorcentual) {
		super(atracciones, descuentoPorcentual);
		
		//super((atraccion1.getCosto() + atraccion2.getCosto()) * (100 - descuentoPorcentual) / 100, atraccion1.getTiempo() + atraccion2.getTiempo(), atraccion1.getTipo()); 
	}
	@Override
	public int getCosto() {
	
		int costoTotal=0;
		for (Atraccion atr: this.atracciones) {
			costoTotal+= atr.getCosto();
		}
		costoTotal = (int) (costoTotal * (1-this.porcentajeDesc));
		return costoTotal;
		
	}
	@Override
	public String toString() {
		return "Pack "+ getTipo() +" [atracciones=" + atracciones + ", porcentajeDesc=" + porcentajeDesc
				+ ", getCosto()=" + getCosto() + ", getTiempo()=" + getTiempo() + "]";
	}
}
