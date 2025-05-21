package clase19a20Listas;

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

	public void agregarAdelante(int e) {
		NodoInt nuevo = new NodoInt(e);
		nuevo.siguiente = this.primero;
		this.primero = nuevo;
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

	public int largo() {
		NodoInt actual = this.primero;
		int cant = 0;
		while (actual != null) {
			cant++;
			actual = actual.siguiente;
		}
		return cant;
	}

	public void quitar(int e) {
		if (this.primero != null && this.primero.elemento == e) {
			this.primero = this.primero.siguiente;
			return;
		}
		NodoInt actual = this.primero;
		while (actual.siguiente != null) {
			if (actual.siguiente.elemento == e) {
				actual.siguiente = actual.siguiente.siguiente;
				return;
			}
			actual = actual.siguiente;
		}
		if (this.primero != null && this.primero.elemento == e) {
			this.primero = this.primero.siguiente;
			return;
		}
	}

	public int maximo() {
		NodoInt actual = this.primero;
		int maximo = this.primero.elemento;
		while (actual.siguiente != null) {
			if (maximo < actual.elemento) {
				maximo = actual.elemento;
			}
			actual = actual.siguiente;
		}
		return maximo;
	}

	public boolean pertenece(int elem) {
		NodoInt actual = this.primero;
		while (actual.siguiente != null) {
			if (actual.elemento == elem) {
				return true;
			}
			actual = actual.siguiente;
		}
		return false;
	}

	public int iesimo(int pos) {
		if (pos <= this.largo()) {
			NodoInt actual = this.primero;
			int indice = 0;
			while (actual != null && indice < pos) {
				if (indice == pos) {
					return actual.elemento;
				}
				indice++;
				actual = actual.siguiente;
			}
		}
		throw new RuntimeException("La lista no tiene esa posicion");
	}

	public void quitarPorIndice(int i) {
		if(i == 0) {
			this.primero = this.primero.siguiente;
		}
		
	}
	
	
	
}
