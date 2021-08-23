package turismoEnLaTierraMedia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PromocionesTest {
	
	Usuario Eowyn;
	Usuario Gandalf;
	Usuario Sam;
	Usuario Galadriel;
	
	Atracciones Moria;
	Atracciones MinasTirith;
	Atracciones LaComarca;
	Atracciones Mordor;
	Atracciones AbismoDeHelm;
	Atracciones Lothlorien;
	Atracciones Erebor;
	Atracciones BosqueNegro;
	
	PromocionesPorcentuales aventura;
	PromocionesAbsolutas degustacion;
	PromocionesAxB paisajes;
	
	@Before
	public void setUp() {
		
		Eowyn = new Usuario(10, 8, "Aventura", 0);
		Gandalf = new Usuario(100, 5, "Paisaje", 0);
		Sam = new Usuario(36, 8, "Degustacion", 0);
		Galadriel = new Usuario(120, 4, "Aventura", 0);
		
		Moria = new Atracciones(10, 2, 6, "Aventura");
		MinasTirith = new Atracciones(5, 2.5, 25, "Paisaje");
		LaComarca = new Atracciones(3, 6.5, 150, "Degustacion");
		Mordor = new Atracciones(25, 3, 4, "Aventura");
		AbismoDeHelm = new Atracciones(5, 2, 15, "Paisaje");
		Lothlorien = new Atracciones(35, 1, 30, "Degustacion");
		Erebor = new Atracciones(12, 3, 32, "Paisaje");
		BosqueNegro = new Atracciones(3, 4, 12, "Aventura");
		
		aventura = new PromocionesPorcentuales(BosqueNegro, Mordor, 20);
		degustacion = new PromocionesAbsolutas(Lothlorien, LaComarca, 36);
		paisajes = new PromocionesAxB(MinasTirith, AbismoDeHelm, Erebor);
		
	}

	@Test
	public void PromocionPorcentualTest() {
		assertEquals(22.4, aventura.getCostoPaquete(), 0);
	}
	
	@Test
	public void PromocionAbsolutaTest() {
		assertEquals(2, degustacion.getCostoPaquete(), 0);
	}
	
	@Test
	public void PromocionAxBTest() {
		assertEquals(10, paisajes.getCostoPaquete(), 0);
	}

}
