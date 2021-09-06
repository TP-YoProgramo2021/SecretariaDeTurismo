package turismoEnLaTierraMedia;

public class Atraccion implements Ofertables {
	private String nombre;
	private int costo;
	private double tiempo;
	private int cupos;
	private TipoDeAtraccion tipoDeAtraccion;

	
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
	@Override
	public int getCosto() {
		
		return this.costo ;
	}
	@Override
	public double getTiempo() {
		
		return this.tiempo;
	}
	@Override
	public TipoDeAtraccion getTipo() {
		// TODO Auto-generated method stub
		return this.tipoDeAtraccion;
	}
	@Override
	public boolean hayCupo() {
		// TODO Auto-generated method stub
		return this.cupos>0;
	}
	@Override
	public boolean esPromocion() {
		// TODO Auto-generated method stub
		return false;
	}
	public String getNombre() {
		return nombre;
	}
	


}