package turismoEnLaTierraMedia;

public class Atraccion {

	private double costo;
	private double tiempoPromedio;
	private int cupo;
	private TipoAtraccion tipo;
	private String nombre;
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public double getTiempoPromedio() {
		return tiempoPromedio;
	}
	public void setTiempoPromedio(double tiempoPromedio) {
		this.tiempoPromedio = tiempoPromedio;
	}
	public int getCupo() {
		return cupo;
	}
	public void setCupo(int cupo) {
		this.cupo = cupo;
	}
	public TipoAtraccion getTipo() {
		return tipo;
	}
	public void setTipo(TipoAtraccion tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
