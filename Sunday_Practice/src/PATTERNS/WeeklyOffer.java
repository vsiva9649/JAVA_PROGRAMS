package PATTERNS;

import java.util.*;

public class WeeklyOffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		    System.out.println("enter to day: ");
		    String sc = sc.nextLine();
		    String sc1 = "Wednesday";
		    if(sc.equals(sc1))
		    {
		      System.out.println("For Ac : press 1 ");
		      System.out.println("For Tv: press 2 ");
		      System.out.println("For Laptop : press 3 ");
		      System.out.println("For Fridge : press 4 ");
		      System.out.println("For Washing Machine : press 4 ");
		      int operation = sc.nextInt();
		      switch (operation)
		      {
		      case 1:
		        int Actual_prize = 32000;
		        System.out.println("Your Actual Prize is :  " + Actual_prize );
		        int Total = Actual_prize;
		        System.out.println("Your Total prize is : " + Total );
		          break;
		      case 2:
		        int Actual = 30000;
		        int discount = Actual/10;
		        System.out.println("Your Actual Prize is : " + Actual);
		        System.out.println(" Today save : " + discount);
		        int act= Actual-discount;
		        System.out.println("Your Final Prize is : " + act);
		        
		           break;
		      case 3:
		        int Actual_prize1 = 40000;
		        System.out.println("Your Actual Prize is :  " + Actual_prize1);
		        int Total1 = Actual_prize1;
		        System.out.println("Your Total prize is : " + Total1 );
		        
		          break;
		          
		      case 4:    
		        int Actual_prize2 = 18000;
		        System.out.println("Your Actual Prize is :  " + Actual_prize2);
		        int Total2 = Actual_prize2;
		        System.out.println("Your Total prize is : " + Total2 );
		          break;
		          
		      case 5:
		        int Actual_prize3 = 25000;
		        System.out.println("Your Actual Prize is :  " + Actual_prize3);
		        int Total3 = Actual_prize3;
		        System.out.println("Your Total prize is : " + Total3 );
		           break;
		      }
		    }
		    else
		    {
		    
		      System.out.println("For Ac : press 1 ");
		      System.out.println("For Tv: press 2 ");
		      System.out.println("For Laptop : press 3 ");
		      System.out.println("For Fridge : press 4 ");
		      System.out.println("For Washing Machine : press 4 ");
		      int operation = sc.nextInt();
		switch (operation)
		      {
		      case 1:
		        int Actual_prize = 32000;
		        System.out.println("Your Actual Prize is :  " + Actual_prize );
		        int Total = Actual_prize;
		        System.out.println("Your Total prize is : " + Total );
		          break;
		      case 2:
		        int Actual_prize0 = 30000;
		        System.out.println("Your Actual Prize is :  " + Actual_prize0 );
		        int Total0 = Actual_prize0;
		        System.out.println("Your Total prize is : " + Total0 );
		        
		           break;
		      case 3:
		        int Actual_prize1 = 40000;
		        System.out.println("Your Actual Prize is :  " + Actual_prize1);
		        int Total1 = Actual_prize1;
		        System.out.println("Your Total prize is : " + Total1 );
		        
		          break;
		          
		      case 4:    
		        int Actual_prize2 = 18000;
		        System.out.println("Your Actual Prize is :  " + Actual_prize2);
		        int Total2 = Actual_prize2;
System.out.println("Your Total prize is : " + Total2 );
		break;
             case 5:
			int Actual_prize3 = 25000;
		System.out.println("Your Actual Prize is :  " + Actual_prize3);
		int Total3 = Actual_prize3;
		System.out.println("Your Total prize is : " + Total3);
		           break;
		      }
}
		    
		}
	}