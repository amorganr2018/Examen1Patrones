package juego;

public class Repartidor {
	
	Naipe naipe;
	public int cantidadCartasEnNaipe=52;
	
	public Repartidor() {
		naipe = new Naipe();
		naipe.barajarNaipe();
	}
	
	public void darCarta(Jugador pJugador) {
		pJugador.agregarCartaMano(naipe.sacarCarta());
		cantidadCartasEnNaipe--;
	}
	
}
