package clase25ParcialTT2024List;

public class ListaInt {
	NodoInt primero;

	public ListaInt() {

	}

	public void imprimir() {
		System.out.print("[");
		NodoInt actual = this.primero;
		while (actual != null) {
			System.out.print(actual.elemento + " ");
			actual = actual.siguiente;
		}
		System.out.println("]");
	}

	public void agregarAtras(int e) {
		NodoInt nuevo = new NodoInt(e);
		if (this.primero == null) {
			this.primero = nuevo;
			return;
		}
		NodoInt actual = this.primero;
		while (actual.siguiente != null) {
			actual = actual.siguiente;
		}
		actual.siguiente = nuevo;
	}

	public void descomponerPares() {
		NodoInt actual = this.primero;
		while (actual != null) {
			if (actual.elemento % 2 == 0) {
				NodoInt nuevo = new NodoInt(actual.elemento * 2);
				actual.elemento = actual.elemento / 2;
				nuevo.siguiente = actual.siguiente;
				actual.siguiente = nuevo;
				actual = nuevo; // Puede ser acutal = actual.siguiente
			}
			actual = actual.siguiente;
		}
	}

}
