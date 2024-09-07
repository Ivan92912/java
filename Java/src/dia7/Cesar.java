package dia7;
import java.util.Scanner;
public class Cesar {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Introduce texto:");
		String b = a.nextLine();
		a.close(); 
		
		String prueba=CifradoCesar(b);
		System.out.println(prueba);
		String prueba1=DescifradoCesar(prueba);
		System.out.println(prueba1);
	}
	public static String CifradoCesar(String texto) {
		int c=28, d,e,f;
		String textoEncriptado;
		textoEncriptado=""; 
		for(int i=0;i<texto.length();i++) {
			
			if((texto.charAt(i)>96)&&(texto.charAt(i)<123)){
				d=texto.charAt(i)+c;
				if(d>122) {
				 e=d-122;
				 f=96+e;
				 //System.out.print((char)(f));
				 textoEncriptado+=(char)(f);
				}
				else {
					//System.out.print((char)(texto.charAt(i)+c));
					textoEncriptado+=(char)(texto.charAt(i)+c); 
				}
			}
			else if((texto.charAt(i)==32)) {
				textoEncriptado+=(char)(texto.charAt(i));
			}
				
			
		}
		
		return textoEncriptado;
	}
	public static String DescifradoCesar(String texto) {
		int c= 28, d,e,f;
		String textoEncriptado;
		textoEncriptado=""; 
		for(int i=0;i<texto.length();i++) {
			
			if((texto.charAt(i)>96)&&(texto.charAt(i)<123)){
				d=texto.charAt(i)-c;
				if(d<=96) {
				 e=d+(26);
				 //System.out.print("SSSSS");
				 textoEncriptado+=(char)e;
				}
				else {
					//System.out.print((char)(texto.charAt(i)+c));
					textoEncriptado+=(char)(texto.charAt(i)-c); 
				}
			}
			else if((texto.charAt(i)==32)) {
				textoEncriptado+=(char)(texto.charAt(i));
			}
				
			
		}
		
		return textoEncriptado;
	}
}
