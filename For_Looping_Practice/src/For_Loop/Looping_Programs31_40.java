package For_Loop;

public class Looping_Programs31_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Looping_Programs31_40 lp = new Looping_Programs31_40();
//		lp.Sum_of_Digits_until_it_becomes_single_digit(155); //                 
//		lp.print_Fact_54321();//Printing_5!_4!_3!_2!_1!(); //                                    
//		lp.multiples(1,10);//Printing_1*10_2*9_3*8_4*7_5*6(); //                             
//		lp.Printing_1_11_121(); //                                           
//		lp.Printing_1_8_27_64(); //                                         
//		lp.Printing_1_4_9_16_25_36_49_64_81_100(); // - HW                   
//		lp.Printing_1_4_27_256(); //                                         
//		lp.Square_Root_of_a_Number(); //                                     
//		lp.Spy_Number(); // - HW                                      
//		lp.Prime_no_in_a_fibonacci_series();  //

	}

	private void Printing_1_11_121() {
		// TODO Auto-generated method stub
	}

	private void multiples(int no1, int no2) {
		// TODO Auto-generated method stub
		for(;no1<=5;no1++,no2--) {
			int mul=(no1*no2);
			System.out.println(mul);
		}
		
		
	}

	private void print_Fact_54321() {
		// TODO Auto-generated method stub
		int fact=1;
		for(int no=5;no>=1;no--) {
			fact=fact*no;
			
		}
		System.out.println(fact);
	}

	private void Sum_of_Digits_until_it_becomes_single_digit(int no) {
		// TODO Auto-generated method stub
		int sum =0;
		for(;no>0;no/=10) {
			sum=sum+(no%10);
		}
//		System.out.println(sum);
		if(sum>9) {
		Sum_of_Digits_until_it_becomes_single_digit(sum); // 
		}
		else {
			System.out.println(sum);
		}
	}

}
