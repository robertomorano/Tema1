package parte2;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		float multiplo, diferencia, num;
		boolean esMultiplo;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("Calcular multiplo de 7");
		// Leer el numero introducido por pantalla
		num = sc.nextInt();
		// logica de resolucion
		multiplo = num / 7;
		multiplo += 0.5;
		multiplo = (int) multiplo;
		diferencia = 7*multiplo - num;
		// (num%7)=0
		esMultiplo = (num % 7 == 0);
		System.out.println(esMultiplo + " le faltan " + diferencia + "para ser multiplo de 7 ");
	}
}
