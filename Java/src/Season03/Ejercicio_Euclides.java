package Season03;
import java.util.Scanner;
public class Ejercicio_Euclides {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		int x;
		while(true) {
		System.out.println("Introduce el primer valor entero positivo");
		x=a.nextInt();
		if(x>0) {
			break;
			}
		}
		Scanner b= new Scanner(System.in);
		int y;
		while(true) {
		System.out.println("Introduce el segundo valor entero positivo");
		y=b.nextInt();
		if(y>0) {
			break;
			}
		}
		metodo.MCD(x, y);
		
	}
	
		
		
}


