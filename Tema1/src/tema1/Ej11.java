package tema1;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Crear variable
		int num1, VALOR;
		float convertir;
		VALOR = 166; 
		//Preguntamos
		System.out.println("Dame un numero");
		// Leer el numero introducido por pantalla
		num1 = sc.nextInt();
		//operamos
		convertir = (num1/VALOR);
		System.out.println("Los "+ num1 +"€ son "+ convertir+" pesetas");
	}

}
