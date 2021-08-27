package turismoEnLaTierraMedia;

public class SecretariaDeTurismo {
	
	private Promocion [] promociones;
	private Usuario [] usuarios;
	private Atraccion [] atracciones;
	
	
	public SecretariaDeTurismo (Promocion[] promociones, Usuario[] usuarios, Atraccion[] atracciones) {
		
		if ( usuarios!=null && atracciones!=null && promociones!=null ) {
			this.promociones = promociones;
			this.usuarios = usuarios;
			this.atracciones = atracciones;
		}else {
			System.out.println("Lista de usuario, atracciones o promociones esta vacia");
		}
	
	}
	
	public Promocion [] generarSugerencia() {
			
			for (Usuario usuario : usuarios) {
				
			}
		
	}
	
	//getters y setters
	public Promocion[] getSugerencias() {
		return promociones;
	}
	public void setSugerencias(Promocion[] sugerencias) {
		this.promociones = sugerencias;
	}
	public Usuario[] getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	public Atraccion[] getAtracciones() {
		return atracciones;
	}
	public void setAtracciones(Atraccion[] atracciones) {
		this.atracciones = atracciones;
	}
	
	

}
