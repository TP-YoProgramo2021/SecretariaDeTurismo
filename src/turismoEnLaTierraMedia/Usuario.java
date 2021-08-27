package turismoEnLaTierraMedia;

public class Usuario {

	private double presupuesto;
	private double tiempoDisponible;
	private TipoAtraccion atraccion;
	private Atraccion [] sugerenciaDiaria;
	public double getPresupuesto() {
		return presupuesto;
	}
	
	
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	public double getTiempoDisponible() {
		return tiempoDisponible;
	}
	public void setTiempoDisponible(double tiempoDisponible) {
		this.tiempoDisponible = tiempoDisponible;
	}
	public TipoAtraccion getAtraccion() {
		return atraccion;
	}
	public void setAtraccion(TipoAtraccion atraccion) {
		this.atraccion = atraccion;
	}
	public Atraccion[] getSugerenciaDiaria() {
		return sugerenciaDiaria;
	}
	public void setSugerenciaDiaria(Atraccion[] sugerenciaDiaria) {
		this.sugerenciaDiaria = sugerenciaDiaria;
	}
	
}
