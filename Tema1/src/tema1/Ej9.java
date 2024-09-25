package tema1;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Crear variable
		int num1;
		boolean mayor;
		mayor = (num1 >= 18);
		// Preguntamos
		System.out.println("Dame tu edad");
		// Leer el numero introducido por pantalla
		num1 = sc.nextInt();
		mayor = (num1 >= 18);
		// comprobacmos con if
		if (num1 < 18) {
			mayor = false;
		}
		if (mayor) {
			System.out.println("eres mayor edad");
		}
	}

}
