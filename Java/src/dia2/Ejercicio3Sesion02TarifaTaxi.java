package dia2;
import java.util.Scanner;
public class Ejercicio3Sesion02TarifaTaxi {

	public static void main(String[] args) {
		//Una cantidad fija de 18 euros si no se sobrepasan los 30 Km.
		// Para más de 30 Km, se consideran los siguientes supuestos:
		//Si no se sobrepasan los 100 Km, 0.85 euros por Km que exceda de los 30, además de los 18 euros.
		//Si sobrepasa los 100 Km, 0.65 euros por Km que exceda de los 100, 0.85 euros por Km desde los 30 a los 100 y los
		//18 euros.
		//Desarrolle un programa en Java que, a partir de los kilómetros recorridos, calcule y muestre por pantalla el total a
		//pagar según la tarifa anterior. ( TarifaTaxi )
		Scanner a= new Scanner(System.in);
		System.out.print("¿Cuantos kilometros has recorrido?:");
		
		double b = a.nextDouble();
		double c,d, e, f;
		c=0;
		d= 0.85;
		e= 0.65;
		f= (b-30)*d;
		if(b>0 && b<=30) {
		c=18;
		System.out.println(c+"€");
		}
		else if (b<=100) {
		c= 18+f;
		System.out.println(c+"€");
		
		}
		else if(b>100) {
		c= 18+ 70*d+(b-100)*e;
		System.out.println(c+"€");
		}
		else {
			System.out.println("Si sale dinero negativo no te voy a devolver");
		
	}
}
}
