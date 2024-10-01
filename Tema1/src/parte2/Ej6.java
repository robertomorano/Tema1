package parte2;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// medida en milimetros
		int mm;
		// medida en centimetros
		int cm;
		// medida en metros
		int m;
		//medidas finales
		int mmEncm, mEncm;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("dAME UNA MEDIDA");
		// Leer el numero introducido por pantalla
		mm = sc.nextInt();
		// Leer el segundo en centimetros
		System.out.println("otra en centimetros");
		cm = sc.nextInt();
		// Leer el ultimo en metros
		System.out.println("otra en metros");
		m = sc.nextInt();
		//pasar unidades
		mmEncm = mm/10;
		mEncm = m*100;
		//calculo final
		cm = mmEncm+mEncm+cm;
		//Mostrar por pantalla
		System.out.println("Estas son las unidades: "+ cm);
	}
}
