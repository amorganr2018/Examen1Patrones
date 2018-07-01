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
		
	private int calcularValor(String nombre) {
		int valor = 0;
		switch(nombre.toLowerCase()) {
			case "as":
				valor = 1;
				break;
			case "dos":
				valor = 2;
				break;
			case "tres":
				valor = 3;
				break;
			case "cuatro":
				valor = 4;
				break;
			case "cinco":
				valor = 5;
				break;
			case "seis":
				valor = 6;
				break;
			case "siete":
				valor = 7;
				break;
			case "ocho":
				valor = 8;
				break;
			case "nueve":
				valor = 9;
				break;
			case "diez":
			case "jota":
			case "quina":
			case "ka":
				valor = 10;
				break;
			default:
				System.out.println("Error valor de carta invalido");
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
	
	@Override
	public boolean equals(Object carta) {
		
	    if (this == carta) {
	    	return true;
	    }
	        
	    if (carta == null) {
	        return false;
	    }
	    
	    if(!(carta instanceof Carta)) {
	        return false;
	    }
	    
	    Carta cartaTemp = (Carta) carta;
	    
	    return this.getValor() == cartaTemp.getValor();
	}
}
