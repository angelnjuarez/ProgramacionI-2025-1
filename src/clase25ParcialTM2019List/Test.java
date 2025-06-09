package clase25ParcialTM2019List;

public class Test {

	public static void main(String[] args) {
		ListaInt lista = new ListaInt();
		lista.agregarAtras(10);
		lista.agregarAtras(8);
		lista.agregarAtras(5);
		lista.agregarAtras(6);
		lista.agregarAtras(0);
		lista.agregarAtras(2);
		lista.agregarAtras(1);
		lista.filtrarElementosEnRango(5, 9);
		lista.imprimir();

	}

}
