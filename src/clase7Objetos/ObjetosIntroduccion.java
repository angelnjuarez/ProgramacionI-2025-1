package clase7Objetos;

import java.awt.*;

public class ObjetosIntroduccion {

	public static void main(String[] args) {
		
		Rectangle caja = new Rectangle(0, 0, 100, 200);
		/*
		 * El objeto Rectangle de Java implementa el método
		 * toString() que le permite mostrar las variables
		 * de instancia del objeto Rectangle.
		 * En nuestros objetos, al usar un print, por consola
		 * nos mostrará la referencia de memoria.
		 */
		System.out.println(caja);
		
		/*
		 * El método traslate es un método de instancia
		 * que modifica las variables de instancia del
		 * objeto caja.
		 */
		caja.translate(50, 100);
		System.out.println(caja);
		
		// Aliasing
		Point p1 = new Point(3, 4);
		Point p2 = p1;
		
		/*
		 * 
		 */
		System.out.println(p1==p2);
		
		p1.x = 5;
		System.out.println(p1==p2);

		p2 = new Point(3,4);
		System.out.println(p1.equals(p2));
	}
}
