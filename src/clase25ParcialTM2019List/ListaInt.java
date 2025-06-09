package clase25ParcialTM2019List;

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

	public void filtrarElementosEnRango(int k, int m) {
		if (this.primero == null) {
			return;
		}
		NodoInt actual = this.primero;
		while (actual.siguiente != null) {
			if(actual.siguiente.elemento > k &&
			   actual.siguiente.elemento < m) {
				actual = actual.siguiente;
			} else {
				actual.siguiente = actual.siguiente.siguiente;
			}
		}
		if (!(this.primero.elemento > k &&
			  this.primero.elemento < m)) {
			this.primero = this.primero.siguiente;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
