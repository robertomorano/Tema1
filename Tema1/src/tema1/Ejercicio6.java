package tema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		//Imprimimos por pantalla una pregunta
		System.out.println("Que año es: ");
		// Indicamos que se va a leer el teclado
		Scanner sc = new Scanner(System.in);
		//Crear variable
		int num1, num2;
		float operacion;
		// Leer el numero introducido por pantalla
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		//Imprimimos por pantalla una pregunta
		System.out.println("Que año naciste ");
		//Operamos
		operacion = (num1-num2);
		// Mostrar numero pantalla
		System.out.println("Tu eddad el año es " + operacion);
		//Operamos
		operacion = (num1+num2);
		// Mostrar numero pantalla
		System.out.println("Tu eddad el año es " + operacion);
		//Operamos
		operacion = (num1/num2);
		// Mostrar numero pantalla
		System.out.println("Tu eddad el año es " + operacion);
		//
		operacion = (num1*num2);
		// Mostrar numero pantalla
		System.out.println("Tu eddad el año es " + operacion);
	}

}
