package parte2;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// Declarar constantes
		final double ENTRADAINF = 15.5;
		final double ENTRADADULT = 20;
		// variable introducida
		int cantEntradas;
		double precio;
		// variable de comprobacion
		double mayor;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("entradas adultos");
		// Leer el numero introducido por pantalla
		cantEntradas = sc.nextInt();
		precio = ENTRADADULT * cantEntradas;
		System.out.println("entradas infantil");
		// Leer el numero introducido por pantalla
		cantEntradas = sc.nextInt();
		precio += ENTRADAINF * cantEntradas;
		// Se aplica descuentos es mayor a 100
		mayor = (precio >= 100) ? -precio * 0.05 + precio : precio;
		System.out.println(mayor);

	}

}
