package turismoEnLaTierraMedia;

public class Atracciones {


	private double costo;
	private double tiempo;
	private int cupo;
	private String tipo;

	public Atracciones(double costo, double tiempo, int cupo, String tipo) {
		this.costo = costo;
		this.tiempo = tiempo;
		this.cupo = cupo;
		this.tipo = tipo;
	}

	public double getCosto() {
		return costo;
	}

	public double getTiempo() {
		return tiempo;
	}

	public String getTipo() {
		return tipo;
	}
	
}
