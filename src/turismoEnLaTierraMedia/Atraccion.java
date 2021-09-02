package turismoEnLaTierraMedia;

public class Atraccion {
	protected String nombre;
	protected int costo;
	protected double tiempo;
	protected int cupos;
	protected TipoDeAtraccion tipoDeAtraccion;

	
	public Atraccion(String nombre, int costo, double tiempo, int cupos, TipoDeAtraccion tipoDeAtraccion) {
		this.nombre=nombre;
		this.costo = costo;
		this.tiempo = tiempo;
		this.cupos = cupos;
		this.tipoDeAtraccion = tipoDeAtraccion;
	}
	@Override
	public String toString() {
		return "Atraccion [nombre=" + this.nombre + ", costo=" + this.costo + ", tiempo=" + this.tiempo + ", cupos=" + this.cupos
				+ ", tipoDeAtraccion=" + this.tipoDeAtraccion + "]";
	}


}