/**
 * Problem Description:

Selvan was playing with the a object of random size for stress relief.

Selvan knows that the length, Width, and Height of the object.

But he would like to know the surface area of the object he is playing with.

Can you help him in finding it?

Functional Description:

Surface area of the Object = 2 x [width x length + length x height + height x width]

Constraints:

1 <= widths <= 10

1 <= heights <= 10

Input Format

First Line Length of the object in Integer.

Second Line: Width of the object in Integer

Third Line: Height of the object in Integer

Output Format

Print a single integer value representing the surface area of the object 
selvam is playing with.

test case:1
@ Siva reference
Surface area of the Object = 2 x [2 x 3 + 3 x 3 + 3 x 2] => 2 *(6+9+6) => 2*21 => 42.

    						
 * input la namba  3 2 3 nu three interger values kudukurom . 
 * athula first number name length nu avungaly question la sollitanga ,
 * next number 2 input kudukurom athuku name width nu avugalay question la sollitanga.
 * next number 3 input la kudukurom athuku name height nu solli erukanga question la.
 * final yallathaium formula la eruka mathire namba multiple pani 
 * output vara vaikanum ga avalavu than entha task. 
 * 
 // Input :
   l - 3		
   w - 2							
   h - 3
 // Output :
    42
   
 */

package Problem_Solving_Practices;
import java.util.*;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		int height = sc.nextInt();
//Surface area of the Object = 2 x [width x length + length x height + height x width]
		//ethuku name nan area nu vachikuran pa.
		
		int Area = 2*(width*length + length * height + height * width);
		
		System.out.println(Area); // output 42 varum avalavu than finally,

	}

}
