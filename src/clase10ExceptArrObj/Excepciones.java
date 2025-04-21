package clase10ExceptArrObj;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		String abc = "abcdefghijklmñnopqrstuvwxyz";
		boolean ok = false;
		while (!ok) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Ingrese el numero de letra del abecedario " + "que quiere consultar:");
				int i = scan.nextInt();

				System.out.println("La letra numero " + i + " es " + abc.charAt(i - 1));
				ok = true;
			} catch (StringIndexOutOfBoundsException ex) {
				System.out.println("El numero debe estar entre 1 y " + abc.length());
			} catch (InputMismatchException ex) {
				System.out.println("El valor ingresado debe ser un número");
			} catch (Exception ex) {
				System.out.print("Se produjo el siguiente error: " + ex.getMessage());
			} finally {
				System.out.println("Siempre ingreso acá");
			}

		}
		System.out.println("llegué acá");
	}
}
