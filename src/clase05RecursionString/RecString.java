package clase05RecursionString;

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

	public static void imprimirEspaciado(String s) {
		// TODO
	}

	public static String reverso(String s) {
		if (s.equals("")) {
			return s;
		}
		return reverso(s.substring(1)) + s.charAt(0);
	}

	/*
	 * Devuelva el String que resulta de comparar s y t caracter a caracter y
	 * colocar el menor de ellos en el resultado. Si un String es más largo que el
	 * otro, el resto de ese String se agrega al final del resultado. Ejemplos:
	 * 
	 * combinar(“abd”, "bbc") devuelve "abc" combinar(“fgd”, "adfxgtgs") devuelve
	 * "addxgtgs"
	 */
	public static String combinar(String s, String t) {
		if (s.isEmpty() || t.isEmpty()) {
			return s + t;
		}
		if (s.charAt(0) <= t.charAt(0)) {
			return s.charAt(0) +
			combinar(s.substring(1), t.substring(1));
		} else {
			return t.charAt(0) + 
			combinar(s.substring(1), t.substring(1));
		}
	}

}
