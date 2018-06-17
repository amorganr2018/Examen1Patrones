package juego;

public class MainUI {

	public static void main(String[] args) {
	
		Carta primeraCarta, segundaCarta;
		
		String palo1 = "escudo";
		String nombre1 = "cinco";
		int valor1 = 5;
		
		primeraCarta = crearCarta(palo1, nombre1, valor1);
		
		if (primeraCarta!=null) {
			System.out.println("Primera carta creada");
		}
		
		String palo2 = "flores";
		String nombre2 = "jota";
		int valor2 = 10;
		
		segundaCarta = crearCarta(palo2, nombre2, valor2);
		
		if (segundaCarta!=null) {
			System.out.println("Segunda carta creada");
		}
		
		boolean iguales = false;
		
		iguales = compararCartas(primeraCarta, segundaCarta);
		
		if(iguales) {
			
			System.out.println("Las cartas son iguales");
			
		}else {
			
			System.out.println("Las cartas NO son iguales");
			
		}
		
	}

	public static Carta crearCarta(String palo, String nombre, int valor) {
		
		Carta carta = null;
		
		if (valor > 10 && valor < 1) {
			
			System.out.println("El valor de la carta es invalido");
			
		}else {
			
			carta = new Carta(palo, nombre, valor);	
		}
				
		return carta;
	}	
	
	public static boolean compararCartas(Carta primeraCarta, Carta segundaCarta) {
		
		boolean iguales = false;
		
		if(primeraCarta.getValor() == segundaCarta.getValor()) {
			
			iguales = true;			
		}
		
		return iguales;		
	}

	

}
