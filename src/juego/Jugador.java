package juego;

import java.util.ArrayList;

public class Jugador {
	
	String nombre;
	int cantidadCartas;
	
	ArrayList<Carta> mano = new ArrayList<Carta>(cantidadCartas);
	
	public Jugador(String nombre, ArrayList<Carta> mano) {
		this.nombre = nombre;
		this.mano = mano;
	}
	
	public ArrayList<Carta> getMano() {
		return mano;
	}

	public void setMano(ArrayList<Carta> mano) {
		this.mano = mano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
