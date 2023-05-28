package Pattern_Paractice;

public class Pattern_21_05_23 {
	
	/*Today 21/05/2023
	 * pattern 1 :
	 1
	 2  3
	 4  5  6
	 7  8  9  10
	 11 12 13 14 15
	 * pattern 2 :
	 1
	 2 2
	 3 3 3
	 4 4 4 4
	 5 5 5 5 5
	 * pattern 3:
	 5
	 4 4
	 3 3 3
	 2 2 2 2
	 1 1 1 1 1
	 * pattern 4:
	 5
	 5 4
	 5 4 3
	 5 4 3 2
	 5 4 3 2 1
	 * pattern 5 :
	 15
	 14 13
	 12 11 10
	 9  8  7  6
	 5  4  3  2  1
	 ------------------------
	 1 0 1 0 1
	 1 0 1 0
	 1 0 1
	 1 0
	 1
	 _______________________
	 * pattern 6 :
	         1
	       1 2
	  	 1 2 3
	   1 2 3 4
  	 1 2 3 4 5
  	 * pattern 7:
             1
	      2  3
       4  5  6
    7  8  9 10
11 12 13 14 15
  	 * pattern 8 :
  	         5
	       5 4
	  	 5 4 3
	   5 4 3 2
  	 5 4 3 2 1
  	 * pattern 9:
  	         5
	       4 4
	  	 3 3 3
	   2 2 2 2
  	 1 1 1 1 1
  	 * pattern 10 :
  	         1
	       1 1
	  	 1 1 1
	   1 1 1 1
  	 1 1 1 1 1
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern_21_05_23 p = new Pattern_21_05_23();
//		p.pattern1();
		p.pattern2();

	}
	private void pattern2() {
		/* TODO Auto-generated method stub
		 * * pattern 2 :
	 1
	 2 2
	 3 3 3
	 4 4 4 4
	 5 5 5 5 5
		 */
	
	}
	

	private void pattern1() {
		/* TODO Auto-generated method stub
		 *  * pattern 1 :
	 1
	 2  3
	 4  5  6
	 7  8  9  10
	 11 12 13 14 15
		 */
		int no=1;
		for(int row=1;row<=5;row++) {
		for(int col=1;col<=row;col++) {
			System.out.print(no+" ");
			no++;
		}
		System.out.println();}
	}

}
