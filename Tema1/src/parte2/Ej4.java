package parte2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int a, b, c, x, y;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("Calcular ecuacion de 2º grado"
				+ "dame un numero");
		// Leer el numero introducido por pantalla
		a = sc.nextInt();
		//Leer el segundo numero
		System.out.println("Segundo numero");
		b = sc.nextInt();
		System.out.println("Tercer numero");
		c= sc.nextInt();
		System.out.println("Dame un numero x");
		x= sc.nextInt();
		y= (a*x*x)+(b*x)+c;
		System.out.println("y es igual a:"+ y);
	}

}
