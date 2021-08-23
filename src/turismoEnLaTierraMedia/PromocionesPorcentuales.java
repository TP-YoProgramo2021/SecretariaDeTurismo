package turismoEnLaTierraMedia;

public class PromocionesPorcentuales extends Promociones {

	public PromocionesPorcentuales(Atracciones atraccion1, Atracciones atraccion2, int descuentoPorcentual) {
		super((atraccion1.getCosto() + atraccion2.getCosto()) * (100 - descuentoPorcentual) / 100, atraccion1.getTiempo() + atraccion2.getTiempo(), atraccion1.getTipo()); 
	}

}
