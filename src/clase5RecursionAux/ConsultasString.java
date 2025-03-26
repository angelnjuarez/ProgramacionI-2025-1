package clase5RecursionAux;

public class ConsultasString {

	/*
	 * VER VIDEO MOODLE Ejercicio 23, Practica 0
	 */
	static boolean puedenColocarse(String a, String b, String c) {
		for (int i = 0; i < b.length(); i++) {
			if (a.indexOf(b.charAt(i)) != -1) {
				i++;

				for (int j = i + 1; j < b.length(); j++) {
					if (a.indexOf(b.charAt(j)) != 0) {
						return true;
					}
				}
				return false;
			}
		}
		return false;
	}

	/*
	 * Ejercicio 24, Practica 0
	 */
	static boolean esDobleteCapicua(String s) {
		String s1, s2;
		for (int i = 1; i < s.length(); i++) {
			s1 = s.substring(0, i);
			s2 = s.substring(i);
			if (esCapicua(s1) && esCapicua(s2)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Ejercicio 20, Practica 0
	 */
	static boolean esCapicua(String s1) {
		//TODO
		return false;
	}

}
