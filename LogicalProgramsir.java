package com.learning; 
class LogicalPrograms
{

public static void main(String[] args)
{
LogicalPrograms lp = new LogicalPrograms();
//lp.find_divisors(100);
//lp.find_count_of_divisors(131);
int prime_count = 0; 
int no = 2; 
while(prime_count<10)
{
boolean result = lp.find_Prime(no);
if(result==true)
{
	prime_count=prime_count+1; 
}
no = no +1; 
}
//lp.find_multiples(2);
}
void find_multiples(int no1)
{
int no2 = 1; 
while(no2<=5)
{
System.out.println(no2 + " * 2 = "+ (no2 * no1));
no2 = no2 +1; 
}

}

boolean find_Prime(int no) //no=131
{
int div = 2; 
int count = 0; 
while(div<no)
{
    if(no%div == 0)
    {
//System.out.println(no +" is Not Prime Number");
    count = count + 1; 
    break;
    }
    div = div +1; 
 }
//System.out.println("No. of divisors is "+ count);
if(count==0)
    {
        System.out.println(no+ " is Prime Number");
        return true; 
    }
return false; 
}
void find_count_of_divisors(int no)
{
int div = 2; 
int count = 0; 
while(div<no)
{
    if(no%div == 0)
    {
    System.out.println(div);
    count = count + 1; 
    }
    div = div +1; 
 }
System.out.println("No. of divisors is "+ count);
}


void find_divisors(int no)
{
int div = 2; 
while(div<no)
{
    if(no%div == 0)
    {
    System.out.println(div);
    }
    div = div +1; 
    }
}

}
