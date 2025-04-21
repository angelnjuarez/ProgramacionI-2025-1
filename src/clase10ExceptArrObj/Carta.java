package clase10ExceptArrObj;

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
}
