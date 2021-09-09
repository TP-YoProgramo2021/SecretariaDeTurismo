package turismoEnLaTierraMedia;

public class Usuario {
	private int presupuesto;
	private double tiempoDisponible;
	private TipoDeAtraccion atraccionPreferida;
//	private float monedasGastadas;
//	private Atracciones [] itinerario = new Atracciones[3];
	
	public Usuario(int presupuesto, double tiempoDisponible, TipoDeAtraccion atraccionPreferida) {
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

	
	
	
}
