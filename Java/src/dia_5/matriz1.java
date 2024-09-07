package dia_5;

public class matriz1 {


	public static void main(String[] args) {
		int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {1, 2, 3, 4}, {5, 6, 7, 8}};
	    for(int i=0; i<4; i++){
	    	for(int j=0; j<4; j++){
	        	if(j==0){System.out.print("|");}
	            System.out.print(myNumbers[i][j] + "  ");
	            if(j==3) {System.out.print("|");}
	        }
	        System.out.println(""); 
	    }
	  }

	}


