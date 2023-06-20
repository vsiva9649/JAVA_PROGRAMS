package CraditCard;

import java.util.Scanner;

public class CraditCard1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of numbers : ");
		String  n = sc.nextLine();
		// convert string to int
		int[] cardno=new int[n.length()];
		for (int i = 0; i < n.length(); i++) {
			cardno[i]=Integer.parseInt(n.substring(i, i+1));	
		}
		// Starting from the right, double each other digit,
		// if greater then 9 mod 10 and 

	}

}
