package clase24ParcialTurnoTarde22023;

public class Recursion {
	
	public static int contarP(String s) {
		// Caso base
		if (s.length() == 1) {
			return 0;
		}
		if (s.charAt(1) >= s.charAt(0)) {
			return 1 + contarP(s.substring(1));
		}
		return contarP(s.substring(1));
	}
}
