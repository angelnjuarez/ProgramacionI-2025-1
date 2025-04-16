package clase8y9ClaseFecha;

public class Fecha {
	int dia;
	int mes;
	int anio;

	public Fecha(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}

	public Fecha() {

	}

	public Fecha(int a) {
		this.anio = a;
	}

	public void imprimir() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.anio);
	}

	static boolean esBisiesto(int anio) {
		if (anio % 4 == 0 && anio % 100 != 0) {
			return true;
		} else if (anio % 400 == 0) {
			return true;
		}
		return false;
	}

	public static int diasDelMes(int mes, int anio) {
		if (mes == 2) {
			return esBisiesto(anio) ? 29 : 28;
		}
		return (mes == 4 || mes == 6 || mes == 9 || mes == 11) ? 30 : 31;
	}

	public int diasDelMes() {
		if (this.mes == 2) {
			return esBisiesto(this.anio) ? 29 : 28;
		}
		return (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) ? 30 : 31;
	}

	public boolean esValida() {
		if (this.mes > 12 || this.mes < 1) {
			return false;
		}
		if (this.dia > diasDelMes() || this.dia <= 0) {
			return false;
		}
		return true;
	}

	public void avanzarDia() {
		if (this.dia < diasDelMes()) {
			this.dia++;
			return;
		}
		this.dia = 1;
		if (this.mes == 12) {
			this.mes = 1;
			this.anio++;
			return;
		}
		this.mes++;
	}
	
	
	public boolean antesQueI(Fecha otra) {
		if (this.anio > otra.anio) {
			return false;
		}
		if (this.anio < otra.anio) {
			return true;
		}
		if (this.mes > otra.mes) {
			return false;
		}
		if (this.mes < otra.mes) {
			return true;
		}
		return this.dia >= otra.dia ? false : true;
	}

	public int diaDelAnio() {
		int cont = 0;
		for (int i = 1; i < this.mes; i++) {
			cont = cont + diasDelMes(i, this.anio);
		}
		cont = cont + this.dia;
		return cont;
	}

	public int numSerie() {
		int cont = 0;
		for (int i = 1900; i < this.anio; i++) {
			cont = cont + 365 + (esBisiesto(i) ? 1 : 0);
		}
		cont = cont + this.diaDelAnio();
		return cont;
	}

	public int diasDeDiferenciaCon(Fecha otra) {
		return Math.abs(this.numSerie() - otra.numSerie());
	}

	public boolean antesQue(Fecha otra) {
		return this.numSerie() < otra.numSerie();
	}
}
