package juego.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import juego.Jugador;
import juego.Naipe;
import juego.Repartidor;

public class RepartidorTest {
	
	Repartidor repartidor;
	Jugador jugador;
	Naipe naipe;

	@Before
	public void initialize() {
		repartidor = new Repartidor();
		jugador = new Jugador("Juan");
		naipe = new Naipe();
	}
	
	@Test
	public void darCartaTest() {
		jugador.agregarCartaMano(naipe.sacarCarta());
		jugador.agregarCartaMano(naipe.sacarCarta());
		jugador.agregarCartaMano(naipe.sacarCarta());
		assertEquals(3,jugador.getMano().size());
	}
	

}
