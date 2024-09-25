package tema1;

import java.util.Scanner;

public class Ej13 {
	public static void main(String[] args) {
		boolean lluvia, biblioteca, tareas, salirCalle;
		lluvia = false;
		biblioteca = false;
		tareas = false;
		Scanner sc = new Scanner(System.in);
		//Preguntas
		System.out.println("¿Llueve?");
		lluvia = sc.nextBoolean();
		Scanner sc1 = new Scanner(System.in);
		//Preguntas
		System.out.println("¿Vas a la biblioteca?");
		biblioteca = sc1.nextBoolean();
		Scanner sc2 = new Scanner(System.in);
		//Preguntas
		System.out.println("¿Tareas qur hacer?");
		lluvia = sc2.nextBoolean();
		salirCalle = (!lluvia || (biblioteca && !tareas) );
		System.out.println(salirCalle);
		
	}

}
