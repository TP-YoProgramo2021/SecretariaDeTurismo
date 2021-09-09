package turismoEnLaTierraMedia;

import java.util.List;

public class PromocionesPorcentuales extends Promocion {

	public PromocionesPorcentuales(List <Atraccion> atracciones, int descuentoPorcentual) {
		super(atracciones, descuentoPorcentual);
		
		//super((atraccion1.getCosto() + atraccion2.getCosto()) * (100 - descuentoPorcentual) / 100, atraccion1.getTiempo() + atraccion2.getTiempo(), atraccion1.getTipo()); 
	}

}
