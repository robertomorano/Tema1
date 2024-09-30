package parte2;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		float seg, min, hour;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("dame una cantidad de segundos");
		// Leer el numero introducido por pantalla
		seg = sc.nextInt();
		// logica para calcular la hora
		min = seg / 60;
		hour = min / 60;
		hour = (int) hour;
		min -= hour * 60;// truncamos las hora para pasarlas a minutos y el sobrante son los minutos
								// restantes para completar la hora
		min = (int) min;
		seg = - ((hour * 60 * 60) + (min * 60)) + seg;
		System.out.println("Son " + hour + " horas " + min + " minutos " + seg + " segundos");
	}

}
