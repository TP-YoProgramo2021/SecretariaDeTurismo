package turismoEnLaTierraMedia;

import java.util.List;

public class PromocionesAxB extends Promocion implements Ofertables{

	public PromocionesAxB(List<Atraccion> atracciones, Atraccion atraccionGratis) {
		super(atracciones, atraccionGratis);
	
	}

	
	@Override
	public int getCosto() {
		
		return 0;
	}

	@Override
	public double getTiempo() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return 0;
	}

	@Override
	public TipoDeAtraccion getTipo() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return null;
	}

	@Override
	public boolean hayCupo() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public boolean esPromocion() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return false;
	}
	
}
