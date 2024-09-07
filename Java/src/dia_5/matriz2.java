package dia_5;
import java.lang.Math;
public class matriz2 {

	public static void main(String[] args) {
		int[][] matriza= new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int a;
				a=(int) (Math.random()*100);
				matriza[i][j]=a;
				
			}
		}	for(int k=0; k<3;k++) {
				for(int l=0;l<3;l++) {
					if(l==0){System.out.print("|");}
		            System.out.print(matriza[k][l] + "  ");
		            if(l==2) {System.out.print("|");}
				}
				System.out.println(" ");
		}
		int[][] matrizb= new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int b;
				b=(int) (Math.random()*100);
				matrizb[i][j]=b;
				
			}
		}	System.out.println(" ");
		for(int k=0; k<3;k++) {
				for(int l=0;l<3;l++) {
					if(l==0){System.out.print("|");}
		            System.out.print(matrizb[k][l] + "  ");
		            if(l==2) {System.out.print("|");}
				}
				System.out.println(" ");
		}System.out.println(" ");
		for(int k=0; k<3;k++) {
			for(int l=0;l<3;l++) {
				if(l==0){System.out.print("|");}
	            System.out.print(matriza[k][l] + matrizb[k][l]+" ");
	            if(l==2) {System.out.print("|");}
		
		
}System.out.println(" ");
		
		}
	}
}
		


		
