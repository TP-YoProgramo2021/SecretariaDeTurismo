package turismoEnLaTierraMedia;

import java.util.LinkedList;
import java.util.List;

public class Promocion {
	private List<Atraccion> atracciones;
	private double porcentajeDesc;
	private Atraccion atrGratis;
	private int precioPorTodo;
	private int tipoDePromo;//Esto es para el toString, la idea es que se imprima segun corresponda el tipo de promo (descuento, absoluta, AxB)
	

	public Promocion(List<Atraccion> atracciones, double porcentajeDesc) {
		this.atracciones = new LinkedList<Atraccion>();
		this.atracciones = atracciones;
		this.porcentajeDesc = porcentajeDesc;
		this.tipoDePromo=1;
	}

	public Promocion(List<Atraccion> atracciones, Atraccion atrGratis) {
		this.atracciones = new LinkedList<Atraccion>();
		this.atracciones = atracciones;
		this.atrGratis = atrGratis;
		this.tipoDePromo=2;
	}

	public Promocion(List<Atraccion> atracciones, int precioPorTodo) {
		this.atracciones = new LinkedList<Atraccion>();
		this.atracciones = atracciones;
		this.precioPorTodo = precioPorTodo;
		this.tipoDePromo=3;
	}
	public int costoTotal() {
		int costoTotal=0;
		for (Atraccion atr: this.atracciones) {
			costoTotal+= atr.getCosto();
		}
		return costoTotal;
	}
	public double tiempoTotal() {
		double tiempoTotal = 0;
		for (Atraccion atr: this.atracciones) {
			tiempoTotal+= atr.getTiempo();
		}
		return tiempoTotal;
	}
	public TipoDeAtraccion tipoDePromo() {return this.atracciones.get(0).getTipo();}
	@Override
	public String toString() {
		String str= "";
		for (Atraccion atr: this.atracciones) {
			str += atr.toString();
		}
		//Agregar un nombre al Pack!!
		if (this.tipoDePromo==1) {
			
			return "Promocion " + this.tipoDePromo() + ".\nIncluye " + str + "\nCon un descuento del " + this.porcentajeDesc +"%"+ " el precio total es: $" + this.costoTotal();
		}
		else if (this.tipoDePromo==2) {
			
			return "Promocion " + this.tipoDePromo() + ".\nIncluye " + str +"Ademas tambien incluye pero totalmente gratis: "+this.atrGratis.toString()+"\n%El precio total de este pack es: $" + this.costoTotal();
		}
		else {
			return "Promocion " + this.tipoDePromo() + ".\nIncluye " + str + "\nA TAN SOLO: $" + this.precioPorTodo;
		}
		
	}

	
}