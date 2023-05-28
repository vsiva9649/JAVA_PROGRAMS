package SampleProjects;

import java.util.Scanner;

public class Calculator {
	double num1;
	double num2;
	double result;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Calculator Sample Project");
		System.out.println("********** ****** *******");
		// Step-1 (Getting Input from the User)
		System.out.println("Enter your First number value : ");
		System.out.print("num1 : ");
		c.num1=sc.nextDouble();
		System.out.println("Enter your Second number value : ");
		System.out.print("num2 : ");
		c.num2=sc.nextDouble();
		// Step-2 ( showing and select any one options )
		do{
		    System.out.println("Select an operation");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");

	        System.out.print("Enter your choice (1-4): ");
	        int choice = sc.nextInt();		
	        System.out.println();
	    // Step -3 ( Calculation Process)
	      double result= c.Calculation(choice);
	    //Step -4 (Rotate method calling)
	      	System.out.println();
	        System.out.println("Do you want to Continue ?");
	        System.out.println("Yes~y"+"\t"+"No~n");
	        
	        String useropt = sc.next();
	        if(useropt.equalsIgnoreCase("Y")) {
	        	System.out.println("Result value is : "+result);
	        	System.out.println("num1 : "+result);
	        	c.num1=result;
	        	System.out.println("Enter num2 value :");
	        	c.num2=sc.nextDouble();

	        }
		        else if(useropt.equalsIgnoreCase("N")) 
		        {
	        	System.out.println("THANK YOU !!!");
	        	System.out.println("For Using (Hema,Ashwini,AmalRaj,Siva) Team Calculator.");
	        	break;
	        	}
		        else {
		        	System.out.println("Try Again with (Y/N) only !");
		        }
		}while(true);
	        

	}

	
	private double Calculation(int choice) {
		// TODO Auto-generated method stub
		 switch (choice) {
		 
         case 1:
             result = num1 + num2;
             System.out.println("The Addition of Given numbers : "+num1+"+"+num2+" = " +(int)result);
             break;
         case 2:
             result = num1 - num2;
             System.out.println("The Subtraction Result : "+num1+"-"+num2+" = " +(int)result);
             break;
         case 3:
             result = num1 * num2;
             System.out.println("Multiplication Result : "+num1+"*"+num2+" = " + result);
             break;
         case 4:
         	if (num2 != 0) {
                 result = num1 / num2;
                 System.out.println("Division Result : "+num1+"/"+num2+" = " + result);
             } else {
                 System.out.println("Error: Cannot divide by zero.");
             }
//         	System.out.println("Enter onther number t");
         	break;
         default:
             System.out.println("Invalid choice. Read Carefully Enter 1 to 4 only.");
     }
		return result;
		
	}

}
