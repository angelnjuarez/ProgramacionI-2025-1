package clase12practica1;

public class Fraccion {
	int numerador;
	int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public void imprimir() {
		System.out.println(this.numerador + "/" + this.denominador);
	}

}
