package com.learning;

public class Strong
 {
public static void main(String[] args)
 {
int num=145;
Strong sp=new Strong();   //object

int result=sp.find_strong_no(num);//method call

System.out.println("The result of finding no:"+result); //just print the result

	if(num==result)
System.out.println("The given number is Strong Number");
	else
System.out.println("Not Strong Number");
	}

int find_strong_no(int no)//Method 
	{
int sum=0;
while(no>0)
{
int rem=no%10; //5 is remaining
sum=sum+factorial(rem);//0+ factorialof (1*2*3*4*5)
no=no/10;	
}	
return sum;
}
int factorial(int fac)//5 is input
	{
	int box=1; //initializing variables
	int number=1;
	while(number<=fac) //1<=5
	{
		box=box*number;
		number++;
}
return box;
}
}