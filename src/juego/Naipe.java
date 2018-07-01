package juego;

import java.util.ArrayList;
import java.util.Collections;

public class Naipe {
	
	ArrayList<Carta> naipe = new ArrayList<Carta>(52);
	
	String nombres[] = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Jota", "Quina", "Ka"};
	String palos[] = {"Escudo", "Flor", "Estrella", "Gota"};
	
	
	public Naipe() {
		
		for(int i=0; i<52; i++) {
			this.naipe.add(new Carta(nombres[i%13],palos[i/13]));
		}
	}
	
	public void barajarNaipe() {
		Collections.shuffle(this.naipe);
	}
       
}