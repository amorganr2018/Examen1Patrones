package juego.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import juego.Carta;
import juego.Jugador;
import juego.Mesa;

public class MesaTest {
	
	Mesa mesa;
	Jugador jugador1, jugador2, jugador3, jugador4, jugador5;
	Carta carta1, carta2, carta3, carta4;
	ArrayList<Carta> mano1, mano2;
	ArrayList<Jugador> listaGanadores;
	
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
	
	@Test
	public void determinarGanadorDePartidaTest() {
		
		carta1 = new Carta("flores", "cinco");
		carta2 = new Carta("estrellas", "cuatro");
		mano1 = new ArrayList<Carta>();
		mano1.add(carta1);
		mano1.add(carta2);
		jugador1.setMano(mano1);
		
		carta3 = new Carta("flores", "tres");
		carta4 = new Carta("estrellas", "dos"); 
		mano2 = new ArrayList<Carta>();
		mano2.add(carta3);
		mano2.add(carta4);
		jugador2.setMano(mano2);
		
		mesa.agregarJugador(jugador1);
		mesa.agregarJugador(jugador2);
		
		listaGanadores = mesa.determinarGanadorDePartida();
		
		assertEquals(jugador1,listaGanadores.get(0));		
	}
	
	@Test
	public void revisarJQKTresTest() {
		carta1 = new Carta("escudos", "cinco");
		carta2 = new Carta("estrellas", "tres");
		mesa = new Mesa();
		assertFalse(mesa.revisarJQKTres(carta1));
		assertTrue(mesa.revisarJQKTres(carta2));
	}
	
	@Test
	public void verificarCambioTest() {
		
		carta1 = new Carta("escudos", "jota");
		carta2 = new Carta("estrellas", "tres");
		mano1 = new ArrayList<Carta>();
		mano1.add(carta1);
		mano1.add(carta2);
		jugador1.setMano(mano1);
		mesa.agregarJugador(jugador1);		
		mesa.verificarCambio(jugador1);
		
		assertNotEquals(carta1, jugador1.getMano().get(0));
		assertNotEquals(carta2, jugador1.getMano().get(1));
		
	}
	
	@Test
	public void determinarVeinteYMedio() {
		carta1 = new Carta("escudos", "jota");
		carta2 = new Carta("estrellas", "dos");
		mano1 = new ArrayList<Carta>();
		mano1.add(carta1);
		mano1.add(carta2);
		jugador1.setMano(mano1);
		mesa.agregarJugador(jugador1);
		
		assertTrue(mesa.determinarVeinteYMedio(jugador1));
		
	}
	

}
