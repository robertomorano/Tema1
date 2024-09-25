package parte2;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		double num;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("numero con decimales: ");
		// Leer el numero introducido por pantalla
		num = sc.nextDouble();
		//Como redondear si el numero es mayor a 0,5 porque la funcion trunca
		num = (int)(num+0.5);
		System.out.println(num);
	}
}
