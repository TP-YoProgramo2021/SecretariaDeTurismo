package turismoEnLaTierraMedia;

import java.util.Comparator;

public class TiempoComparator implements Comparator <Atraccion> {

	@Override
	public int compare(Atraccion o1, Atraccion o2) {
		return -1*Double.compare(o1.getTiempo(), o2.getTiempo()); //hacer interfaz con getCosto(), getTiempo(), getCupo().
	}

}
