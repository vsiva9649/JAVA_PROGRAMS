package Number_Pattern;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_2 p = new Pattern_2();
		/**Pattern_6:
		 *     5
		 *    4 5
		 *   3 4 5
		 *  2 3 4 5
		 * 1 2 3 4 5
		 */
//		p.Pattern_6();//
		
		/**Pattern_7:
		 *     1
		 *    2 2
		 *   3 3 3
		 *  4 4 4 4
		 * 5 5 5 5 5
		 */
//		p.Pattern_7();//
		
		/**Pattern_8:
		 * 1 2 3 4 5
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2
		 * 1   
		 */
//		p.Pattern_8();//
		
		/**Pattern_9:
		 * 5 4 3 2 1
		 * 5 4 3 2
		 * 5 4 3
		 * 5 4 
		 * 5  
		 */
//		p.Pattern_9();//
		
		/**Pattern_10:
		 * 1   
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 * 11 12 13 14 15
		 */
		p.Pattern_10();//
		

	}

	private void Pattern_10() {
		// TODO Auto-generated method stub
		int num=1;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
			
			
		}
		
	}

	private void Pattern_9() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5 ; i++) {
			for(int j=5; j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
		
	}

	private void Pattern_8() {
		// TODO Auto-generated method stub
		int a=5;
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	private void Pattern_7() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++) {
					System.out.print(i+" ");
				}
				System.out.println();
		}
	}

	private void Pattern_6() {
		// TODO Auto-generated method stub
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <=5; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
	}

}
