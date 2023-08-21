package JavaInterviewPoint_40;

public class Pattern11_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern11_20 p = new Pattern11_20();
		/**
		 * ## Printing the pattern11 ##
                 *
                ***
               *****
              *******
             *********
		 */
//		p.Pattern11();
		
		/**
		 * ## Printing the pattern12 ##
                  1 
                 2 2 
                3 3 3 
               4 4 4 4 
              5 5 5 5 5 
		 */
//		p.pattern12();

		/**
		 * ## Printing the pattern13 ##
         A 
         B B 
         C C C 
 		 D D D D 
         E E E E E 
		 */
//		p.pattern13();
		
		/**
		 * ## Printing the pattern14 ##
		 1 2 3 4 5 
		 1 2 3 4 
		 1 2 3 
		 1 2 
		 1
		 */
//		p.pattern14();
		
		/**
		 * ## Printing the pattern15 ##
		 5 4 3 2 1 
		 5 4 3 2 
		 5 4 3 
		 5 4 
		 5
		 */
//		p.pattern15();
		
		/**
		 * ## Printing the pattern16 ##
		 5 
		 5 4 
		 5 4 3 
		 5 4 3 2 
		 5 4 3 2 1 
		 */
//		p.pattern16();
		
		/**
		 * ## Printing the pattern17 ##
		 1 
		 2 3 
		 4 5 6 
		 7 8 9 10 
		 11 12 13 14 15
		 */
//		p.pattern17();
		
		/**
		 * ## Printing the pattern18 ##
		 A B C D E 
		 A B C D 
		 A B C 
		 A B 
		 A
		 */
//		p.pattern18();
		
		/**
		 * ## Printing the pattern19 ##
		 E D C B A 
		 E D C B 
		 E D C 
		 E D 
		 E 
		 */
//		p.pattern19();
		
		/**
		 * ## Printing the pattern20 ##
		 E 
		 E D 
		 E D C 
		 E D C B 
		 E D C B A
		 */
//		p.pattern20();

	}

	private void pattern20() {
		// TODO Auto-generated method stub
		int alpha=65;
		for (int i = 5; i >=1; i--) {
			for (int j = 5; j >=i; j--) {
				System.out.print((char)(alpha+j-1)+" ");
			}
			System.out.println();
		}
	}

	private void pattern19() {
		// TODO Auto-generated method stub
		int alpha=65;
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >=i; j--) {
				System.out.print((char)(alpha+j-1)+" ");
			}
			System.out.println();
		}
	}

	private void pattern18() {
		// TODO Auto-generated method stub
		int alpha=65;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print((char)(alpha+j-1)+" ");
			}
			System.out.println();
		}
	}

	private void pattern17() {
		// TODO Auto-generated method stub
		int no=1;
		for (int i = 5; i >=1 ; i--) {
			for (int j = 5; j >=i; j--) {
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}

	private void pattern16() {
		// TODO Auto-generated method stub
		for (int i = 5; i >=1; i--) {
			for (int j = 5; j >=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	private void pattern15() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	private void pattern14() {
		// TODO Auto-generated method stub
		for (int i = 5; i >=1 ; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	private void pattern13() {
		// TODO Auto-generated method stub
		int alpha=65;
		for (int i = 1; i <=5 ; i++) {
			
			for (int j = 1; j <=i ; j++) {
				System.out.print((char)(alpha+i-1)+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern12() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

	private void Pattern11() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= (i*2)-1; k++) {
				// (1*2)=>2-1=>1, 
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

}
