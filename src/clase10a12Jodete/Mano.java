package clase10a12Jodete;

public class Mano {
	Carta[] cartas;
	private int cantCartas;

	/*
	 * IREP -Las cartas no se repiten -
	 */
	public Mano() {
		this.cartas = new Carta[40];
		this.cantCartas = 0;
	}

	public void mostrar() {
		for (int i = 0; i < this.cantCartas; i++) {
			System.out.println(i + ": " + cartas[i]);
		}
	}

	public void recibirCarta(Carta c) {
		cartas[this.cantCartas] = c;
		this.cantCartas++;
	}

	public Carta jugarCarta(int k) {
		Carta aux = cartas[k];
		cartas[k] = cartas[this.cantCartas - 1];
		cartas[this.cantCartas - 1] = null;
		this.cantCartas--;
		return aux;
	}
	
	public int cantidadDeCartas() {
		return this.cantCartas;
	}

	public int cantCartas() {
		return this.cantCartas;
	}
}
