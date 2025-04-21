package clase06RecursionCierre;

public class Consultas {

	/*
	 * Ej 2 Ejercicios de parciales de recursión
	 */
	public static String estaPrimera(String s1, String s2) {
		if (s1.isEmpty() || s2.isEmpty()) {
			return "";
		}
		if (s1.charAt(0) < s2.charAt(0)) {
			return s1;
		}
		if (s2.charAt(0) < s1.charAt(0)) {
			return s2;
		}
		return s1.charAt(0) + estaPrimera(s1.substring(1), s2.substring(1));
	}

}
