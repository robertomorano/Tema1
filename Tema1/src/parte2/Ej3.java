package parte2;

import java.util.Scanner;

public class Ej3 {

public static void main(String[] args) {
		float multiplo, diferencia, num1, num2;
		boolean esMultiplo;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("Calcular multiplo dame un numero");
		// Leer el numero introducido por pantalla
		num1 = sc.nextInt();
		//Leer el segundo numero
		System.out.println("Segundo numero");
		num2 = sc.nextInt();
		// logica de resolucion
		multiplo = num1 / num2;
		multiplo += 0.5;
		multiplo = (int) multiplo;
		diferencia = num2*multiplo - num1;
		// (num%7)=0
		esMultiplo = (num1 % num2 == 0);
		System.out.println(esMultiplo + " le faltan " + diferencia + "para ser multiplo de 7 ");
	}
}


