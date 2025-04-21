package clase10y11Jodete;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Mazo mazo1 = new Mazo();
		mazo1.mezclar();
		Mano jugador = new Mano();
		Carta mesa = mazo1.devolverCarta();
		
		for (int i = 0; i < 5; i++) {
			jugador.recibirCarta(mazo1.devolverCarta());
		}
		
		System.out.println("Carta en mesa: " +mesa);
		System.out.println("Elegir una carta:");
		jugador.mostrar();
		
		int k=0;
		Carta c = jugador.jugarCarta(k);
		
		if(c.palo==mesa.palo || c.numero==mesa.numero) {
			mesa =c;
		} else {
			jugador.recibirCarta(c);
		}
		
		System.out.println("Se jugo la carta 0");
		jugador.mostrar();
		
		/*
		 * Hacer que el jugador ingrese K por el teclado
		 * Hacer un bucle while
		 * Mostrar cuando se ganó
		 */
		

	}

}
