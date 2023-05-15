package Array_Programs;

import java.util.Scanner;

public class Array_Reverse_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3) Printing in reverse order
		
		
		int[] arr=new int [] {1,2,3,4,5};
		System.out.println("Original Array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");

		}
		System.out.println();
		System.out.println("Array in Reverse Order : ");
		for(int j=arr.length-1;j>=0;j--) {
			System.out.print(arr[j]+" ");
		}
		

	}

}
