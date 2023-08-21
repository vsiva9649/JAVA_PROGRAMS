package JavaInterviewPoint_40;

public class Pattern31_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern31_40 p = new Pattern31_40();
		/**
		 * 
## Printing the pattern31 ##
E D C B A 
D C B A 
C B A 
B A 
A 
B A 
C B A 
D C B A 
E D C B A
		 */
//		p.Pattern31();
		
		/**
		 * 
## Printing the pattern32 ##
* * * * * 
* * * * 
* * * 
* * 
* 
* * 
* * * 
* * * * 
* * * * * 
		 */
//		p.pattern32();

		/**
		 * 
## Printing the pattern33 ##
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1
		 */
//		p.pattern33();
		
		/**
		 * 
## Printing the pattern34 ##
        A 
      A B A 
    A B C B A 
  A B C D C B A 
A B C D E D C B A 
		 */
//		p.pattern34();
		
		/**
		 * 
## Printing the pattern35 ##
1 0 0 0 0 
0 2 0 0 0 
0 0 3 0 0 
0 0 0 4 0 
0 0 0 0 5
		 */
//		p.pattern35();
		
		/**
		 * 
## Printing the pattern36 ##
1 1 1 1 1 
1 1 1 2 2 
1 1 3 3 3 
1 4 4 4 4 
5 5 5 5 5 
		 */
//		p.pattern36();
		
		/**
		 *
## Printing the pattern37 ##
A A A A A 
A A A B B 
A A C C C 
A D D D D 
E E E E E
		 */
//		p.pattern37();
		
		/**
		 * 
## Printing the pattern38 ##
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1
		 */
		p.pattern38();
		
		/**
		 * 
## Printing the pattern39 ##
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
  A B C D 
   A B C 
    A B 
     A
		 */
//		p.pattern39();
		
		/**
		 * 
## Printing the pattern40 ##
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
		 */
//		p.pattern40();

	}

	private void pattern38() {
		// TODO Auto-generated method stub
		
	}

	private void pattern35() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if(j==i)
				System.out.print(j+" ");
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

	private void pattern37() {
		// TODO Auto-generated method stub
		int alpha=64;
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print("A ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print((char)(alpha+i)+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern36() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print("1 ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	private void pattern34() {
		// TODO Auto-generated method stub
		int alpha=64;
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print((char)(alpha+k)+" ");
			}
			for (int l = i-1; l >=1; l--) {
				System.out.print((char)(alpha+l)+" ");
			}
			System.out.println();
		}
	}

	private void pattern33() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print("  ");
			}
			for (int k = 1;k <=i; k++) {
				System.out.print(k+" ");
			}
			for (int l = i-1; l >=1; l--) {
				System.out.print(l+" ");
			}
			System.out.println();
		
		
		}
	}

	private void pattern32() {
		// TODO Auto-generated method stub
		for (int i = 5; i >=1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 2; i <=5; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void Pattern31() {
		// TODO Auto-generated method stub
		int alpha=64;
		for (int i = 5; i >=1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		for (int i = 2; i <=5; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
	}

}
