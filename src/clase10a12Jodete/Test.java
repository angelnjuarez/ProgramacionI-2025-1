package clase10a12Jodete;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Mazo mazo1 = new Mazo();
		mazo1.mezclar();
		Mano jugador = new Mano();
		Carta mesa = mazo1.devolverCarta();

		for (int i = 0; i < 5; i++) {
			jugador.recibirCarta(mazo1.devolverCarta());
		}

		Scanner sc = new Scanner(System.in);

		while (jugador.cantCartas() > 0 && mazo1.cantCartas > 0) {
			System.out.println("Carta en mesa: " + mesa);
			System.out.println("Elegir una carta:");
			jugador.mostrar();
			System.out.println("Seleccione una carta de la mano: ");

			int k = sc.nextInt();

			if (k > jugador.cantCartas()) {
				throw new RuntimeException("Sólo puede jugar cartas entre 0 y " + (jugador.cantCartas() - 1));
			}

			// TODO try/catch

			Carta c = jugador.jugarCarta(k);

			if (c.palo == mesa.palo || c.numero == mesa.numero) {
				mesa = c;
			} else {
				System.out.println("Carta inválida, toma una carta por penalización");
				System.out.println(c);
				jugador.recibirCarta(c);
			}

			System.out.println("Se jugo la carta " + k);
			jugador.mostrar();
		}

		if (jugador.cantCartas() == 0) {
			System.out.println("GANASTE");
		} else {
			System.out.println("PERDISTE");
		}

	}

}
