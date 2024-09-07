package dia6;

public class metodos1 {

	public static void main(String[] args)  {
		int edad=16; 
		compraTabaco(edad); 
		
		}
	public static void compraTabaco(int edad) throws ArithmeticException {
		if(edad<18) {
			throw new ArithmeticException("El usuario es menor de edad");
		}
		System.out.print("Puede fumar");
	}
	}
	
	


