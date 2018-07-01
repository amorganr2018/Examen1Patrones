package juego.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import juego.Jugador;

public class JugadorTest {
	
	Jugador jugador1, jugador2;
	
	@Before
	public void initialize() {
		jugador1 = new Jugador("Juan");
		jugador2 = new Jugador("Pedro");
	}	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
