package turismoEnLaTierraMediaTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import turismoEnLaTierraMedia.AdministradorDeArchivos;
import turismoEnLaTierraMedia.Atraccion;
import turismoEnLaTierraMedia.PromocionAbsoluta;
import turismoEnLaTierraMedia.PromocionAxB;
import turismoEnLaTierraMedia.PromocionPorcentual;
import turismoEnLaTierraMedia.TipoDeAtraccion;
import turismoEnLaTierraMedia.Usuario;

public class PromocionesTest {
	    Usuario Eowyn;
		
		Atraccion Moria;
		Atraccion Mordor;
		Atraccion BosqueNegro;
		Atraccion ParqueSanCarlos;
		
		PromocionAbsoluta aventura1;
		PromocionPorcentual aventura2;
		PromocionAxB aventura3;
		PromocionAbsoluta aventura4;
		AdministradorDeArchivos admin;
		
		@Before
		public void setUp() {
			
			admin = new AdministradorDeArchivos();
			
			Eowyn = new Usuario (TipoDeAtraccion.Aventura,100, 100, "Eowyn");
			
			
			Moria = new Atraccion("Moria", 10, 3, 6, TipoDeAtraccion.Aventura);
			Mordor = new Atraccion("Mordor",4, 2.5, 4, TipoDeAtraccion.Aventura);
			BosqueNegro = new Atraccion("BosqueNegro",2, 1, 12, TipoDeAtraccion.Aventura);
			ParqueSanCarlos = new Atraccion("Parque San Carlos",8,4,6,TipoDeAtraccion.Aventura);
			
			
			List<Atraccion> atracciones1= new ArrayList();
			atracciones1.add(Moria);
			atracciones1.add(Mordor);
			
			List<Atraccion> atracciones2= new ArrayList();
			atracciones2.add(Moria);
			atracciones2.add(BosqueNegro);
			
			List<Atraccion> atracciones3= new ArrayList();
			atracciones3.add(Moria);
			atracciones3.add(BosqueNegro);
			
			List<Atraccion> atracciones4= new ArrayList();
			atracciones4.add(Mordor);
			atracciones4.add(ParqueSanCarlos);

			
			aventura1 = new PromocionAbsoluta(atracciones1, 10);
			aventura2 = new PromocionPorcentual(atracciones2, 0.3);
			aventura3 = new PromocionAxB(atracciones3,Mordor);
			aventura4 = new PromocionAbsoluta(atracciones4,5);
			
			
			
			
		}

		
		@After
		public void tearDown() {
			Eowyn = null;
			
			Moria = null;
			Mordor = null;
			BosqueNegro = null;
			ParqueSanCarlos = null;
			
			aventura1 = null;
			aventura2 = null;
		    aventura3 = null;
			aventura4 = null;
			
		}
		
		
		@Test
		public void agregarAlItinerarioTest() {
			
			Eowyn.agregarAlItinerario(aventura1);
			assertFalse(Eowyn.puedeComprar(Mordor));
			
			Eowyn.agregarAlItinerario(Moria);
			assertFalse(Eowyn.puedeComprar(aventura2));
			
			Eowyn.agregarAlItinerario(aventura1);
			assertFalse(Eowyn.puedeComprar(aventura2));
			
			Eowyn.agregarAlItinerario(aventura3);
			assertFalse(Eowyn.puedeComprar(aventura4));
			
			
			
		}
}
