package EXCEPTION;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionDemo ed = new ExceptionDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers: ");
	    int no1 = sc.nextInt();
	    int no2 = sc.nextInt(); 
		ed.divide(no1,no2);
		ed.subtract(no1,no2);

	}

	private void subtract(int no1, int no2) {
		// TODO Auto-generated method stub
	    System.out.println(no1-no2);
		
	}

	private void divide(int no1, int no2) {
		// TODO Auto-generated method stub
		try {
		      System.out.println(no1/no2);
		    }
		    catch(ArithmeticException p)
		    {
		      System.out.println("Check no2");
		      p.printStackTrace();
		    }	
		catch (Exception e) {
			System.out.println(" Something went wrong");
		}
	}

}
