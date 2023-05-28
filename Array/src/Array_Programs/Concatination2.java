package Array_Programs;

import java.util.Scanner;

public class Concatination2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		21) Concatenation of two integer arrays
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element count : ");
		int c=sc.nextInt();
		int[] arr=new int[c];
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Array elements :");
			int element= sc.nextInt();
			arr[i]=element;
			
		}
		System.out.println();
		System.out.println("Array values");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
			}
	}

}
