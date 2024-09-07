package dia3;
import java.util.Scanner;
public class numeroprimo {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Introduce el nuemero que quieres comprobar si es primo:");
		
		int b = a.nextInt();
		int c,d;
		c=3;
		long start1 = System.nanoTime();
	   
	      
		 do {
		d=b%c;
		c=c+2;
	}  while (d>0 && c<b);
		if (d>0) {
			System.out.println("Es primo");
		} 
		long end1 = System.nanoTime();      
	    System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));
		
}
}