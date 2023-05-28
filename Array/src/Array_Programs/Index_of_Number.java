package Array_Programs;

import java.util.Scanner;

public class Index_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 5) Finding index of given number
		Index_of_Number ar = new Index_of_Number();

		ar.Finding_index_of_given_all_number();
//		ar.Finding_index_of_given_number();

	}

	private void Finding_index_of_given_number() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);// Scanner
		int[] arr= {11,22,33,44,55};//
		System.out.println("Enter the Search number : ");
		int key=sc.nextInt();// key= input value
		int result = findnumber( arr,key);// 
		int index=result; //-1

		if(result>=0 ) { // -1>=0,0>=0
			System.out.println(key+" index value is : "+index);

		}
		else {
			System.out.println("not in the array list");
		}
	
	}

	

	private int findnumber(int[] arr, int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) { //0,1,2,3,4
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

	private void Finding_index_of_given_all_number() {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int index=arr[0];
		for(int i=0;i<arr.length;i++) {
			index=i;//
			System.out.println(arr[i]+" has index value is : "+index);
		}
		
		
	}

}
