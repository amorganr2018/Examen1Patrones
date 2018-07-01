package juego.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import juego.Jugador;
import juego.Mesa;

public class MesaTest {
	
	Mesa mesa;
	Jugador jugador1, jugador2, jugador3, jugador4, jugador5;
	
	@Before
	public void initialize() {
		mesa = new Mesa();
		jugador1 = new Jugador("Jacinta");
		jugador2 = new Jugador("Bryan");
		jugador3 = new Jugador("Pedro");
		jugador4 = new Jugador("Pepito");
		jugador5 = new Jugador("Charlie");
	}
	
	@Test
	public void verificarCantidadMaximaJugadoresPositivo() {		
		mesa.agregarJugador(jugador1);
		assertEquals(1,mesa.jugadores.size());		
	}
	
	@Test
	public void verificarCantidadMaximaJugadoresNegativo() {		
		mesa.agregarJugador(jugador1);
		mesa.agregarJugador(jugador2);
		assertNotEquals(1,mesa.jugadores.size());
	}
	
	@Test
	public void empezarAJugar21Test() {
		mesa.agregarJugador(jugador1);
		mesa.empezarAJugar21();
		assertEquals(2,jugador1.getMano().size());
	}


}
