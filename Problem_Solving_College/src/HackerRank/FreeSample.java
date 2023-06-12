package HackerRank;

import java.util.Scanner;

public class FreeSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		int n = sc.nextInt();
		 for( int i=1; i<=n ; i++)
	        {
	            if(i%3==0 && i%5==0)
	                {
	                System.out.println("FizzBuss");
	                continue;
	                 }

	            if(i%3==0)
	                {
	                System.out.println("Fizz");
	                continue;
	                 }
	             if(i%5==0)
	                {
	                System.out.println("Buss");
	                continue;
	                 }
	            System.out.println(i);
	               
	      }

	}

}
