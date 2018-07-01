package juego.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import juego.Carta;

public class CartaTest {
	
	Carta primeraCarta, segundaCarta;

	@Before
	public void initialize() {
		primeraCarta = new Carta();
		segundaCarta = new Carta();
	}
	
	@Test
	public void TestCompararCartasIguales() {
		
		primeraCarta = new Carta("flores", "cinco");
		segundaCarta = new Carta("flores", "cinco");
		
		assertTrue(primeraCarta.equals(segundaCarta));
		
	}
	
	@Test
	public void TestCompararCartasDiferentes() {
		
		primeraCarta = new Carta("estrellas", "cinco");
		segundaCarta = new Carta("estrellas", "cuatro");
		
		assertFalse(primeraCarta.equals(segundaCarta));
		
	}

}
