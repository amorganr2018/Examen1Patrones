package juego;

import java.util.ArrayList;

public class Mesa {
	
	Repartidor repartidor;
	public ArrayList<Jugador> jugadores;
	public int cantidadJugadores = 0;
	private final int cantidadMaximaJugadores = 4;

	public Mesa() {
		this.repartidor = new Repartidor();
		this.jugadores = new ArrayList<Jugador>();
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

	public void agregarJugador(Jugador pJugador) {
		if(jugadores.size()<cantidadMaximaJugadores) {
			this.jugadores.add(pJugador);
			cantidadJugadores++;
		}else {			
			System.out.println("Mesa llena, la cantidad maxima de jugadores por mesa "
					+ "es de "+cantidadMaximaJugadores+" judadores.");
		}
	}
	
	public void empezarAJugar21() {		
		for(int x = 0; x < jugadores.size(); x++) {		
			for(int y = 0; y < 2; y++ ) {				
				repartidor.darCarta(jugadores.get(x));
			}
		}
	}
	
	public ArrayList<Jugador> determinarGanadorDePartida() {
		ArrayList<Jugador> listaGanadores = new ArrayList<Jugador>();
		int manoAnterior = 0;		
		int resultado = 0;
		int resultadoLimite = 21;
		for(int i = 0; i < jugadores.size(); i++)  {				
			resultado = jugadores.get(i).calcularMano();			
			if(resultado <= resultadoLimite) {
				
				if (determinarVeinteYMedio(jugadores.get(i))) {
					 
					listaGanadores = new ArrayList<Jugador>();
					listaGanadores.add(jugadores.get(i));
					manoAnterior = resultado;
					
				}else {
					
					if (resultado > manoAnterior) {
						listaGanadores = new ArrayList<Jugador>();
						listaGanadores.add(jugadores.get(i));
						manoAnterior = resultado;
					} else if (resultado == manoAnterior) {
						listaGanadores.add(jugadores.get(i));
					} else {
						manoAnterior = resultado;
					}
				}
				
			} //						
		}
		return listaGanadores;		
	}
	
	public boolean determinarVeinteYMedio(Jugador pJugador) {	
		
		if((pJugador.getMano().get(0).getValor() == 10 || pJugador.getMano().get(0).getValor() == 2) &&
			(pJugador.getMano().get(1).getValor() == 10 || pJugador.getMano().get(1).getValor() == 2)) {
			return true;			
		}		
		return false;
	}

	public void verificarCambio(Jugador pJugador) {

		if(revisarJQKTres(pJugador.getMano().get(0)) && revisarJQKTres(pJugador.getMano().get(1)) ) {				
			pJugador.mano = new ArrayList<Carta>();
			repartidor.darCarta(pJugador);
			repartidor.darCarta(pJugador);
		}else {
			System.out.println("Cambio de cartas invalido");
		}
	}
	
	public boolean revisarJQKTres (Carta pCarta) {
		System.out.println(pCarta.getValor());
		if(pCarta.getValor() == 10 || pCarta.getValor() == 3) {
			return true;
		}else {
			return false;
		}		
	}
	
	
}
