package TeamTask;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class EB_bill {

	public static void main(String[] args) {
		EB_bill eb=new EB_bill();
		eb.method1();
		

	}

	private void method1() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("EB Bill Calculation");
		LocalDate date = LocalDate.now();
		System.out.println("Current Date: "+date);
	    System.out.println("Month: "+ date.getMonth());
		System.out.println("***********************************");
		System.out.println();
		for(int j=0;j<6;j++)
		{
			System.out.println("Options");
		System.out.println(" 1.Person-in_home\n 2.Door-locked\n 3.Meter-not-working\n 4.Cash-Depoist\n 5.Exit\n");
		System.out.println("Press the number for your options");
		
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter your previous month reading");
			int previous_reading=sc.nextInt();
			System.out.println("Enter your current month reading");
			int current_reading=sc.nextInt();
			
			int reading=current_reading-previous_reading;
			System.out.println("This month reading "+reading+" Units");
		    System.out.println("Enter free unit ");
			int freeunit=sc.nextInt();
			int payable=reading-freeunit;
			float per_unitvalue=2.5f;
			System.out.println("Reading "+payable+" Units "+" per_unit_amount "+per_unitvalue+" Rs");
			
			float payable_amount= payable*per_unitvalue;
			System.out.println("Amount have to paid for this month "+payable_amount+" Rs");
			System.out.println("--------------------------------------");
			break;
		case 2:
			System.out.println("Enter your previous month EB-bill amount");
			int prebill=sc.nextInt();
			System.out.println("Your payable amount for this month: "+prebill+"Rs");
			System.out.println("--------------------------------------");
			break;
			
		case 3:
			System.out.println("Enter your last 2 month bill-amount");
			int fmonth=sc.nextInt();
			int smonth=sc.nextInt();
			int payable_amount1=fmonth+smonth;
			System.out.println("Your payable amount is "+payable_amount1+" Rs");
			System.out.println("--------------------------------------");
			
			break;
		case 4:
			System.out.println("Enter your past 6 month paid amount");
			int[] cc=new int[6];
			int total=0;
			for(int i=0;i<cc.length;i++)
			{
				cc[i]=sc.nextInt();
				total=total+cc[i];
			}
			System.out.println("Total Eb-bill amount for last year "+total+" Rs");
			int value=total/12;
			int deposit_value=value*3;
			System.out.println("Your deposit value for this year "+deposit_value+" Rs");
			System.out.println("--------------------------------------");
			break;
		case 5:
		       
			System.out.println("You are exited");
			System.out.println("Thank you!");
			j=6;
			    break;
		
		}
		
		
		
		}
	}

}