package juego;

public class Carta {

	String palo, nombre;
	int valor;
	
	public Carta() {}
	
	public Carta(String palo, String nombre, int valor) {
		this.palo = palo;
		this.nombre = nombre;
		this.valor = valor;
	}
		
	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
