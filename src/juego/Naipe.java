package juego;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Naipe {
	
	ArrayList<Carta> naipe = new ArrayList<Carta>(52);
	
	String nombres[] = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Jota", "Quina", "Ka"};
	String palos[] = {"Escudo", "Flor", "Estrella", "Gota"};
	
	for(int i=0;cuenta<52;i++  ){
        this.naipe.add(new Carta(nombres[i%13],palos[i/13]));
    }
	
    Collections.shuffle(this.naipe);
       
	}
}
