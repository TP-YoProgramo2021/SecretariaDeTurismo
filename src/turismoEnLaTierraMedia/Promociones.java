package turismoEnLaTierraMedia;

import java.util.List;

public class Promociones {
	protected List<Atraccion> atracciones;
	protected double porcentajeDesc;
	protected Atraccion atrGratis;
	protected int precioPorTodo;

	public Promociones(List<Atraccion> atracciones, double porcentajeDesc) {
		this.atracciones = atracciones;
		this.porcentajeDesc = porcentajeDesc;
	}

	public Promociones(List<Atraccion> atracciones, Atraccion atrGratis) {
		this.atracciones = atracciones;
		this.atrGratis = atrGratis;
	}

	public Promociones(List<Atraccion> atracciones, int precioPorTodo) {
		this.atracciones = atracciones;
		this.precioPorTodo = precioPorTodo;
	}
}