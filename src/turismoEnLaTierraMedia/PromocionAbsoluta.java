package turismoEnLaTierraMedia;

import java.util.List;

public class PromocionAbsoluta extends Promocion{

	public PromocionAbsoluta(List<Atraccion> atracciones, int costoFinal) {
		super(atracciones, costoFinal);
		//super((atraccion1.getCosto() + atraccion2.getCosto()) - descuentoAbsoluto, atraccion1.getTiempo() + atraccion2.getTiempo(), atraccion1.getTipo());

	}
	@Override
	public String toString() {
		return "Pack " + getTipo() + "[atracciones=" + atracciones + ", precioPorTodo=" + precioPorTodo + ", getCosto()="
				+ getCosto() + ", getTiempo()=" + getTiempo() +  "]";
	}
	@Override
	public int getCosto() {
		return this.precioPorTodo;
	}

}
