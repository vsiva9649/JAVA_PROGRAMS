package oops_learning;

public class Gpay {
	Gpay(){ // non 
		System.out.println("hello");
	}
	Gpay(int no){ // prameter
		System.out.println("hello");
	}
	
	public  Gpay(int no, int no1) {
		// TODO Auto-generated constructor stub
		
	}
	public  Gpay(int no, double no1) {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void main(String [] args) {
		int no=2;
		double no1=4;
		Gpay g= new Gpay();
		Gpay g1 = new Gpay(no);//4 -> 7
		Gpay g2 = new Gpay(no,no1);// 11

		
	}
	
}
