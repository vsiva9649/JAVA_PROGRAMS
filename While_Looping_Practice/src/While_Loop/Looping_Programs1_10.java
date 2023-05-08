package While_Loop;

public class Looping_Programs1_10 {

	public static void main(String[] args) {
		Looping_Programs1_10 lp = new Looping_Programs1_10();
//		lp.print_11111();
//		lp.print_12345();
//		lp.print_13579();
//		lp.print_3_6_9_12_15();
//		lp.Multiples_of_3_and_5();
//		lp.Multiples_of_3_or_5();                                      
//		lp.Divisors_of_given_number();                            
//		lp.Count_of_Divisors_of_given_number();                         
//		lp.Prime_Number();                                              
		lp.Reverse_Printing_a_number(); 

	}

	private void Reverse_Printing_a_number() {
		// TODO Auto-generated method stub
		int no=1234;
		while(no>0) {
			int rem=no%10;
			System.out.print(rem);
			no=no/10;
		}
	}

	private void Prime_Number() {
		// TODO Auto-generated method stub
		int no=15;
		int div=2;
		int count =0;
		while(div<no) {
			if(no%div==0) {
				count++;
			}
			div++;
		}
		if(count==0) {
			System.out.println("Given number is prime number.");
		}else {
			System.out.println("Given number is not a prime number.");
		}
	}

	private void Count_of_Divisors_of_given_number() {
		// TODO Auto-generated method stub
		int no=100;
		int div=2;
		int count=0;
		while(div<no) {
			if(no%div==0) {
				System.out.print(div+" ");
				count++;
			}
			div++;
		}
		System.out.println();
		System.out.println("Count of divisors of given number : "+count);
		
	}

	private void Divisors_of_given_number() {
		// TODO Auto-generated method stub
		int no=100;
		int div=2;
		while(div<=no) {
			if(no%div==0) {
				System.out.println(div);
			}
			div++;
		}
		
		
	}

	private void Multiples_of_3_or_5() {
		// TODO Auto-generated method stub
		int no=2;
		while(no<=20) {
			if(no%3==0 && no%5==0) {
				System.out.println(no);
			}
			no++;
		}
		
	}

	private void Multiples_of_3_and_5() {
		// TODO Auto-generated method stub
		int no=2;
		while(no<=20) {
			if(no%3==0 || no%5==0) {
				System.out.println(no);	
			}
			no++;
		}
	}

	private void print_3_6_9_12_15() {
		int no=3;
		while(no<=15) {
			System.out.print(no+" ");
			no+=3;
		}
		
		
	}

	private void print_13579() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=10) {
			System.out.print(no+" ");
			no+=2;
		}
		
		
	}

	private void print_12345() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=5) {
			System.out.print(no+" ");
			no++;
		}
		
		
	}

	private void print_11111() {
		int no=1;
		while(no<=5) {
			System.out.print(1+" ");
			no++;
		}
		
	}

}
