package JavaInterviewPoint_40;

public class Pattern21_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern21_30 p = new Pattern21_30();
		/**
		 * ## Printing the pattern21 ##
		 A 
		 B C 
		 D E F 
		 G H I J 
		 K L M N O
		 */
//		p.Pattern21();
		
		/**
		 * ## Printing the pattern22 ##
    		 1 
   			1 1 
  		   1 2 1 
 		  1 3 3 1 
		 1 4 6 4 1 
		 */
//		p.pattern22();

		/**
		 * ## Printing the pattern23 ##
    		 A 
   			A A 
  		   A B A 
 		  A C C A 
		 A D F D A
		 */
//		p.pattern23();
		
		/**
		 * ## Printing the pattern24 ##
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
//		p.pattern24();
		
		/**
		 * ## Printing the pattern25 ##
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
//		p.pattern25();
		
		/**
		 * ## Printing the pattern26 ##
              * 
              * * 
              * * * 
              * * * * 
              * * * * * 
              * * * * 
              * * *  
              * *   
              *
		 */
//		p.pattern26();
		
		/**
		 * ## Printing the pattern27 ##
		 			* 
        		  * * 
      			* * * 
    	      * * * * 
    		* * * * * 
    		  * * * * 
    		  	* * * 
    		  	  * * 
    		  	    *
		 */
//		p.pattern27();
		
		/**
		 * ## Printing the pattern28 ##
		 1 2 3 4 5 
		 1 2 3 4 
		 1 2 3 
		 1 2 
		 1 
		 1 2 
		 1 2 3 
		 1 2 3 4 
		 1 2 3 4 5
		 */
//		p.pattern28();
		
		/**
		 * ## Printing the pattern29 ##
		 5 4 3 2 1 
		 4 3 2 1 
		 3 2 1 
		 2 1 
		 1 
		 2 1 
		 3 2 1 
		 4 3 2 1 
		 5 4 3 2 1
		 */
//		p.pattern29();
		
		/**
		 * ## Printing the pattern30 ##
		 A B C D E 
		 A B C D 
		 A B C 
		 A B 
		 A 
		 A B 
		 A B C 
		 A B C D 
		 A B C D E
		 */
//		p.pattern30();

	}

	private void pattern29() {
		// TODO Auto-generated method stub
		for (int i = 5; i >=1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i = 2; i <=5; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern30() {
		// TODO Auto-generated method stub
		int alpha=65;
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print((char)(alpha+j-1)+" ");
			}
			System.out.println();
		}
		for (int i = 2; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print((char)(alpha+j-1)+" ");
			}
			System.out.println();
		}
	}

	private void pattern28() {
		// TODO Auto-generated method stub
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i = 2; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	private void pattern27() {
		// TODO Auto-generated method stub
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <=5; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 2; i <=5; i++) {
			for (int j = 1; j <i ; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void pattern26() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void pattern25() {
		// TODO Auto-generated method stub
		int alpha=65;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print((char)(alpha+j-1)+" ");
			}
			System.out.println();
		}
		
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <i; j++) {
				System.out.print((char)(alpha+j-1)+" ");
			}
			System.out.println();
		}
	}

	private void pattern24() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
			for(int i=5;i>=1;i--) {
				for (int j = 1; j <i; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		
	}

	private void pattern23() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5 ; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print(" ");
			}
			int temp=1;
			int alpha=65;
			for (int k = 1; k <=i; k++) {
				System.out.print((char)(alpha+temp-1)+" ");
				temp=temp*(i-k)/k;
			}
			System.out.println();
		}
	}

	private void pattern22() {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >=i; j--) {
				System.out.print(" ");
			}
			int temp=1;
			for (int k = 1; k <=i ; k++) {
				System.out.print(temp+" ");
				temp=temp*(i-k)/k;
			}
			System.out.println();
		}
	}

	private void Pattern21() {
		// TODO Auto-generated method stub
		int alpha=65;
		for (int i = 5; i >=1; i--) {
			for (int j = 5; j >=i; j--) {
				System.out.print((char)(alpha)+" ");
				alpha++;
			}
			System.out.println();
	}
	}

}
