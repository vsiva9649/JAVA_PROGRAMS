package For_Loop;

public class Looping_Programs11_20 {
	public static void main(String[] args) {
		Looping_Programs11_20 lp = new Looping_Programs11_20();
//		lp.Count_of_Digits(123456);
//		lp.Sum_of_Digits(12345);                                               
		lp.Reverse_the_number(1234);//                                          
//		lp.Palindrome(121);//                                                 
//		lp.Armstrong_Number(153);//                                               
//		lp.Neon_Number(9);//                                           
//		lp.Strong_Number(); //                                          
//		lp.Addition_of_first_n_numbers(); //                              
//		lp.Factorial(4); //                                                  
//		lp.Greatest_Common_Divisor(); //
	}

	private void Factorial(int fact) {
		// TODO Auto-generated method stub
		int num=1;
		int mul=1;
		for(;num<=fact;num++) {
			mul=mul*num;
		}
		System.out.println(mul);
		
		
	}

	private void Neon_Number(int no) {
		// TODO Auto-generated method stub
		int sum=0;
		int sqr=no*no;
		for(;sqr>0;sqr/=10) {
			sum=sum+(sqr%10);
		}
		if(sum==no) {
			System.out.println("Given number is neon number.");
		}
		else {
			System.out.println("Given number is not a neon number.");
		}
		
	}

	private void Armstrong_Number(int no) {
		// TODO Auto-generated method stub
		int no2=no;
		int arm=0;
		for(;no>0;no/=10) {
			int rem=no%10;
			arm=arm+(rem*rem*rem);
		}
		if(arm==no2) {
			System.out.println("Given number is Armstrong.");
		}else {
			System.out.println("Given number is not a Armstrong.");
		}
	
	}

	private void Palindrome(int i) {
		// TODO Auto-generated method stub
		int no=i;
		int rem=0;
		for(;i>0;i/=10) {
			rem=(rem*10)+(i%10);
			
		}
		if(rem==no) {
			System.out.println("Given num is a Palindrome.");
		}else {
			System.out.println("Given num is not a Palindrome.");
		}
		
	}

	private void Reverse_the_number(int i) {
		// TODO Auto-generated method stub
		int rev=0;
		for(;i>0;i/=10) {
			int rem=i%10;
			rev=(rev*10)+rem;
		}
		System.out.println(rev);
		
	}

	private void Sum_of_Digits(int no) {
		// TODO Auto-generated method stub
		int sum=0;
		for(;no>0;no/=10) {
			sum=sum+(no%10);
		}
		System.out.println("Sum of Digits : "+sum);
		
	}

	private void Count_of_Digits(int no) {
		// TODO Auto-generated method stub
		int count =0;
		for(;no>0;no/=10) {
			count++;
		}
		System.out.println(count);
	}
    
}
