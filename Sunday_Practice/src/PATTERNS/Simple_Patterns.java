package PATTERNS;

import java.util.Scanner;

public class Simple_Patterns {
	/*
	 * 
                                                OK
15) Armstrong Number                                            OK
16) Neon Number - HW                                            OK
17) Strong Number - HW                                          OK
20) Greatest Common Divisor                                     OK
21) Least Common Multiples      
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple_Patterns s = new Simple_Patterns();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number value : ");
		int num=sc.nextInt();
		sc.close();
//		s.Count_of_Digits(num);//11
//		s.Sum_of_Digits(num);//12
//		s.Reverse_the_number(num);//13
//		s.Palidrome(num);//14
//		s.Addition_of_first_n_number(num);//18
		s.Factorial();//19
		

	}

	private void Factorial() {
		// TODO Auto-generated method stub
		
	}

	private void Addition_of_first_n_number(int count) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int no=1;no<=count;no++) {
			sum=sum+no;
		}
		System.out.println("Sum of digits : "+sum);
}

	private void Palidrome(int num) {
		// TODO Auto-generated method stub
		int no=num;
		int rem=0;
		for(int i=num;i>0;i/=10) {
			 rem=(rem*10)+(i%10);
			
		}
		System.out.println(rem);

		
		if(rem==no) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a plaindrome");
		}
		
		
		
	}

	private void Reverse_the_number(int num) {
		// TODO Auto-generated method stub
		int rev=0;
		for(int i=num;i>0;i/=10) {
			int rem=i%10;
			System.out.print(rem);
		}
		
		
	}

	private void Sum_of_Digits(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num>0) {
			sum=sum+(num%10);
			num/=10;
		}
		System.out.println("Sum of digits : "+sum);
		
	}

	private void Count_of_Digits(int num) {
		// TODO Auto-generated method stub
//		int no=num;
//		System.out.println(no);
		int count =0;
		while(num>0) {
			count++;
			num/=10;
		}
		System.out.println("count of digits :"+count);
		
		
		
	}

}
