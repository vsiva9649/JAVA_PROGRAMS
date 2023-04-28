package com.learning;

public class Apr_25_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apr_25_2023 lp = new Apr_25_2023();
//		lp.find_divisors();
//		lp.find_common_divisors();
//	lp.find_GCD(12,15); // smallnumber
//		lp.find_multiple();
//		lp.find_common_multiple(3,9);
		lp.find_common_multiple2(4,10);
		
		

	}

	private void find_common_multiple2(int no1, int no2) {
		// TODO Auto-generated method stub
		int big=no1>no2?no1:no2;
		while(true) {
		if(big%no1==0 && big%no2==0) {
			System.out.println(big);
			break;
		}
		big++;
		}
	}

	private void find_common_multiple(int no1,int no2) {
		// TODO Auto-generated method stub
		int big= no1>no2?no1:no2;
		if(big%no1==0 && big%no2 ==0) {
			System.out.println(big);
		}
		
	}

	private void find_multiple() {
		// TODO Auto-generated method stub
		int no1=3;
		int no2=1;
		while(no2<=5) {
			System.out.println(no2*no1);
			no2++;
		}
		
	}

	private void find_GCD(int no1,int no2) {
		// TODO Auto-generated method stub
		int div=2;
		int gcd = 0;
		int small = no1<no2?no1:no2;
		while(div<small) {
			if(no1%div==0&&no2%div==0){
				gcd=div;
			}
			div++;
		}
		System.out.println("GCD is:"+gcd);
		
		
	}

	private void find_common_divisors() {
		// TODO Auto-generated method stub
		int no1=50;
		int no2=100;
		int div =2;
		while(div<no1) {
		if(no1%div==0 && no2%div==0) {
			System.out.println(div);
		
		}
		div++;
		}
		
	}

	private void find_divisors() {
		// TODO Auto-generated method stub
		int no  =100;
		int div = 2;
		while (div<no) {
			if(no%div == 0) {
				System.out.println(div);
			}
			div++;
		}
	}
	

}
