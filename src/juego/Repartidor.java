package juego;

public class Repartidor {
	
	public Naipe naipe;
	public int cantidadCartasEnNaipe=52;
	
	public Repartidor() {
		naipe = new Naipe();
		naipe.barajarNaipe();
	}
	
	public void darCarta(Jugador pJugador) {
		pJugador.agregarCartaMano(naipe.sacarCarta());
		cantidadCartasEnNaipe--;
	}
	
	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	
}
