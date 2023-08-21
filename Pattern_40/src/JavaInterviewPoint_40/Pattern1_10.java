package JavaInterviewPoint_40;

public class Pattern1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1_10 p = new Pattern1_10();
		/**
		 * ## Printing the pattern1 ##
         1 
         1 2 
         1 2 3 
         1 2 3 4 
         1 2 3 4 5
		 */
//		p.Pattern1();
		
		/**
		 * ## Printing the pattern2 ##
         A 
         A B 
         A B C 
         A B C D 
         A B C D E 
		 */
//		p.pattern2();

		/**
		 * ## Printing the pattern3 ##
             * 
             * * 
             * * *  
             * * * * 
             * * * * *
		 */
//		p.pattern3();
		
		/**
		 * ## Printing the pattern4 ##
         1 
         2 2 
         3 3 3 
         4 4 4 4 
         5 5 5 5 5 
		 */
//		p.pattern4();
		
		/**
		 * ## Printing the pattern5 ##
         A 
         B B 
         C C C 
         D D D D 
         E E E E E
		 */
//		p.pattern5();
		
		/**
		 * ## Printing the pattern6 ##
                 	* 
                  * * 
      			* * * 
    		  * * * * 
  			* * * * *
 
		 */
//		p.pattern6();
		
		/**
		 * ## Printing the pattern7 ##
             1 
            1 2 
           1 2 3 
          1 2 3 4 
         1 2 3 4 5
		 */
//		p.pattern7();
		
		/**
		 * ## Printing the pattern8 ##
             5 
            4 5 
           3 4 5 
          2 3 4 5 
         1 2 3 4 5
		 */
//		p.pattern8();
		
		/**
		 * ## Printing the pattern9 ##
             A 
            A B 
           A B C 
          A B C D 
         A B C D E
		 */
		p.pattern9();
		
		/**
		 * ## Printing the pattern10 ##
     	     E 
      	    D E 
           C D E 
          B C D E 
         A B C D E
		 */
//		p.pattern10();
		
	}

	private void pattern10() {
		// TODO Auto-generated method stub
		int chars=65;
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <i ; j++) {
				System.out.print(" ");
			}
			for (int k = i; k<=5 ; k++) {
				System.out.print((char)(chars+k -1)+" ");
			}
			System.out.println();
		}
	}

	private void pattern9() {
		// TODO Auto-generated method stub
		int chars=65;
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >i ; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k<=i ; k++) {
				System.out.print((char)(chars+k -1)+" ");
			}
			System.out.println();
		}
	}

	private void pattern8() {
		// TODO Auto-generated method stub
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <i ; j++) {
				System.out.print(" ");
			}
			for (int k = i; k<=5 ; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

	private void pattern7() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

	private void pattern6() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		int alpha=65;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(alpha+i -1)+" ");
			}
			System.out.println();
			
		}
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		int alpha=65;//A
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print((char)(alpha+j -1)+" ");
				               // char= 65 +1 -1=>65->A
			}
			System.out.println();
		}
		
	}

	private void Pattern1() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}

}
