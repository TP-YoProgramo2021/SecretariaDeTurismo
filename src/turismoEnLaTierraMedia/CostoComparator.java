package turismoEnLaTierraMedia;

import java.util.Comparator;

public class CostoComparator implements Comparator <Atraccion> {

	@Override
	public int compare(Atraccion o1, Atraccion o2) {
		return -1*Integer.compare(o1.getCosto(), o2.getCosto());    //hacer interfaz con getCosto(), getTiempo(), getCupo().
	}

}
