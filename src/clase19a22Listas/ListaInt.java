package clase19a22Listas;

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
		while (actual != null) {
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
		if (i == 0) {
			this.primero = this.primero.siguiente;
			return;
		}
		int pos = 1;
		NodoInt actual = this.primero;
		while (actual.siguiente != null) {
			if (pos == i) {
				actual.siguiente = actual.siguiente.siguiente;
				return;
			}
			actual = actual.siguiente;
			pos++;
		}
	}

	// _ _ _ _ _ _ _ Parcial TT 2023 _ _ _ _ _ _ _
	public ListaInt extraerConsecutivos2() {
		ListaInt nuevaLista = new ListaInt();
		NodoInt ultimoNueva = nuevaLista.primero; // O null
		NodoInt anterior = null;
		NodoInt actual = this.primero;

		while (actual != null) {
			if (actual.elemento == consecutivo(ultimoNueva)) {
				ultimoNueva = nodoANuevaLista(actual, nuevaLista, ultimoNueva);
				actual = eliminarNodo(anterior, actual);
			} else {
				anterior = actual;
				actual = actual.siguiente;
			}
		}
		return nuevaLista;
	}

	private NodoInt eliminarNodo(NodoInt anterior, NodoInt actual) {
		if (anterior == null) {
			this.primero = actual.siguiente;
		} else {
			anterior.siguiente = actual.siguiente;
		}
		return (anterior == null) ? this.primero : anterior.siguiente;
	}

	public NodoInt nodoANuevaLista(NodoInt nodo, ListaInt lista, NodoInt ultimo) {
		NodoInt nuevo = new NodoInt(nodo.elemento);
		if (lista.primero == null) {
			lista.primero = nuevo;
		} else {
			ultimo.siguiente = nuevo;
		}
		return nuevo;
	}

	private int consecutivo(NodoInt ultimo) {
		return (ultimo == null) ? minimo() : ultimo.elemento + 1;
	}

	// metodo común a ambas resoluciones
	private int minimo() {
		NodoInt actual = this.primero;
		int min = this.primero.elemento;
		while (actual != null) {
			if (actual.elemento < min) {
				min = actual.elemento;
			}
			actual = actual.siguiente;
		}
		return min;
	}

	// _ _ _ _ _ _ _ Parcial TT 2023 _ _ _ _ _ _ _
	public ListaInt extraerConsecutivos() {
		ListaInt nueva = new ListaInt();
		ListaInt posiciones = new ListaInt();
		int menor = minimo(); // O(n)
		int pos = 0;
		nueva.primero = new NodoInt(menor); // O(1)
		NodoInt actual = this.primero;
		NodoInt ultimo = nueva.primero;
		NodoInt ultPos = posiciones.primero;
		while (actual != null && actual.siguiente != null) {
			if (actual.siguiente.elemento == ultimo.elemento + 1) {
				// genera nueva
				NodoInt nuevo = new NodoInt(actual.siguiente.elemento);
				ultimo.siguiente = nuevo;
				ultimo = nuevo;

				// genera posiciones
				NodoInt nuevoPosi = new NodoInt(pos);
				if (ultPos == null) {
					ultPos = nuevoPosi;
					posiciones.primero = nuevoPosi;
				} else {
					ultPos.siguiente = nuevoPosi;
					ultPos = nuevoPosi;
				}

				actual = actual.siguiente;
				pos++;
			} else {
				actual = actual.siguiente;
				pos++;
			}
		}
		ultPos = posiciones.primero;
		while (ultPos != null) {
			this.quitarPorPosicion(ultPos.elemento);
			ultPos = ultPos.siguiente;
		}

		return nueva;
	}

	public void quitarPorPosicion(int posicion) {
		if (posicion == 0) {
			this.primero = this.primero.siguiente;
			return;
		}
		int pos = 0;
		NodoInt actual = this.primero;
		while (actual != null && actual.siguiente != null) {
			if (pos + 1 == posicion) {
				actual.siguiente = actual.siguiente.siguiente;
				return;

			}
			actual = actual.siguiente;
			pos++;
		}
	}

}
