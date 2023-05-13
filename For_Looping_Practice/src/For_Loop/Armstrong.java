package For_Loop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Armstrong as = new Armstrong();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		int count =as.CountofDigits(num);
		System.out.println("Count of Digits:"+count);
		int result=as.FindArmstrong(num,count);
		System.out.println("The result of given no is :"+result);
		
		if(num==result) {
			System.out.println("Given number is a Armstrong number.");
		} else {
			System.out.println("Given number is not a Armstrong number.");
		}
		

	}

	private int CountofDigits(int num) {
		// TODO Auto-generated method stub
		int count=0;
		for(;num>0;num/=10) {
			count++;
		}
		return count;
	}

	private int FindArmstrong(int num,int count) {
		// TODO Auto-generated method stub
		int sum=0;
		for(;num>0;num/=10) {
			int rem=num%10;
			sum=sum+Power(rem,count);
		}
		return sum;
	}

	private int Power(int base,int power) {
		// TODO Auto-generated method stub
		int mul=1;
		for(;power>0;power--) {
			mul=mul*base;
		}
		return mul;
	}

	

}
