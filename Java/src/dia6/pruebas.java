package dia6;
import java.lang.Math;
import dia6.Calculadoradematrices; 
public class pruebas {


	public static void main(String[] args) {
		int [][] A = new int[2][2];
		int [][] B = new int[2][3];
		int [][] C = new int[3][3];
		int b=2;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				int a;
				a=(int) (Math.random()*100);
				A[i][j]=a;
				
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				int a;
				a=(int) (Math.random()*100);
				B[i][j]=a;
			}
		}
		C=Calculadoradematrices.restaMatrices(A,B); 
		Calculadoradematrices.printMatriz(A); 
		Calculadoradematrices.printMatriz(C);
		

	}
}
