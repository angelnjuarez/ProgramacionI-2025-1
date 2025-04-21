package clase04Recursion;

public class EjerNumericos {

	static int sumatoriaRec(int n) {
		if (n == 0) { // Caso base
			return n;
		}
		return n + sumatoriaRec(n - 1); // Caso recursivo
	}

	static int sumatoriaParesRec0(int n) {
		if (n == 0) { // Caso base
			return n;
		}
		if (n % 2 == 0) {
			return n + sumatoriaRec(n - 1); // Caso recursivo
		}
		return sumatoriaRec(n - 1);
	}

	/*
	 * Versión óptima, los llamados recursivos saltean los casos impares.
	 */
	static int sumatoriaParesRec1(int n) {
		if (n == 0) { // Caso base
			return 0;
		}
		if (n % 2 != 0) {
			return sumatoriaParesRec1(n - 1); // Caso recursivo impares
		}
		return n + sumatoriaParesRec1(n - 2); // Caso recursivo pares
	}

	static double potenciaRec(double x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * potenciaRec(x, n - 1);
	}

	static double factorialRec(int n) {
		if (n <= 1) {
			return 1; // Caso base
		}
		return n * factorialRec(n - 1); // Caso recursivo
	}

	static int cantCifras(int n) {
		if (n <= 9) {
			return 1;
		}
		return 1 + cantCifras(n / 10);
	}

	static int sumarCifras(int n) {
		if (n <= 9) {
			return n;
		}
		int m = n - (n / 10) * 10;
		return m + sumarCifras(n / 10);
	}

	static int sumarCifras1(int n) {
		if (n <= 9) {
			return n;
		}
		return n % 10 + sumarCifras1(n / 10);
	}

	static int cantidadParesEntre(int n, int m) {
		if (n > m) {
			return 0;
		}
		if (n % 2 == 0) {
			return 1 + cantidadParesEntre(n + 1, m);
		}
		return cantidadParesEntre(n + 1, m);
	}
}
