package For_Loop;

import java.util.Scanner;

public class Strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strong_number sn = new Strong_number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number Value :");

		int num=sc.nextInt();
		int result =sn.FindStrong(num);
		System.out.println("The result of given no :"+result);
		if(num==result) {
			System.out.println("Given number is Strong Number.");
		} else {
			System.out.println("Not a Strong number.");
		}

	}

	private int FindStrong(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		for(;num>0;num/=10) {
			int rem=num%10;
			sum=sum+Factorial(rem);
		}
		return sum;
	}

	private int Factorial(int rem) {
		// TODO Auto-generated method stub
		int mul=1;
		int starting=1;
		for(;starting<=rem;starting++) {
			mul=mul*starting;
		}
		return mul;
	}

}
