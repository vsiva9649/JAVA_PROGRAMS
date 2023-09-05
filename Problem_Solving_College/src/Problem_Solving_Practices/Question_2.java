/**
 * 
 */
package Problem_Solving_Practices;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  8 8 8 8 
		 *   6 6 6
		 *    4 4 
		 *     2
		 *******************  
		 *           1
		 *         2 2
		 *       3 3 3
		 *     4 4 4 4
		 *   5 5 5 5 5   
		 * 6 6 6 6 6 6  
		 *   5 5 5 5 5
		 *     4 4 4 4
		 *       3 3 3
		 *         2 2
		 *           1
		 **********************
		 *          3
		 *         6 6
		 *       9  9  9
		 *     12 12 12 12              
		 */
		Question_2 p = new Question_2();
		Scanner sc = new Scanner(System.in);
		/*
1. Print  
               1
           2      2
       3      3      3
   4      4      4      4
5     5      5      5     5
		 */
//		p.q1();
//		System.out.println("Enter your String : \n");
//		String S= sc.nextLine();
		/*
2)  remove extra space given string
   example:
 Payilagam       is       a   training center

Sample output:
Payilagam is a training center
		 */
//		p.q2(S);
		/*
1. Print pattern like

  	1
  2 2
3 3 3
		 */		
//		p.q3();
		/*
2. Input : - __Merfantz_Technologies_____
Output :- 
Merfantz Technologies

 Remove Spaces from this input without using trim ().

		 */
//		p.q4();
		/*
3. How can we count length of a string without using length().
		 */
//		p.q5();
		/*
4. How can you break this statement without using break after printed 5.
		 */
		p.q6();
	}

	private void q6() {
		/*
		4. How can you break this statement without using break after printed 5.
				 */
		for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            if (i == 5) {
                // Do not continue the loop after printing 5
                i = 11; // Set i to a value that will exit the loop
            }
        }
	}

	private void q5() {
		/*
		3. How can we count length of a string without using length().
				 */
		   String input = "Hello, World!";
	        
	        int count = 0;
	        char[] charArray = input.toCharArray();
	        
	        for (char c : charArray) {
	            count++;
	        }
	        
	        System.out.println("Length of the string: " + count);
	}

	private void q4() {
		/*
		2. Input : - __Merfantz_Technologies_____
		Output :- 
		Merfantz Technologies

		 Remove Spaces from this input without using trim ().

				 */
String input = "__Merfantz_Technologies_____";
        
        // Remove spaces using regular expression
        String output = input.replaceAll("\\_+", "");
        
        System.out.println(output);
		
		
	}

	private void q3() {
		/*
1. Print pattern like

  	1
  2 2
3 3 3
		 */	
		for (int row = 1; row <=5; row++) {
			for (int space = 5; space >=row; space--) {
				System.out.print(" ");
			}
			for (int col = row; col >=1 ; col--) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
	for (int row = 1; row <=5; row++) {
		
	}
		
	}

	private void q2(String input) {
		/*
		2)  remove extra space given string
		   example:
		 Payilagam       is       a   training center

		Sample output:
		Payilagam is a training center
				 */
//		  String input = "Payilagam       is       a   training center";
	        String output = input.replaceAll("\\s+", " ");
	        System.out.println(output);
		
	}

	private void q1() {
		/*
		 * 1. Print  
               1
           2      2
       3      3      3
   4      4      4      4
5     5      5      5     5
		 */
		for (int row = 1; row <=5; row++) {
			for (int S = 5; S >=row; S--) {
				System.out.print(" ");
			}
			for (int col = 1; col <=row; col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
	}

}
