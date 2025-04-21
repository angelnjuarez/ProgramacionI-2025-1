package clase10ExceptArrObj;

import java.util.Random;

public class Mazo {
	private Carta[] cartas;
	/*
	 * IREP: - cartas.length == 40 - No hay cartas nulas - No hay cartas repetidas
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
		for (int i = 0; i < 40; i++) {
			System.out.println(cartas[i]);
		}
	}

	public int cantCartas() {
		return 40;
	}

}
