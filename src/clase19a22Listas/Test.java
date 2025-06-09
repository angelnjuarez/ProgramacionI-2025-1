package clase19a22Listas;

public class Test {

	public static void main(String[] args) {
		ListaInt lista = new ListaInt();
		lista.agregarAdelante(4);
		lista.agregarAtras(3);
		lista.agregarAtras(1);
		lista.agregarAtras(3);
		lista.agregarAtras(5);

		lista.imprimir();
		lista.extraerConsecutivos2().imprimir();
		lista.imprimir();
	}

}
