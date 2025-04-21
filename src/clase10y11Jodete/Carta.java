package clase10y11Jodete;

public class Carta {
	int palo;
	int numero;
	
	/*
	 * IREP:
	 * 0 <= palo <= 3
	 * 1 <= numero <= 7 || 10 <= numero <= 12
	 */
	
	public Carta(int palo, int numero) {
		this.palo = palo;
		this.numero =  numero;
	}
	
	public String toString() {
		String[] palos = {"espada", "copa", "basto", "oro"};
 		return this.numero + " de " + palos[this.palo];
	}
}
