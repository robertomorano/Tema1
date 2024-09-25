package parte2;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		int num, difernecia;
		float multiplo;
		boolean esMultiplo;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("Calcular multiplo de 7");
		// Leer el numero introducido por pantalla
		num = sc.nextInt();
		// logica de resolucion
		multiplo = num / 7;
		multiplo = (int) (multiplo + 0.5);
		difernecia = num - (7 * multiplo);
		// (num%7)=0
		esMultiplo = (num % 7 == 0);
		System.out.println(esMultiplo + " le faltan " + difernecia + "para ser multiplo de 7 ");
		System.out.println(multiplo);
	}
}
