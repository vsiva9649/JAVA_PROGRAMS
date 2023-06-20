package CraditCard;

import java.util.Scanner;

public class CraditCard_no_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CraditCard_no_Validation sc=new CraditCard_no_Validation();
		sc.Method();
	}

	private void Method() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter length of numbers : ");
	      int n = sc.nextInt();
	      int[] cardno=new int[n];
	      System.out.println("Enter the card number");
	      for( int i=0;i<cardno.length;i++)
	      {
	       cardno[i]=sc.nextInt();
	      //System.out.println(cardno[i]);
	      }
	      int checksum=cardno[cardno.length-1];
	      System.out.println("The cheksum is "+ checksum);
	     
	      
	      // for finding even position from right side to left side
	      
	      int[] b=new int[n];
	      for(int j=cardno.length-1;j>=0;j--)
	      {
	        if(j%2==0)
	        {
	          b[j]=cardno[j]*2;
	          if(b[j]>9)
	          {
	            int rem=b[j]%10;
	            int quo=b[j]/10;
	            b[j]=rem+quo;
//	            System.out.println(b[j]);
	            }
	          }
	        else
	      {
	        b[j]=cardno[j];
	      }
	        System.out.print(b[j]+" ");
	      }
	      System.out.println();
	      int sum=0;
	      for(int k=0;k<=b.length;k++)
	      {
	        sum=sum+b[k];
	      }
	      System.out.println("The sum of total number is "+ sum); 
//	      int c=10-(sum%10);
//	      
//	      if(c==checksum )
//	      {
//	      System.out.println("credit card number is valid");
//	      }
//	      else {
//	        System.out.println("credit card number is Invalid");
//	      }
	      if(sum%10==0) {
	        System.out.println("credit card number is valid");
	      }
	      else {
	        System.out.println("credit card number is Invalid");
	      }
	
		
	}
	
	


}
