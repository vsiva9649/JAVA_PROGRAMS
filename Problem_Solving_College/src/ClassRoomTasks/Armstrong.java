package ClassRoomTasks;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong a = new Armstrong();
		Scanner sc = new Scanner(System.in);
		int num=123;
		int count=a.count(num);
		System.out.println("count of number's is:"+count);
		int result=a.armstrong(num,count);//
		System.out.println(result);
		
		
	}
	public int count(int num) {
		int count =0;
		for (int i = 0; i < num; num/=10) {//0<123
//			System.out.println(num%10);//3
			count++;
			
		}
		return count;
	}
	
	public int Find_Power(int base, int power) 
	                       // 3,2,1       3
	{
	int mul=1;
	for(;power>0;power--) {
		mul=mul*base; 
		// 1*3=3,3*3=9,9*3=27
		// 1*2=2,2*2=4,4*2=8
		// 1*1=1,1*1=1,
	}
		return mul;	
	}
	public int armstrong(int num,int count) {
		int sum=0;
		for (int i = 0; i < num; num/=10) {//12
			int rem=num%10;//3,2,1
			sum=sum+Find_Power(rem, count);
			//3->27+2->8,1->1
			
		}
		
		return sum;
	}

}
