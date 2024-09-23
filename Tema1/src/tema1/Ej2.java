package tema1;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		//Imprimimos por pantalla una pregunta
		System.out.println("Que edad tienes ");
		// Indicamos que se va a leer el teclado
				Scanner sc = new Scanner(System.in);
				//Crear variable
				int numero;
				// Leer el numero introducido por pantalla
				numero = sc.nextInt();
				//Sumamos
				numero = numero+1;
				// Mostrar numero pantalla
				System.out.println("Tu eddad el año que viene sera: " + numero);

	}

}
