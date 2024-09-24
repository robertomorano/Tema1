package tema1;

import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Crear variable
		int num1;
		boolean esPar;
		esPar= false;
		//Preguntamos
		System.out.println("Dame un numero");
		// Leer el numero introducido por pantalla
		num1 = sc.nextInt();
		//comprobacmos con if
		if (num1%2==0) {
			esPar= true;
		}
		if (esPar){
			//Damos el resultado o no
			System.out.println("El "+num1+" es par");
		}
	}
}

