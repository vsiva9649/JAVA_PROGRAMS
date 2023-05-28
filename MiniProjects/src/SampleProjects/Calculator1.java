package SampleProjects;

import java.util.Scanner;


public class Calculator1 {
	
	double num1;
	double num2;
	double result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator1 c = new Calculator1();
		
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
		
		do {
			System.out.println("Select an operation:");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");

	        System.out.print("Enter your choice (1-4): ");
	        int choice = sc.nextInt();		
	    // Step -3 ( Calculation Process)
		}while(true);
		
		
//		switch (choice) {
//		 
//        case 1:
//            result = num1 + num2;
//            System.out.println("Result: " +(int)(double)result);
//            break;
//        case 2:
//            result = num1 - num2;
//            System.out.println("Result: " +(int)(double)result);
//            break;
//        case 3:
//            result = num1 * num2;
//            System.out.println("Result: " + result);
//            break;
//        case 4:
//        	if (num2 != 0) {
//                result = num1 / num2;
//                System.out.println("Result: " + result);
//            } else {
//                System.out.println("Error: Cannot divide by zero.");
//            }
////        	System.out.println("Enter onther number t");
//        	break;
//        default:
//            System.out.println("Invalid choice. Read Carefully Enter 1 to 4 only.");
//    }

	}

}
