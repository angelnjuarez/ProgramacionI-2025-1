package clase10a12Jodete;

import java.util.Random;

public class Mazo {
	private Carta[] cartas;
	int cantCartas;
	/*
	 * IREP: - cartas.length == 40
	 * - No hay cartas nulas
	 * - No hay cartas repetidas
	 */

	public Mazo() {
		this.cartas = new Carta[40];
		int j = 0;
		for (int p = 0; p <= 3; p++) {
			for (int i = 1; i <= 7; i++) {
				cartas[j] = new Carta(p, i);
				j++;
			}
			for (int i = 10; i <= 12; i++) {
				cartas[j] = new Carta(p, i);
				j++;
			}
		}
		this.cantCartas = 40;
	}

	public void mezclar() {
		Random r = new Random();
		for (int i = 0; i < 4000; i++) {
			int pos1 = r.nextInt(40);
			int pos2 = r.nextInt(40);
			Carta aux = cartas[pos1];
			cartas[pos1] = cartas[pos2];
			cartas[pos2] = aux;
		}
	}

	public void mostrar() {
		for (int i = 0; i < this.cantCartas; i++) {
			System.out.println(cartas[i]);
		}
	}

	public int cantCartas() {
		return this.cantCartas;
	}

	public Carta devolverCarta() {
		Carta aux = cartas[this.cantCartas - 1];
		cartas[this.cantCartas - 1] = null;
		this.cantCartas--;
		return aux;
	}

}
