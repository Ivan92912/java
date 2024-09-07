package dia4;
import java.lang.Math;
public class array_aleatorio {


	public static void main(String[] args) {
		new java.util.Random();
		int a, j;
		j=0;
		int[] num=new int[50]; 
		int[] mun=new int[50];
			for(int i=0; i<50;i++) {
				a=(int) (Math.random()*100);
				num[i]=a; //Almacenas el valor de a en el vector num en la posición i. 
				
			} for(int i=0; i<50;i++) {
				a=num[i];
				if(a%2==0) {
					mun[j]=a;
					j++;
				
				}
			}
			for(int i=0; i<50;i++) {
				if(i==0) {
					System.out.print("[" + num[i]+ ", ");
				}
				else if(i==49) {
					System.out.print(num[i] + "]");
				}
				else {
					System.out.print(num[i] + ", ");
				}
				
			}
	}

}
