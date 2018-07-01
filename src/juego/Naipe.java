package juego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Naipe {
	
	Stack<Carta> naipe;
	Carta carta;
	
	String nombres[] = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve","Diez", "Jota", "Quina", "Ka"};
	String palos[] = {"Escudo", "Flor", "Estrella", "Gota"};
	
	
	public Naipe() {
		naipe = new Stack<Carta>();
		
		for(int x=0; x<palos.length; x++){
			
			for(int y=0; y<nombres.length; y++) {
				
				carta = new Carta(palos[x],nombres[y]);
				//System.out.println("Palo: " + carta.getPalo()+" y Nombre/Valor:"+ carta.getNombre());
				
				this.naipe.add(carta);				
			}
		}
	}
	
	public void barajarNaipe() {
		Collections.shuffle(this.naipe);
	}
	
	public Carta sacarCarta(){
		return naipe.pop();
	}
       
}