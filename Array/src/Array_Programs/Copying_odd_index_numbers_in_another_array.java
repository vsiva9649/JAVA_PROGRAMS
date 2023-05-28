package Array_Programs;

public class Copying_odd_index_numbers_in_another_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		24) Copying only the odd indexed numbers in given array - to another array
		
		int[] a= {11,22,33,44,55,66};//0 1 2 3 4 5
		int oddindex=a.length/2; //6/2=3
		int[] b=new int[oddindex];//3
		int j=0;
		for(int i=1;i<a.length;i+=2) { //1<6 1+2=3<6 5<6 
			b[j]=a[i];//b[0] =22,b[1]=44,b[2]=66
			j++;
		}
		System.out.println("Printing Odd index");
		for(int k=0;k<b.length;k++) {
			System.out.print(b[k]+" ");
		}
		
	}

}
