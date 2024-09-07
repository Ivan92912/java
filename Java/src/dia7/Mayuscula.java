package dia7;
import java.util.Scanner;
public class Mayuscula {

	public Mayuscula() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Introduce texto:");
		String b = a.nextLine();
		
		String prueba=Mayuscula(b);
		String prueba1=Minuscula(b);
	}
	public static String Mayuscula(String texto) {
		
		for(int i=0; i<texto.length();i++) {
			if((texto.charAt(i)>96)&&(texto.charAt(i)<123)){	
			System.out.print((char)(texto.charAt(i)-32));
			}
			else {
				System.out.print((char)(texto.charAt(i)));
			}
		}
		return texto;
		
	}public static String Minuscula(String texto) {
		
		for(int i=0; i<texto.length();i++) {
			if((texto.charAt(i)>64)&&(texto.charAt(i)<91)){	
				System.out.print((char)(texto.charAt(i)+32));
				}
				else {
					System.out.print((char)(texto.charAt(i)));
				}
		}
		return texto;
		
	}
}
