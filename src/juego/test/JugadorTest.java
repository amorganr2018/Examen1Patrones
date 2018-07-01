package juego.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import juego.Carta;
import juego.Jugador;

public class JugadorTest {
	
	Jugador jugador1, jugador2;
	Carta carta;
	
	@Before
	public void initialize() {
		jugador1 = new Jugador("Juan");
		jugador2 = new Jugador("Pedro");
		carta = new Carta("flores", "cinco");
	}	
	@Test
	public void agregarCartaMAnotest() {
		jugador1.agregarCartaMano(carta);
		assertEquals(1, jugador1.getMano().size());
	}

}
