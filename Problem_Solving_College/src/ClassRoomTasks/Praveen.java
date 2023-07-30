package ClassRoomTasks;

public class Praveen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Praveen p = new Praveen();
		//p.divisor(10,15);
		//p.Least();
		//p.fibonacci();//without third variable
		//p.swap();//with variable
		//p.swapwithout();
		//p.primeornot();
	}

	private void primeornot() {
		// TODO Auto-generated method stub
		int no =10;
		int count=0;
		int div=2;
		int prime =0;
		while(div<=no)
		{
			if(no%div==0)
				System.out.println(div);
		}
		
	}

	private void swapwithout() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		a=a+b;//(10+20)
		b=a-b;//(30-10)
		a=a-b;//(30-10)	
	    System.out.println(a+" "+b);
	}

	private void swap() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=0;
		
	     c=b;
	     b=a;
	     a=c;
	     System.out.println(a+" "+b);
		
	}

	private void fibonacci() {
		// TODO Auto-generated method stub
		int no1 =0;
		int no2 =1;
		while(no1<=5)
		{
			System.out.println(no1);
			no2=no1+no2;
			no1=no2-no1;
			
		}
		
		
	}

	private void Least() {
		// TODO Auto-generated method stub
		int no1 =15;
		int no2 =30;
		int Lcm=0;
		int div=2;
	int max =no1>no2? no1:no2;
	while(div<max)
	{
		if(no1%div==0 && no2%div ==0)
		{
			Lcm=div;
			break;			
		}
		div++;
	}
		System.out.println(Lcm);
			
	}

	private void divisor(int no1,int no2) {
		// TODO Auto-generated method stub
		int div=2;
		int Gcd=0;
		int min =no1<no2? no1:no2;
		while (div<=min)
	{
		if(no1%div==0&&no2%div==0)
		
		{
		Gcd = div;
		}
		div++;
		
	}
	System.out.println(Gcd);
}
}