package juego.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import juego.Carta;
import juego.Jugador;
import juego.Naipe;

public class JugadorTest {
	
	Jugador jugador1, jugador2;
	Carta carta1, carta2;
	Naipe naipe1;
	
	@Before
	public void initialize() {
		jugador1 = new Jugador("Juan");
		jugador2 = new Jugador("Pedro");
		carta1 = new Carta("flores", "cinco");
		carta2 = new Carta("estrellas","tres");
	}	
	@Test
	public void agregarCartaMAnotest() {
		jugador1.agregarCartaMano(carta1);
		assertEquals(1, jugador1.getMano().size());
	}
	
	@Test
	public void calcularManoTest() {
		jugador1.agregarCartaMano(carta1);
		jugador1.agregarCartaMano(carta2);		
		assertEquals(8, jugador1.calcularMano());
	}
	
	@Test
	public void tomarCartaTest() {
		jugador1 = new Jugador("Juan");
		naipe1 = new Naipe();
		jugador1.tomarCarta(naipe1);
		assertEquals(1,jugador1.getMano().size());
	}
	
	@Test
	public void desecharCartaTest() {
		jugador1 = new Jugador("Juan");
		carta1 = new Carta("flores", "cinco");
		jugador1.agregarCartaMano(carta1);
		jugador1.desecharCarta();
		assertEquals(0, jugador1.getMano().size());
	}
	
}
