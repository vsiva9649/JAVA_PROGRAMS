package PATTERNS;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong a = new Armstrong();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=a.Count_Of_Digits(num);
		int result = a.armstrong(num,count);

	}

//	private int armstrong(int num, int count) {
		// TODO Auto-generated method stub
//		int box=
//		return 0;
	}

	private int Count_Of_Digits(int num) {
		// TODO Auto-generated method stub
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}

}
