package juego;

import java.util.ArrayList;

public class Jugador {
	
	String nombre;
	int cantidadCartas;
	
	ArrayList<Carta> mano;
	
	public Jugador() {}
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.mano = new ArrayList<Carta>();
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
	
	public void agregarCartaMano(Carta pCarta) {		
		mano.add(pCarta);	
	}
	
	public int calcularMano() {
		int total = 0;		
		for(int i = 0; i < mano.size(); i++) {			
			total = total + mano.get(i).getValor();		}
		return total;		
	}
	
}
