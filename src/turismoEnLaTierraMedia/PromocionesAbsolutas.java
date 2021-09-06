package turismoEnLaTierraMedia;

public class PromocionesAbsolutas extends Promocion{

	public PromocionesAbsolutas(Atracciones atraccion1, Atracciones atraccion2, float descuentoAbsoluto) {
		super((atraccion1.getCosto() + atraccion2.getCosto()) - descuentoAbsoluto, atraccion1.getTiempo() + atraccion2.getTiempo(), atraccion1.getTipo());

	}

}
