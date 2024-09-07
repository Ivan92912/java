package Season03;
import java.lang.Scanner   
public class metodo {
	public static void MCD(int x, int y ) {
		if(x==y||x>y) {
		
		int q,r,MCD,a,b;
		q=x/y;
		r=x%y;
		if(r==0 && y!=0) {
			MCD=y;
			System.out.println("El MCD de " +x+" y "+y+"es "+MCD+".");
		}
		else{
		  a=x;
		  b=y;
		  while(r!=0) {
		  x=y;
		  y=r;
		  
		  
		  q=x/y;
		  r=x%y;
		  if(r==0 && y!=0) {
			  MCD=y;
			  System.out.println("El MCD de " +a+" y "+b+" es "+MCD+".");
			  break;
		  }
		  }
		  
		}
		
		}
}
	public static void Fibonacci1(int f) {
		
	}
}
