package Array_Pending_Pgm;
/**
 * Write a Program to find repeating element in array?
 * 
1. Program to find first repeated element in an array
2. Program to find first non repeated element in an array
3. Sum of 2 elements in a single array corresponding to 10
4. Divide all the elements in an array by 3 and store it in the same array
5. Multiply any two elements in an array and check if it corresponds to 20
 */
public class Arr_Pending1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arr_Pending1_5 Arr = new Arr_Pending1_5();
		int array[]= {1,5,10,7,8,1};
//		Arr.Repeating(array);
		Arr.Non_Repeated(array);
		

	}

	private void Non_Repeated(int[] array) {
		// TODO Auto-generated method stub
		
	}

	private void Repeating(int[] array) {
		// TODO Auto-generated method stub
		int temp[]= new int[array.length];
		
		for (int i = 0; i < temp.length; i++) {
			if(temp[array[i]]==1) {
				System.out.println(array[i]);
			}
			else {
				temp[array[i]]++;
			}
		}
	}

	

	

}
