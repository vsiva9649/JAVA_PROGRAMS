package com.learning;

public class Armstrong {

	public static void main(String[] args) {
		int num = 1634;
		System.out.println("input number is : "+num);
		Armstrong ap = new Armstrong();
		int count=ap.count_of_digits(1634);
		System.out.println("count of digits is : "+count);
		int result = ap.find_armstrong(num,count);
		System.out.println("sum value is : "+result);
		if (num==result)
		{
			System.out.println("Given number is Armstrong number.");
		}
		else {
			System.out.println("Given number is not a Armstrong number.");
		}

	}

	private int find_armstrong(int num, int count) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(num > 0) {
			int rem = num % 10;
			sum = sum +find_power_of_numbers(rem,count);
			num = num/10;
		}
		return sum;
		
		
	}

	private int find_power_of_numbers(int base, int power) {
		// TODO Auto-generated method stub
		int box =1;
		while(power>0) {
			box = box *base;
			
			power--;
		}
//		System.out.println(box);
		return box;
	}

	private int count_of_digits(int num) {
		int count=0;
		while (num>0) {
			count++;
			num=num/10;
		}
		return count;
	}


}
