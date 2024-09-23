package tema1;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		//Imprimimos por pantalla una pregunta
		System.out.println("Que año es: ");
		// Indicamos que se va a leer el teclado
				Scanner sc = new Scanner(System.in);
				//Crear variable
				int anoactual;
				// Leer el numero introducido por pantalla
				anoactual = sc.nextInt();
				//Cerramos el escaner
				//Imprimimos por pantalla una pregunta
				System.out.println("Que año naciste ");
				// Indicamos que se va a leer el teclado
				Scanner sc2 = new Scanner(System.in);
				//Crear variable
				int anonac;
				// Leer el numero introducido por pantalla
				anonac = sc2.nextInt();
				//Operamos
				int edad = (anoactual-anonac);
				// Mostrar numero pantalla
				System.out.println("Tu eddad el año es " + edad);
	}

}
