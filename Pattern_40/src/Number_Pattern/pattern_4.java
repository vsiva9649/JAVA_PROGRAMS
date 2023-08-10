package Number_Pattern;

public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern_4 p = new pattern_4();
		/**Pattern_16:
		 * 1 1 1 1 1 
		 * 1 1 1 2 2
		 * 1 1 3 3 3 
		 * 1 4 4 4 4
		 * 5 5 5 5 5 
		 */
//		p.Pattern_16();//
		
		/**Pattern_17:
		 *     5
		 *    5 4
		 *   5 4 3
		 *  5 4 3 2
		 * 5 4 3 2 1
		 */
//		p.Pattern_17();//
		
		/**
		 * ## Printing the pattern_18 ##
		 
		 */
//		p.Pattern_18();

	}

	private void Pattern_18() {
		// TODO Auto-generated method stub
		
		
	}

	private void Pattern_17() {
		// TODO Auto-generated method stub
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >=i; j--) {
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}
		
	}

	private void Pattern_16() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print(1+" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
