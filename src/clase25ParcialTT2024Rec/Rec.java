package clase25ParcialTT2024Rec;

public class Rec {
	public static String recortarAN(String s, int n) {
		if (n == 0) {
			return "";
		}
		if (s.length() == 1) {
			return recortarAN(s, n - 1) + s.charAt(0);
		}
		return recortarAN(s.substring(0, s.length() - 1), n - 1)
			   + s.charAt(s.length() - 1);
	}

	public static void main(String[] args) {
		System.out.println(recortarAN("casa", 3));
		System.out.println(recortarAN("abcdefghijklmnopq", 10));
		System.out.println(recortarAN("x", 7));

	}
}
