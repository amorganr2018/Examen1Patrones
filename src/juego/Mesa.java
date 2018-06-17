package juego;

import java.util.ArrayList;

public class Mesa {
	
	Repartidor repartidor = new Repartidor();
	ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

	public Mesa(Repartidor repartidor, ArrayList<Jugador> jugadores) {
		this.repartidor = repartidor;
		this.jugadores = jugadores;
	}

	public Repartidor getRepartidor() {
		return repartidor;
	}

	public void setRepartidor(Repartidor repartidor) {
		this.repartidor = repartidor;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public boolean agregarJugadores(Jugador jugador) {
		
		boolean agregado = false;
		
		if (jugadores.size()<4){
			
			jugadores.add(jugador);
			agregado = true;
		}
		
		return agregado;
		
	}
	
	
}
