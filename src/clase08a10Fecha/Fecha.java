package clase08a10Fecha;

public class Fecha {

	/*
	 * IREP (Invariante de Representación)
	 * 1<= mes <=12 
	 * 1<= dia <= diasDelMes(dia,anio)
	 */

	private int dia;
	private int mes;
	private int anio;

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
		String[] nomMes = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		System.out.println(this.dia + " de " + nomMes[this.mes] + " de " + this.anio);
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

	public int getDia() {
		return this.dia;
	}

	public void setDia(int d) {
		if (d < 1 || d > diasDelMes())
			throw new RuntimeException(d + " no es un día válido");
		this.dia = d;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes < 1 || mes > 12)
			throw new RuntimeException(mes + "no es un mes válido");
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		if (anio < 1900)
			throw new RuntimeException(anio + "no es un año válido");
		this.anio = anio;
	}

}
