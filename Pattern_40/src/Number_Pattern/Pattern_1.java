package Number_Pattern;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_1 p = new Pattern_1();
		/**Pattern_1:
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 */
//		p.Pattern_1();//
		
		/**Pattern_2:
		 * 1
		 * 2 2
		 * 3 3 3
		 * 4 4 4 4
		 * 5 5 5 5 5
		 */
//		p.Pattern_2();//
		
		/**Pattern_3:
		 *     1
		 *    1 2
		 *   1 2 3
		 *  1 2 3 4
		 * 1 2 3 4 5
		 */
//		p.Pattern_3();//
		
		/**Pattern_4:
		 * 5
		 * 5 4
		 * 5 4 3
		 * 5 4 3 2
		 * 5 4 3 2 1
		 */
//		p.Pattern_4();//
		
		/**Pattern_5:
		 * 5
		 * 4 4
		 * 3 3 3
		 * 2 2 2 2
		 * 1 1 1 1 1
		 */
		p.Pattern_5();//

	}

	private void Pattern_5() {
		// TODO Auto-generated method stub
		for (int i = 5; i >=1; i--) {
			for (int j = 5; j >=i; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
		
	}

	private void Pattern_4() {
		// TODO Auto-generated method stub
		for (int i = 5; i >=1; i--) {
			for (int j = 5; j >=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

	private void Pattern_3() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}

	private void Pattern_2() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

	private void Pattern_1() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
	}

}
