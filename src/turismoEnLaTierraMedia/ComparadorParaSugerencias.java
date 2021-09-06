package turismoEnLaTierraMedia;

import java.util.Comparator;

public class ComparadorParaSugerencias implements Comparator<Atraccion> {
	private TipoDeAtraccion preferenciaUser;
	
	public ComparadorParaSugerencias(TipoDeAtraccion preferenciaUser) {
		this.preferenciaUser = preferenciaUser;
	}

	@Override
	public int compare(Atraccion o1, Atraccion o2) {

		// return -1*Integer.compare(o1.costo, o2.costo);
		// return -1*Double.compare(o1.tiempo, o2.tiempo);
		
		
		
		//falta la prioridad mas alta, por promociones.

		if (this.preferenciaUser == o1.getTipo() && this.preferenciaUser != o2.getTipo()) {
			return -1;
		}
		else if (this.preferenciaUser != o1.getTipo() && this.preferenciaUser == o2.getTipo()) {
			return 1;
		}
		
		else if (o1.getCosto() > o2.getCosto())
			return -1;
		else if (o1.getCosto() < o2.getCosto())
			return 1;
		else if (o1.getTiempo() > o2.getTiempo())
			return -1;
		else if (o1.getTiempo() < o2.getTiempo())
			return 1;

		else
			return 0;
		

	}

}