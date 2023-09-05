package Sir_Task;

public class Ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques q = new Ques();
//		q.Question8();
//		q.Question9();
//		q.Question10();
//		q.Question11();
		q.Question12();
//		q.Question13();
//		q.Question14();
//		q.Question15();
		q.Question16();
		// Pending
//		q.Question17();

	}

	private void Question17() {
		/*Perfect no.		 
Let's take the number 28 and check it is a perfect number or not.
First, we find the factors of 28 i.e. 1, 2, 4, 7, 14. 
Let's find the sum of factors (1 + 2 + 4 + 7 + 14 = 28). 
We observe that the sum of factors is equal to the number itself. 
Hence, the number 28 is a perfect number.
		 */
		long n=28,sum=0;
		int i=1;
		while(i<=n/2) {
			if(n%i==0) { //28%2==0,28%4,28%7
				sum=sum+i;
			}
			i++;
		}
		if(sum==n) {
			System.out.println(n+" The given number is perfect number.");
		}
		else {
			System.out.println(n+" This number is not a perfect number.");
		}
		
	}

	private void Question16() {
		// Print 5! 4! 3! 2! 1!
		int no=5;
		while(no>=1) {
		int num=1,mul=1;
		
		for(;num<=no;num++) {
			mul=mul*num;
		}
		System.out.println(no+"! is = "+mul);
		no--;
		}
		
	}

	private void Question15() {
		// 2 power 2, 2 power 3, 2 power 4 
		int no=2,power=2;
		for (; power <=4; power++) {
			System.out.println((int)Math.pow(no, power));
		}
		
	}

	private void Question14() {
		// Print divisors of 100 only if they are Prime number
		int num=100,i=1,div;
		while(i<=num/2) {
			if(num%i==0) {
				if(CheckPrime(i)) {
				System.out.println(i+" is prime number.");
				}
				else {
//					System.out.println(i+" is not a prime.");
				}
			}
			i++;
		}
	}

	private boolean CheckPrime(int n) {
		// TODO Auto-generated method stub
		if(n<=1) {
			return false;
		}
		for (int i = 2; i <=Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	private void Question13() {
		// Fibonacci between 5 and 80
		int n1=0,n2=1,n3;//  
        while (n1 + n2 <= 80) {
            n3 = n1 + n2;
            if (n3 >= 5) {
                System.out.print(n3 + " ");
            }
            n1 = n2;
            n2 = n3;
        }
		  

		
	}

	private void Question12() {
// GCD and Smallest Common Divisor in Single loop  
		GCD(12,15);
		LCM(3,9);
		
	}

	private void LCM(int no1, int no2) {
		// TODO Auto-generated method stub
		int big=no1>no2?no1:no2;
		for(;;big++) {
			if(big%no1==0 && big%no2==0) {
				System.out.println("Least_Common_Multiple is : " + big);
				break;
			}
		}
	}

	private void GCD(int no1, int no2) {
		// TODO Auto-generated method stub
		int div=2,gcd=0;
		int small = no1<no2?no1:no2;
		for(;div<small;div++) {
			if (no1%div==0 && no2%div==0) {
				gcd=div;
			}
		}
		System.out.println("Greatest_common_Divisor is : "+gcd);
	
	}

	private void Question11() {
// print 1 11 111 1111
// print 5 10 15 20 25
// print 4 8 12 16 20 in Single loop
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		int no1=1,no2=5,no3=4;
		for (; no2 <=25; no2+=5) {
			
			System.out.print(no2+" ");
		}
		System.out.println();
		System.out.println();
		for (; no3 <=20; no3+=4) {
			System.out.print(no3+" ");
		}
		
	}

	private void Question10() {
// Confirm if the given number maintains ascending order in its digits
// eg: 1234 => 1<2<3<4		
		int no=321 ;
		if(isAssendingOrder(no)) {
			System.out.print(no+" ");
			System.out.println("Number is maintaing assending order");
		}
		else {
			System.out.print(no+" ");
			System.out.println("The number is not maintaing assending order.");
		}
		
	}

	private boolean isAssendingOrder(int num) {
		// TODO Auto-generated method stub
		int high=9;
		while(num>0)
		{
			int digit=num%10;//5
			if(digit>high) { //5>9
				return false;
			}
			high=digit; // high=5
			num/=10;
		}
		return true;
	}

	private void Question9() {
	// Print numbers which have 5 in them between 1 and 100.
//eg: 5,15,25,35,45,50,51,52,53,54,55,56,57,58,59,65,75,85,95 
		for (int no = 1; no <= 100; no++) {
			if(ContainsFive(no)) {
				System.out.println(no);
			}
		}
		
		
	}

	private boolean ContainsFive(int num) {
		// TODO Auto-generated method stub
		while(num>0) {
			int digit=num%10;
			if (digit==5) {
				return true;
			}
			num/=10;
		}
		return false;
	}

	private void Question8() {
		// Print 5 power4, 4 power 3,3 power 2.
		int no=5;
		int power=no-1;
		for (; no >=3; no--,power--) {
			System.out.println(no+"power"+power+" : "+(int)Math.pow(no, power));
		}
		
		
	}

}
