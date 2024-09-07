package dia2;
import java.util.Scanner;
public class Ejercicio2Sesion02DiasSemanas2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Introduce un número del 1 al 7:");
		
		int b = a.nextInt();
		
		if (1<=b && b<=7) {
			switch (b) {
			case 1 :
			System.out.println("Hoy es lunes");
			break;
			case 2 :
			System.out.println("Hoy es martes");
			break;
			case 3 :
			System.out.println("Hoy es miercoles");
			break;
			case 4 :
			System.out.println("Hoy es jueves");
			break;
			case 5 :
			System.out.println("Hoy es viernes");
			break;
			case 6:
			System.out.println("Hoy es sabado");
			break;
			case 7:
			System.out.println("Hoy es domingo");
			break;
			}

		}	else {
			System.out.println("ERROR");
		}
	}		
}

