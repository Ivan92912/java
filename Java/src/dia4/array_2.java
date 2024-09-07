package dia4;

public class array_2 {

	public static void main(String[] args) {
		int[] num= {1, 23,32,-21,12,-1,2,-23,9, 10};
		int a=num[0];
		for(int i=1; i<=9; i++) {
			if(num[i]<a) {
				a=num[i];
			}
		}
		System.out.println(num[3]);
	}

}
