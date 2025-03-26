package clase5RecursionAux;

public class RecNumeros {

	/*
	 * Imprime por pantalla los números entre 1 y n (en orden ascendente).
	 */
	static void imprimirHasta(int n) {
		if (n == 1) {
			System.out.println(n);
			return;
		}
		imprimirHasta(n - 1);
		System.out.println(n);
	}

	/*
	 * Calcula la cantidad de números primos que hay entre n y m. Asumir que se
	 * tiene una función que indica si un número es primo o no (hacerla antes!)
	 */
	static int cantidadPrimosEntre(int n, int m) {
		if (n > m) {
			return 0;
		}
		if (esPrimo(n)) {
			return 1 + cantidadPrimosEntre(n + 1, m);
		}
		return cantidadPrimosEntre(n + 1, m);
	}

	private static boolean esPrimo(int n) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * Calcula el primer número primo mayor a n. Si n es primo, devolvemos n.
	 */
	static int siguientePrimo(int n) {
		if (esPrimo(n)) {
			return n;
		}
		return siguientePrimo(n + 1);
	}

	static boolean esPar(int n) {
		if (n == 0) {
			return true;
		}
		if (n == 1) {
			return false;
		}
		return esPar(n - 2);
	}

}
