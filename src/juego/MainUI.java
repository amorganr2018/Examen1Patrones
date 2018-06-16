package juego;

public class MainUI {

	public static void main(String[] args) {
		
		String palo, nombre;
		int valor;
		boolean cartaCreada;
		
		palo = "escudo";
		nombre = "cinco";
		valor = 5;
		cartaCreada = false;
		
		cartaCreada = crearCarta(palo, nombre, valor);
		
		if (cartaCreada) {
			System.out.println("La carta se creo exitosamente");
		}
		
	}

	private static boolean crearCarta(String palo, String nombre, int valor) {
		boolean creada = false;
		
		if (valor > 10 && valor < 1) {
			System.out.println("El valor de la carta es invalido");			
		}
		
		return creada;
	}

	

}
