package clase8y9ClaseFecha;

public class Test {
	
	public static void main(String[] args) {
//		System.out.println(Fecha.esBisiesto(2025));
//		System.out.println(Fecha.diasDelMes(2, 2024));
		Fecha hoy = new Fecha(30,6,2025);
//		System.out.println(hoy.diasDelMes());
		System.out.println(hoy.esValida());
		hoy.avanzarDia();
		hoy.imprimir();
	}
}
