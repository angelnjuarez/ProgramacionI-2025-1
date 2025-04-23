package clase12practica1;

public class Punto {
	double x;
	double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	static double distancia(Punto p1, Punto p2) {
		return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
	}

}
