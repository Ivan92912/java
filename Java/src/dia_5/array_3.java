package dia_5;
import java.lang.Math;
public class array_3 {

	public static void main(String[] args) {
		new java.util.Random();
		int a,b;
		a= (int) (Math.random()*50);
		
		int[] array= new int[a];
			for (int i=0; i<a; i++) {
				 b=(int)(Math.random()*100);
				 array[i]=b;
			 }
			 System.out.println(array.length);
			 for (int i=0; i<a; i++) {
				 System.out.print(array[i]+", ");
			 }
	
	}		
}

