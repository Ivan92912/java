package dia7;

public class Ejemplo1 {


	public static void main(String[] args) {
		String palabra="hola que tal estas"; 
		
		for(int i=0; i<palabra.length(); i++) {
			if(palabra.charAt(i)!=32) {
				System.out.print((char)(palabra.charAt(i)+i/3+6));
			}
			else {
				System.out.print((char)(palabra.charAt(i)));
			}
			
		}
		//System.out.println((char)(palabra.charAt(2)-32));
		

	}

}
