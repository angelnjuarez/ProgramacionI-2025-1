package clase6RecursionCierre;

public class RecArreglos {

	/*
	 * Función auxiliar para eliminar el primer elemento del arreglo
	 */
	public static int[] resto(int[] ar) {
		int[] nuevo = new int[ar.length - 1];
		for (int i = 1; i < ar.length; i++) {
			nuevo[i - 1] = ar[i];
		}
		return nuevo;
	}

	/*
	 * Versión no recursiva
	 */
//	public static void imprimir(int[] ar) {
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + ", ");
//		}
//		System.out.println();
//	}

	/*
	 * Versión recursiva con funciones auxiliares
	 */
	public static void imprimir(int[] ar) {
		System.out.print("[ ");
		imprimirAux(ar);
		System.out.println(" ]");
	}

	// Función auxiliar
	public static void imprimirAux(int[] ar) {
		if (ar.length == 1) {
			System.out.print(ar[0]);
			return;
		}
		System.out.print(ar[0] + ", ");
		imprimirAux(resto(ar));
	}
	
	public static int suma(int[] ar) {
		if(ar.length == 0) {
			return 0;
		}
		return ar[0] + suma(resto(ar));
	}



}
