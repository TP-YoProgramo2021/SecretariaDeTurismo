package turismoEnLaTierraMedia;

import java.util.List;

public class PromocionesAbsolutas extends Promocion{

	public PromocionesAbsolutas(List<Atraccion> atracciones, float costoFinal) {
		super(atracciones, costoFinal);
		//super((atraccion1.getCosto() + atraccion2.getCosto()) - descuentoAbsoluto, atraccion1.getTiempo() + atraccion2.getTiempo(), atraccion1.getTipo());

	}

}
