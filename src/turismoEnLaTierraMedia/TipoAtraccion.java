package turismoEnLaTierraMedia;

public enum TipoAtraccion {

	AVENTURA("Aventura"),
	PAISAJE("Paisaje"),
	DEGUSTACION("Degustación");

	private String tipo;
	
	private TipoAtraccion(String tipo){
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

}