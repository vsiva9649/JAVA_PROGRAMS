package com.learning;

public class looping_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		looping_Demo2 ld = new looping_Demo2();
//		ld.print_fibo();
		ld.Print_fibo_without_third();
		
		

	}

	private void Print_fibo_without_third() {
		// TODO Auto-generated method stub
		int p1=0,p2=1;
		while(p1<=21)
		{
			System.out.print(p1+" ");
			p2 = p1+p2;
			p1=p2-p1;
		}
	}

	private void print_fibo() {
		// TODO Auto-generated method stub
		int p1 =0,p2=1;
		while(p1<=8) {
			System.out.println(p1+" ");
			int p3 = p1+p2;
		      p1=p2;
		      p2=p3;
		}
	}

}
