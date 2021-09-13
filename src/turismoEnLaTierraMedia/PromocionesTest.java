package turismoEnLaTierraMedia;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PromocionesTest {
	
	Usuario Eowyn;
	Usuario Gandalf;
	Usuario Sam;
	Usuario Galadriel;
	
	Atraccion Moria;
	Atraccion MinasTirith;
	Atraccion LaComarca;
	Atraccion Mordor;
	Atraccion AbismoDeHelm;
	Atraccion Lothlorien;
	Atraccion Erebor;
	Atraccion BosqueNegro;
	
	PromocionPorcentual aventura;
	PromocionAbsoluta degustacion;
	PromocionAxB paisajes;
	
	@Before
	public void setUp() {
		
		Eowyn = new Usuario(10, 8, TipoDeAtraccion.Aventura);
		Gandalf = new Usuario(100, 5, TipoDeAtraccion.Paisaje);
		Sam = new Usuario(36, 8, TipoDeAtraccion.Degustacion);
		Galadriel = new Usuario(120, 4, TipoDeAtraccion.Aventura);
		
		Moria = new Atraccion("Moria", 10, 2, 6, TipoDeAtraccion.Aventura);
		MinasTirith = new Atraccion("MinasTirith", 5, 2.5, 25, TipoDeAtraccion.Paisaje);
		LaComarca = new Atraccion("LaComarca",3, 6.5, 150, TipoDeAtraccion.Degustacion);
		Mordor = new Atraccion("Mordor",25, 3, 4, TipoDeAtraccion.Aventura);
		AbismoDeHelm = new Atraccion("AbismoDeHelm",5, 2, 15, TipoDeAtraccion.Paisaje);
		Lothlorien = new Atraccion("Lothlorien",35, 1, 30, TipoDeAtraccion.Degustacion);
		Erebor = new Atraccion("Erebor", 12, 3, 32, TipoDeAtraccion.Paisaje);
		BosqueNegro = new Atraccion("BosqueNegro",3, 4, 12, TipoDeAtraccion.Aventura);
		
		
		List<Atraccion> atracciones1= new ArrayList();
		atracciones1.add(BosqueNegro);
		atracciones1.add(Mordor);
		
		List<Atraccion> atracciones2= new ArrayList();
		atracciones2.add(MinasTirith);
		atracciones2.add(AbismoDeHelm);
		
		List<Atraccion> atracciones3= new ArrayList();
		atracciones3.add(Lothlorien);
		atracciones3.add(LaComarca);
		
		aventura = new PromocionPorcentual(atracciones1, 20);
		degustacion = new PromocionAbsoluta(atracciones2, 36);
		paisajes = new PromocionAxB(atracciones3, Erebor);
		
	}

	@Test
	public void PromocionPorcentualTest() {
		//Hay que crear el metodo getCostoPaquete
		//assertEquals(22.4, aventura.getCostoPaquete(), 0);
	}
	
	@Test
	public void PromocionAbsolutaTest() {
		
		//Hay que crear el metodo getCostoPaquete
		//assertEquals(2, degustacion.getCostoPaquete(), 0);
	}
	
	@Test
	public void PromocionAxBTest() {
		
		//Hay que crear el metodo getCostoPaquete
		//assertEquals(10, paisajes.getCostoPaquete(), 0);
	}

}
