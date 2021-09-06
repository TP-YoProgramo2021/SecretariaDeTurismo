package turismoEnLaTierraMedia;

public class PromocionesAxB extends Promocion{

	public PromocionesAxB(Atracciones atraccion1, Atracciones atraccion2, Atracciones atraccion3) {
		super((atraccion1.getCosto() + atraccion2.getCosto()), atraccion1.getTiempo() + atraccion2.getTiempo() + atraccion3.getTiempo(), atraccion1.getTipo());
	}
	
}
