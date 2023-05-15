package Array_Programs;

public class Array_Declaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/**
 * 1) Array Declaration :
 * 
 * int[] marks = {10,20,30};
 * int[] marks = new int[3];



 */
		
//		2) Printing Array
		
		Array_Declaration ad = new Array_Declaration();
		ad.Printing_Array();
		
		

	}

	private void Printing_Array() {
		// TODO Auto-generated method stub
		
		int[] Siva = {100,75,79,100,84,100};
		for(int i=0;i<Siva.length;i++) {
			System.out.println(Siva[i]);
		}
		
	}

}
