package turismoEnLaTierraMedia;

import java.util.LinkedList;
import java.util.List;

public abstract class Promocion implements Ofertables{
	protected List<Atraccion> atracciones;
	protected double porcentajeDesc;
	protected Atraccion atrGratis;
	protected int precioPorTodo;
	
	public Promocion(List<Atraccion> atracciones, double porcentajeDesc) {
		this.atracciones = new LinkedList<Atraccion>();
		this.atracciones = atracciones;
		this.porcentajeDesc = porcentajeDesc/100;
		
	}

	public Promocion(List<Atraccion> atracciones, Atraccion atrGratis) {
		this.atracciones = new LinkedList<Atraccion>();
		this.atracciones = atracciones;
		this.atrGratis = atrGratis;
		
	}

	public Promocion(List<Atraccion> atracciones, int precioPorTodo) {
		this.atracciones = new LinkedList<Atraccion>();
		this.atracciones = atracciones;
		this.precioPorTodo = precioPorTodo;
		
	}
	@Override
	public abstract int getCosto() ;
	
	@Override
	public boolean esPromocion(){
		return true;
	}
	
	@Override
	public boolean hayCupo() {
		for (Atraccion atr: this.atracciones) {
			if  (!atr.hayCupo()) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public double getTiempo() {
		double tiempoTotal = 0;
		for (Atraccion atr: this.atracciones) {
			tiempoTotal+= atr.getTiempo();
		}
		return tiempoTotal;
	}
	public TipoDeAtraccion getTipo() {return this.atracciones.get(0).getTipo();}


	
}