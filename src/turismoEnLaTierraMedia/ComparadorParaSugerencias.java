package turismoEnLaTierraMedia;

import java.util.Comparator;

public class ComparadorParaSugerencias implements Comparator<Atraccion> {

	@Override
	public int compare(Atraccion o1, Atraccion o2) {

		// return -1*Integer.compare(o1.costo, o2.costo);
		// return -1*Double.compare(o1.tiempo, o2.tiempo);
		
		
		
		//falta la prioridad mas alta, por promociones.

		
		if (o1.costo > o2.costo)
			return -1;
		else if (o1.costo < o2.costo)
			return 1;
		else if (o1.tiempo > o2.tiempo)
			return -1;
		else if (o1.tiempo < o2.tiempo)
			return 1;

		else
			return 0;

	}

}
