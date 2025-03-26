package clase5RecursionAux;

public class RecString {

	/*
	 * Ejercicio 34, Practica 0
	 */
	static String intercalarAst(String s) {
		if (s.length() == 1) {
			return s;
		}
		return s.charAt(0) + "*" + intercalarAst(s.substring(1));
	}

	/*
	 * Ejercicio 35, Practica 0
	 */
	static String sinRepetidosConsecutivos(String s) {
		if (s.length() == 1) {
			return s;
		}
		if (s.charAt(0) == s.charAt(1)) {
			return sinRepetidosConsecutivos(s.substring(1));
		}
		return s.charAt(0) + sinRepetidosConsecutivos(s.substring(1));
	}

	public static int longitud(String s) {
		// s.length() == 0 || s.equals("")
		if (s.isEmpty()) {
			return 0;
		}
		return 1 + longitud(s.substring(1));
	}

}
