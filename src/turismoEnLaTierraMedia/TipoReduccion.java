package turismoEnLaTierraMedia;

public enum TipoReduccion {
	
	PORCENTUAL ("Porcentual"),
	ABSOLUTA ("Absoluta"),
	AXB("AXB");

	private String reduccion;

	TipoReduccion (String reduccion) { 
		this.reduccion=reduccion;
	} 
	
	public String getReduccion() { 
		return reduccion; 
	}

}