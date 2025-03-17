package clase3ArreglosStrings;

public class IntroEje {

	static int cantidadVocales(String s) {
		int cont = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				cont++;
			}
		}
		return cont;
	}

	static int cantidadVocales1(String s) {
		String aux = "aeiouAEIOUáéíóú";
		int cont = 0;
		for (int i = 0; i < s.length(); i++) {
			if (aux.indexOf(s.charAt(i)) != -1) {
				cont++;
			}
		}
		return cont++;
	}

	static boolean esAbecedaria(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) > s.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	static boolean esSinRepetidos(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) && i != j) {
					return false;
				}
			}
		}
		return true;
	}
	
	static boolean esCapicua(String s) {
		return false;
	}
	
	public static boolean dobleteCapicua(String s) {
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			s1 = s.substring(i);
			s2 = s.substring(0, i);
			if (esCapicua(s1) && esCapicua(s2)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int cont = 0;
		int m = 785;
		Integer n = 999;
		String res = n.toString();
		String x = "banana";

		// Cantidad de digitos de n
		while (n > 0) {
			n = n / 10;
			cont++;
		}
		// System.out.println(cont);

		// Cantidad de caracteres de res
		// System.out.println(res.length());

		// Reverso versión 1
		for (int i = x.length() - 1; i >= 0; i--) {
			// System.out.print(x.charAt(i));
		}
		// System.out.println();

		// Reverso con un nuevo String
		String xx = "";
		for (int i = 0; i < x.length(); i++) {
			xx = x.charAt(i) + xx;
		}
		// System.out.println(xx);
		// System.out.println(esAbecedaria("bello"));
		// System.out.println(esSinRepetidos("romo"));
		
		// Ejemplo substring
		String c = "banznA";
		System.out.println(c.substring(3) + " " + c.substring(2, 4));
	}

}
