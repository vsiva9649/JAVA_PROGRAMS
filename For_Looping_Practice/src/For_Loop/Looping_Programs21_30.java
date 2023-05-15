package For_Loop;

public class Looping_Programs21_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping_Programs21_30 lp = new Looping_Programs21_30();
//		lp.LCM(3,9);// LEAST_COMMON_MULTIPLE :                         
		int power=lp.Find_Power(2,5);//  power of 2 and 5                                               
//		System.out.println(power);
		//lp.Decimal_To_Binary();//    NOT TEACHING                                     
//		lp.Binary_to_Decimal(); //                                                  
//		lp.Fibonacci_Series(); //                                             
//		lp.Swapping_two_numbers(); //                                      
//		lp.Swapping_without_third_variable(); //                             
//		lp.Fibonacci_without_using_third_variable(); //                      
//		lp.Odd_Positions_Even_Positions(); 	//  NOT TEACHING                           
//		lp.First_10_Prime_Numbers(); //    

	}

	private void LCM(int no1,int no2) {
		// TODO Auto-generated method stub
		int big=no1>no2?no1:no2;
		for(;;big++) {
			if(big%no1==0 && big%no2==0) {
				System.out.println("Least_Common_Multiple is : " + big);
				break;
			}
		}
		
	}

	public int Find_Power(int base,int power) {
		// TODO Auto-generated method stub
		int mul=1;
		for(;power>0;power--) {
			mul=mul*base;
		}
		return mul;
		
		
	}

}
