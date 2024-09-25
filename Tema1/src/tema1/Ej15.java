package tema1;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double IVA = 21;
		double precio;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("precio del producto");
		// Leer el numero introducido por pantalla
		precio = sc.nextDouble();
		precio += (precio*(IVA/100));
		System.out.println("El precio final es precio "+ precio);
	}

}
