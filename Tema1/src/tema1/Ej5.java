package tema1;
 
public class Ej5 {
	public static void main(String[] args){
		//Declarar variables
		float area, longitud, radio;
		radio = 3;
		//calculamos
		area= (float) (Math.PI*radio)*radio;
		longitud = (float) (Math.PI*2*radio);
		//imprimos
		System.out.println("El area: "+area+ " La logitud: "+longitud);
	}
}
