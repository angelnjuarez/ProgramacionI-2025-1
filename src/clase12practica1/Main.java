package clase12practica1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Imagen lena = new Imagen("src/assets/lena.bmp");
		lena.enrojecer(100);
		Dibujador.dibujar(lena);
		lena.girarDerecha();
		Dibujador.dibujar(lena);
		
	}

}
