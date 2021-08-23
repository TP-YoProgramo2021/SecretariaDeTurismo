package turismoEnLaTierraMedia;

public class Usuario {
	private double presupuesto;
	private double tiempoDisponible;
	private String atraccionPreferida;
	private float monedasGastadas;
	private Atracciones [] itinerario = new Atracciones[3];
	
	public Usuario(double presupuesto, double tiempoDisponible, String atraccionPreferida, float monedasGastadas) {
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.atraccionPreferida = atraccionPreferida;
		this.monedasGastadas = monedasGastadas;
	}
	
	
}
