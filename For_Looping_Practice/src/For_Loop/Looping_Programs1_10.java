package For_Loop;

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
		for(int no=123;no>0;no/=10) {
			System.out.println(no%10);
		}
		
	}

	private void Prime_Number() {
		// TODO Auto-generated method stub
		
		int div=2,count=0;
		for(int no=10;div<no;div++) {
			if(no%div==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Given number is a prime.");
		}else {
			System.out.println("Given number is not a prime.");
		}
		
	}

	private void Count_of_Divisors_of_given_number() {
		// TODO Auto-generated method stub
		int div=2,count=0;
		for(int no=100;div<no;div++) {
			if(no%div==0) {
				count++;
				System.out.print(div+" ");
			}
			div++;
		}
		System.out.println();
		System.out.println("count of divisors is : "+count);
		
	}

	private void Divisors_of_given_number() {
		// TODO Auto-generated method stub
		int no=100;
		int div=2;
		for(;div<no;div++) {
			if(no%div==0) {
				System.out.print(div+" ");
			}
		}
		
	}

	private void Multiples_of_3_or_5() {
		// TODO Auto-generated method stub
		for(int no=1;no<=20;no++) {
			if(no%3==0 && no%5==0) {
				System.out.print(no+" ");
			}
		}
		
	}

	private void Multiples_of_3_and_5() {
		// TODO Auto-generated method stub
		
		for(int no=1;no<=20;no++) {
			if(no%3==0 || no%5==0) {
				System.out.print(no+" ");
			}
		}
		
	}

	private void print_3_6_9_12_15() {
		// TODO Auto-generated method stub
		for(int i=3;i<=15;i=+3) {
			System.out.println(i+" ");
		}
		
	}

	private void print_13579() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i+=2) {
			System.out.print(i+" ");
		}
		
	}

	private void print_12345() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		
	}

	private void print_11111() {
		for(int i=1;i<=5;i++) {
			System.out.print(1+" ");
		}
		
	}

}
