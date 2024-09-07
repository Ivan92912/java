package dia3;

import java.util.Scanner;

public class numerofactorial {

	public static void main(String[] args) {
		long d;
		Scanner a = new Scanner(System.in);
		System.out.print("Introduce un numero :");
		
		d = a.nextLong();
		
		for (long i=d-1 ; i>0 ;  i--) {	
		d=d*i;
		System.out.println(d);

	}

}
}
