package juego;

public class Carta {

	String palo, nombre;
	int valor;
	
	public Carta() {}
	
	public Carta(String palo, String nombre) {
		this.palo = palo;
		this.nombre = nombre;
		this.valor = calcularValor(nombre);
	}
		
	public int calcularValor(String nombre) {
		int valor = 0;
		if(nombre.toLowerCase() == "as") {
			valor = 1; 
		}else if(nombre.toLowerCase() == "dos") {
			valor = 2;
		}else if(nombre.toLowerCase() == "tres") {
			valor = 3;
		}else if(nombre.toLowerCase() == "cuatro") {
			valor = 4;
		}else if(nombre.toLowerCase() == "cinco") {
			valor = 5;
		}else if(nombre.toLowerCase() == "seis") {
			valor = 6;
		}else if(nombre.toLowerCase() == "siete") {
			valor = 7;
		}else if(nombre.toLowerCase() == "ocho") {
			valor = 8;
		}else if(nombre.toLowerCase() == "nueve") {			
			valor = 9;
		}else if(nombre.toLowerCase() == "jota" ||
				nombre.toLowerCase() == "quina" ||
				nombre.toLowerCase() == "ka") {
			valor = 10;
		}
		
		return valor;
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
