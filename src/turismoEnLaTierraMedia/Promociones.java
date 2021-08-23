package turismoEnLaTierraMedia;

public class Promociones {
	private double costoPaquete;
	private double tiempoTotal;
	private String tipoDeAtraccion;
	
	public Promociones(double costoPaquete, double tiempoTotal, String tipoDeAtraccion) {
		this.costoPaquete = costoPaquete;
		this.tiempoTotal = tiempoTotal;
		this.tipoDeAtraccion = tipoDeAtraccion;
	}

	public double getCostoPaquete() {
		return costoPaquete;
	}

	public double getTiempoTotal() {
		return tiempoTotal;
	}
}
