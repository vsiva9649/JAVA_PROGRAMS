package TeamTask;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Jewellery_chitfund {

	public static void main(String[] args) {
		Jewellery_chitfund jc=new Jewellery_chitfund();
		jc.method1();
	}

	private void method1() {
		LocalDate date = LocalDate.now();
	    System.out.println("Current Date: "+date);
	    System.out.println("Month: "+ date.getMonth());
		System.out.println("Welcome to GRT Jewellery");
		System.out.println("        GST for Gold : 3%");
		
		System.out.println("***********************");
		System.out.println("Are you coming for purchase or Paying-chitfund?");
		System.out.println("Type - Purchase or Chitfund");
		Scanner sc=new Scanner(System.in);
		String opinion=sc.next();
		if(opinion.equalsIgnoreCase("purchase"))
		{
			System.out.println("current gold rate");			
			int current_grate=sc.nextInt();
			for(int i=0;i<5;i++)
			{
			 System.out.println("Welcome to purchase: Choose options ");
			 System.out.println(" 1.Ring\n 2.Haram\n 3.Jimiki\n 4.Chain");
			 int op=sc.nextInt();
			 if(op==1)
			 {
				 int cash=current_grate*11;
				 System.out.println("Holding amount: "+ cash+"Rs" );
				 int gramc=cash/current_grate;
				 System.out.println("Gram is for your cash "+gramc);
				 System.out.println("Wastage for Ring 8%");
				 int wastage=cash*8/100;
				 int gst=cash*3/100;
				 int tota=wastage+gst;
				 System.out.println("Your paying amount is "+cash + " Gst+wastage = "+tota);
				 System.out.println("Total amount for Ring purchase: "+ (cash+tota));
				 System.out.println("-----------------------------------------------");
				 		
				 
			 }
			 else if(op==2)
			 {
				 int cash=current_grate*11;
				 System.out.println("Holding amount: "+ cash );
				 int gramc=cash/current_grate;
				 System.out.println("Gram is for your cash "+gramc);
				 System.out.println("Wastage for Haram 12%");
				 int wastage=cash*12/100;
				 int gst=cash*3/100;
				 int tota=wastage+gst;
				 System.out.println("Your paying amount is "+cash + " Gst+wastage "+tota);
				 System.out.println("Total amount for Haram purchase: "+ (cash+tota));
				 System.out.println("-----------------------------------------------");
				 
			 }
			 else if(op==3)
			 {
				 int cash=current_grate*11;
				 System.out.println("Holding amount: "+ cash );
				 int gramc=cash/current_grate;
				 System.out.println("Gram is for your cash "+gramc);
				 System.out.println("Wastage for Jimiki 10%");
				 int wastage=cash*10/100;
				 int gst=cash*3/100;
				 int tota=wastage+gst;
				 System.out.println("Your paying amount is "+cash + " Gst+wastage "+tota);
				 System.out.println("Total amount for Jimiki purchase: "+ (cash+tota));
				 System.out.println("-----------------------------------------------");
				 
			 }
			 else if(op==4)
			 {
				 int cash=current_grate*11;
				 System.out.println(" Customer Holding amount: "+ cash );
				 int gramc=cash/current_grate;
				 System.out.println("Gram is for your cash: "+gramc);
				 System.out.println("wastage for Chain: 6%");
				 int wastage=cash*6/100;
				 int gst=cash*3/100;
				 int tota=wastage+gst;
				 System.out.println("Your paying amount is "+cash + " Gst+wastage "+tota);
				 System.out.println("Total amount for Chain purchase: "+ (cash+tota));
				 System.out.println("-----------------------------------------------");
			 }
			 else
			 {
				 //i=1;
				 System.out.println("Enter correct option: you are exited");
				 break;
			 }
			
			}
			
		}
		else if(opinion.equalsIgnoreCase("chitfund"))
		{
			System.out.println("Chitfund for customers: 11 Month");
			//.out.println("Pay Monthly amount");
			int total =0;
	          int[] c=new int[11];
			for(int i=0;i<c.length;i++)
			{
				System.out.println("Pay Monthly amount for current Gold rate");
				c[i]=sc.nextInt();
				total=total+c[i];
				
			}
			System.out.println("11 month chitfund total amount is "+ total);
			System.out.println("Customer coming for purchase");
			System.out.println("Enter today's gold rate");			
			int c_rate=sc.nextInt();
		
		
		 //int i=0;
		 while(true)
		 {
		 System.out.println("Welcome to purchase: Choose options ");
		 System.out.println(" 1.Ring\n 2.Haram\n 3.Jimiki\n 4.Chain");
		 
		 int option=sc.nextInt();
		 switch(option)
		 {
		 case 1:
			 int gramcount=total/c_rate;
			 System.out.println("Total gram for chitfund "+gramcount);
			 int GST=total*3/100;
			 System.out.println("Gst for Ring " +GST);
			 System.out.println("No Wastage for chitfund customers");
			 System.out.println("Finaly paid amount only "+GST);
			 
			 break;
		 case 2:
			 int gram1=total/c_rate;
			 System.out.println("Total gram for chitfund "+gram1);
			 int GST1=total*3/100;
			 System.out.println("Gst for Haram " +GST1);
			 System.out.println("No Wastage for chitfund customers");
			 System.out.println("Finaly paid amount only "+GST1);
			 
			 break;
		 case 3:
			 int gram2=total/c_rate;
			 System.out.println("Total gram for chitfund "+gram2);
			 int GST2=total*3/100;
			 System.out.println("Gst for Jimiki " +GST2);
			 System.out.println("No Wastage for chitfund customers");
			 System.out.println("Finaly paid amount only "+GST2);
			 
			 break;
		 case 4:
			 int gram3=total/c_rate;
			 System.out.println("Total gram for chitfund "+gram3);
			 int GST3=total*3/100;
			 System.out.println("Gst for Chain " +GST3);
			 System.out.println("No Wastage for chitfund customers");
			 System.out.println("Finaly paid amount only "+GST3);
			 
			 break;
			 
			 default:
				 System.out.println("Thank you");
				 break;
			 
		 }
			
		
		 }
		 
		 
		}
		
		
			
		
		
	}

}