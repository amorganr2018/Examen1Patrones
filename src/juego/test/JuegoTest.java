package juego.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import juego.Carta;
import juego.MainUI;

class JuegoTest {
	
	Carta carta;

	@Before
	public void initialize() {
		carta = new Carta();
	}
	
	@Test
	public void testCrearCarta() {
		assertNotNull(carta, MainUI.crearCarta("flores", "jota"));
	}
	
	@Test
	public void TestCompararCartas() {
		
		Carta cartaUno = new Carta("flores", "jota");
		Carta cartaDos = new Carta("flores", "jota");
		
		assertTrue(MainUI.compararCartas(cartaUno, cartaDos));
		
	}

}
