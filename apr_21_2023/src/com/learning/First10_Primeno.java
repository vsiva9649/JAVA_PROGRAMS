package com.learning;

public class First10_Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		while(count<=10)
		{
			int no = 3;
			int div = 2;
			boolean prime = true;
			while(div<no)
			{
				if(no%div==0)
				{
					System.out.println("not a prime");
					prime = false;
				}
				div++;
				
			}
			if(prime==true)
			{
				System.out.println(no+"it is prime");
				count++;
			}
			no+=2;
		}
	}

}
