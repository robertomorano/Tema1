package tema1;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Crear variable
		int kgMa,kgPe;
		final double VALORNA, VALORPE;
		double convertir;
		VALORNA = 2.35;
		VALORPE= 1.95;
		// Preguntamos
		System.out.println("Cuantos kilos");
		// Leer el numero introducido por pantalla
		kgMa = sc.nextInt();
		// operamos
		convertir = (kgMa*VALORNA);
		System.out.println("Los " + kgMa + " kg de manzanas son " + convertir + " pesetas");
		System.out.println("Cuantos kilos");
		kgPe = sc.nextInt();
		// operamos
		convertir = (kgPe*VALORPE);
		System.out.println("Los " + kgPe + " kg de peras son " + convertir + " pesetas");
	}

}
