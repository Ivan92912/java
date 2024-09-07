package dia2;
import java.util.Scanner;
public class Ejercicio1Sesion02BuenosDias {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Introduzca la hora:");
		
		int b =  a.nextInt();
		System.out.println(b);
		
		Scanner c = new Scanner(System.in);
		System.out.print("Introduzca los minutos:");
		
		int d= c.nextInt();
		System.out.println(d);
		
		if(b>=6 && b<12){
		System.out.print("Buenos dias");}
		
		else if(b>=12 && b<20) {
			System.out.print("Buenas tardes");
		}
		else {System.out.print("Buenas noches");
			
		}

	}

}
