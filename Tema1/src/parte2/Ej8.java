package parte2;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// declara variable para calculo
		double metros;
		double centimetros;
		//calculo final
		int fin;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("eCantidad en metros");
		// Leer el numero introducido por pantalla
		metros = sc.nextDouble();
		centimetros = metros*100;
		fin = (int)centimetros;
		System.out.println(fin);
	}

}
