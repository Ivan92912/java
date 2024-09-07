package dia6;
import java.util.Scanner;
/*
 * Este programa es una calculadora completa de matrices. Tiene implementadas varias funciones. 
 * Funciones implementadas: 
 * -El usuario pueda introducir matrices. HECHO.
 * -Suma de matrices. 0
 * -Resta de matrices.
 * -Producto de un escalar por una matriz.  
 * -Multiplicación de matrices. 
 * -Hallar la transpuesta.
 * -Hallar la matriz en forma escalonada.  
 * -Hallar el determinante de una matriz. 
 * -Hallar la inversa de una matriz. 
 * -Diagonalizar matrices. 
 */
public class Calculadoradematrices {

	public static void main(String[] args) {
		int seleccion; 
		int[][] matrizA=new int [6][6]; 
		int[][] matrizB=new int [6][6];
		int[][] matrizC=new int [6][6]; 
		int[][] matrizD=new int [6][6];
		Scanner a = new Scanner(System.in);
		System.out.println("Introduzca que matriz quiere rellenar: ");
		System.out.println("1. MatrizA		2. MatrizB");
		System.out.println("3. MatrizC		4. MatrizD");
		do{
			seleccion=a.nextInt();
		}while(seleccion<1||seleccion>4); 
		switch(seleccion) {
			case 1: 
				matrizA=rellenarMatrices();
				printMatriz(matrizA);
				break; 
			case 2: 
				matrizB=rellenarMatrices();
				break; 
			case 3: 
				matrizC=rellenarMatrices();
				break; 
			case 4: 
				matrizD=rellenarMatrices();
				break; 
		}
		
		
				
		
	}
	
	public static int[][] rellenarMatrices(){
		//Le pido el numero de filas al usuario.
		Scanner a = new Scanner(System.in);
		System.out.println("¿Número de filas?");
		int b = a.nextInt();
		a.close(); 
				
		//Le pido el número de columnas al usuario.
		Scanner c = new Scanner(System.in);
		System.out.println("¿Número de columnas?");
		int d = c.nextInt();
				
		//Creo la matriz según la dimensión recibida.
		int[][] matriza = new int [b][d];
		//Pedimos los números que componen la matriz
				
		for(int i=0;i<b;i++) {
			for(int j=0;j<d;j++) {
				Scanner e =new Scanner(System.in);
				System.out.println("Introduce el elemento"+(i+1)+" "+ (j+1));
					int f= e.nextInt();
					matriza[i][j]=f;
						}
					}
		return matriza; 
	}
	public static void printMatriz(int[][] a){
		int nFil, nCol;
		nFil=a.length;
		nCol=a[0].length; 
		
		for(int i=0; i<nFil;i++) {
			for(int j=0;j<nCol;j++) {
				if(j==0){System.out.print("|");}
	            System.out.print(a[i][j] + "  ");
	            if(j==nCol-1) {System.out.println("|");}
			}
		}
	
	}
	public static int[][] sumaMatrices(int[][] a, int[][] b ){
		
		int nFila, nCola, nFilb, nColb;
		nFila=a.length;
		nCola=a[0].length;
		nFilb=b.length;
		nColb=b[0].length;
		int[][] c= new int[nFila][nCola];
		//Añadir la excepcion 
		if(nCola!=nColb||nFila!=nFilb) {
			throw new ArithmeticException("No se puede sumar");
		}
			for(int i=0; i<nFila; i++) {
				for(int j=0; i<nCola;i++) {
					c[i][j]=a[i][j]+b[i][j];;
				}
				
			}
		
		
		return c; 
	}
public static int[][] restaMatrices(int[][] a, int[][] b ){
		
		int nFila, nCola, nFilb, nColb;
		nFila=a.length;
		nCola=a[0].length;
		nFilb=b.length;
		nColb=b[0].length;
		int[][] c= new int[nFila][nCola];
		if(nFila!=nFilb || nCola!=nColb) {
			throw new ArithmeticException("No se puede restar");
		}
			for(int i=0; i<nFila; i++) {
				for(int j=0; j<nCola;j++) {
					c[i][j]=a[i][j]-b[i][j];;
				}
				
			}
		return c; 
	}
public static int[][] nxmatriz(int[][] a, int b){
		int  nFila, nCola;
		nFila=a.length;
		nCola=a[0].length;
		int[][] c = new int[nFila][nCola];
			for(int i=0; i<nFila; i++) {
				for(int j=0; j<nCola; j++) {
					c[i][j]=a[i][j]*b;
				}
			}return c;
}
public static int[][] productomatrices(int[][] a, int[][] b){
		int nFila, nColb;
		nFila=a.length;
		nColb=b[0].length;
		int[][] c =new int[nFila][nColb];
		if(nColb!=nFila) {
			throw new ArithmeticException("No se puede multiplicar");
		}
			for(int i=0;i<nFila;i++) {
				for(int j=0;j<nColb;j++) {
					for(int k=0; k<nColb;k++) {
				c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
		return c;
}
public static int[][]transpuesta(int[][] a){
		int nFila, nCola;
		nFila=a.length;
		nCola=a[0].length;
		int[][] c =new int[nFila][nCola];
		for(int i=0;i<nFila;i++) {
			for(int j=0;j<nCola;j++) {
				c[j][i]=a[i][j];
			}
		}return c;
}

}





