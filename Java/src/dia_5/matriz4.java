package dia_5;
import java.lang.Math;
/* Vas a crear dos matrices A y B. Serán matrices de 3x3. 
 * Una vez que las crees, vas a realizar el producto de A*B u lo vas a almacenar en otra matriz llamada C. 
 * C=A*B
 * Una vez que tengas C, imprime las tres matrices por pantalla. 
 */
public class matriz4 {
	
	public static void main(String[] args) {
		//Creación de una matriz de 3x3
		int c;
		int[][] matrizc=new int[3][3];
		int[][] matriza= new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int a;
				a=(int) (Math.random()*100);
				matriza[i][j]=a;
			}	
		}
		int[][] matrizb= new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int b;
				b=(int) (Math.random()*100);
				matrizb[i][j]=b;
			}	
		}
		for (int i=0; i<3;i++)	{
			for(int j=0; j<3;j++) {
				c=0;
				for(int k=0; k<3;k++) {	
					c+=matriza[i][k]*matrizb[k][j];	
				}
				matrizc[i][j]=c;
				
			}
	}	
		for(int k=0; k<3;k++) {
		for(int l=0;l<3;l++) {
			if(l==0){System.out.print("|");}
            System.out.print(matriza[k][l] + "  ");
            if(l==2) {System.out.print("|");}
		}
		System.out.println(" ");	
}
		for(int k=0; k<3;k++) {
			for(int l=0;l<3;l++) {
				if(l==0){System.out.print("|");}
	            System.out.print(matrizb[k][l] + "  ");
	            if(l==2) {System.out.print("|");}
			}
			System.out.println(" ");	
	}
		for(int k=0; k<3;k++) {
			for(int l=0;l<3;l++) {
				if(l==0){System.out.print("|");}
	            System.out.print(matrizc[k][l] + "  ");
	            if(l==2) {System.out.print("|");}
			}
			System.out.println(" ");	
	}
	}}
		


		
