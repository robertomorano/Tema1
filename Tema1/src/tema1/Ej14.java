package tema1;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// Declara variabls
		int mediaInt;
		double nota1, nota2, nota3, mediaDo;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("Nota 1");
		// Leer el numero introducido por pantalla
		nota1 = sc.nextDouble();
		// Preguntamos
		System.out.println("Nota 2");
		// Leer el numero introducido por pantalla
		nota2 = sc.nextDouble();
		System.out.println("Nota 3");
		// Leer el numero introduido por pantalla
		nota3 = sc.nextDouble();
		mediaDo= ((nota1+nota2+nota3)/3);
		mediaInt= (int)mediaDo;
		System.out.println("Esta es "+ mediaInt +" laotra "+ mediaDo);

	}

}
