package Number_Pattern;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_3 p = new Pattern_3();
		/**Pattern_11:
		 * 5 4 3 2 1
		 * 4 3 2 1
		 * 3 2 1
		 * 2 1
		 * 1
		 * 2 1
		 * 3 2 1
		 * 4 3 2 1
		 * 5 4 3 2 1
		 */
//		p.Pattern_11();//
		
		/**Pattern_12:
		 *     1
		 *    1 1
		 *   1 2 1
		 *  1 3 3 1
		 * 1 4 6 4 1
		 */
//		p.Pattern_12();//
		
		/**Pattern_13:
		 *        1 
		 *      1 2 1 
		 *    1 2 3 2 1 
		 *  1 2 3 4 3 2 1 
		 *1 2 3 4 5 4 3 2 1 
		 */
		p.Pattern_13();//
		
		/**Pattern_14:
		 * 1 0 0 0 0
		 * 0 2 0 0 0
		 * 0 0 3 0 0
		 * 0 0 0 4 0
		 * 0 0 0 0 5 
		 */
//		p.Pattern_14();//
		
		/**Pattern_15:
		 *     1
		 *    1 2
		 *   1 2 3
		 *  1 2 3 4
		 * 1 2 3 4 5
		 *  1 2 3 4
		 *   1 2 3
		 *    1 2
		 *     1
		 *     
		 *     
		 */
//		p.Pattern_15();//

	}

	private void Pattern_15() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) 
        {
		for (int j = 5; j >i; j--) {
			System.out.print(" ");
		}
		for (int k = 1; k <=i; k++) {
			System.out.print(k+" ");
		}
		System.out.println();
        }
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= 5 - i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		
	}

	private void Pattern_14() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if(j==i) {
					System.out.print(i+" ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
	}

	private void Pattern_13() {
		// TODO Auto-generated method stub
		int rows = 5;
//		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
                { 
                        for (int j = rows; j > i; j--)
			{
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) 
                        { 
                                System.out.print(k + " "); 
                        } 
                        for (int l = i - 1; l >= 1; l--)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
	
		
		
	}

	private void Pattern_12() {
		// TODO Auto-generated method stub
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
               { 
                        for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			int temp = 1;
			for (int k = 1; k <= i; k++)
			{
				System.out.print(temp + " ");
				temp = temp * (i - k) / (k);
			}
			System.out.println();
		;}
		
	}

	private void Pattern_11() {
		// TODO Auto-generated method stub
		int rows=5;
		for (int i = rows; i >=1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i = 2; i <=rows; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
