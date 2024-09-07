package dia2;
import java.lang.Math; 

public class Ejercicio1Session01Circunferencia {
	
	public static void main(String[] args) {
		double a, r;
		a= Math.PI; 		
		r=2;
		System.out.print("Radio:");
		System.out.println(r);
		System.out.print("Diametro de la circunferencia:");
		System.out.println(2*r);
		System.out.print("Perimetro de la circunferencia:");
		System.out.println(2*a*r);
		System.out.print("Area de la circunferencia:");
		System.out.println(a*Math.pow(r, 2));
		

	}

}
