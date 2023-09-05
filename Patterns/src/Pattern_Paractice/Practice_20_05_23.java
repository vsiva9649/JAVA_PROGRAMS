package Pattern_Paractice;

public class Practice_20_05_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice_20_05_23 p = new Practice_20_05_23();
		
//		p.pattern_1();
//		p.pattern_2();
//		p.pattern_3();
//		p.pattern_4();
//		p.pattern_5();
//		p.pattern_6();
//		p.pattern_7();
//		p.pattern_8();
		p.pattern_9();
		
/**
 * 
pattern_1()
1   2   3   4   5
1   2   3   4
1   2   3
1   2
1
pattern 2()
5   4   3   2   1
5   4   3   2
5   4   3
5   4
5
pattern_3()
1   2   3   4   5
2   3   4   5
3   4   5
4   5
5

pattern_4()
5   4   3   2   1
4   3   2   1
3   2   1
2   1
1
pattern_5()
1   2   3   4   5   
6   7   8   9
10  11  12
13  14
15
pattern_6()
15  14  13  12  11
10  9   8   7
6   5   4
3   2
1
pattern_7()
*   *   *   *   *
*   *   *   *
*   *   *
*   *
*
pattern_8()
1   2   3   4   5
6   7   8   9   10
11  12  13  14  15

		
 */
		
		
		
		
		
		

	}

	private void pattern_9() {
		// TODO Auto-generated method stub
		for (int i = 5; i >=1; i--) {
			for (int j = 5; j >i; j--) {
				System.out.print("* ");
			}
			for (int no = 1; no <=i; no++) {
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern_8() {
		// TODO Auto-generated method stub
		
	}

	private void pattern_7() {
		// TODO Auto-generated method stub
		
	}

	private void pattern_6() {
		/* TODO Auto-generated method stub
		 * pattern_6()
15  14  13  12  11
10  9   8   7
6   5   4
3   2
1
		 */
		int num=15;
		for (int col=5;col>=1;col--) {
		for(int row=1;row<=5;row++) {
			System.out.print(num+" ");
			num--;
		}
		System.out.println();
		}
		
	}

	private void pattern_5() {
		/* TODO Auto-generated method stub
		 * pattern_5()
1   2   3   4   5   
6   7   8   9
10  11  12
13  14
15
		 */
		int num=1;
		for(int row=5;row>=1;row--) {
		for (int col=1;col<=row;col++) {
			System.out.print(num+"\t");
		num++;
		}
		System.out.println();
		}
		
	}

	private void pattern_4() {
		// TODO Auto-generated method stub
		
	}

	private void pattern_3() {
		/** TODO Auto-generated method stub
pattern_3()
1   2   3   4   5
2   3   4   5
3   4   5
4   5
5
		 */
		int rows=5;
		for(int col=1;col<=rows;col++) {
		for(int row=col;row<=rows;row++) {
			System.out.print(row+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern_2() {
		/** TODO Auto-generated method stub
		 * 		 
pattern 2()
5   4   3   2   1
5   4   3   2
5   4   3
5   4
5
		 */
		for(int col=1;col<=5;col++) {
		for(int row=5;row>=col;row--) {
			System.out.print(row+" ");
		}
		System.out.println();
		}
		
		
	}

	private void pattern_1() {
		/** TODO Auto-generated method stub
pattern_1()
1   2   3   4   5
1   2   3   4
1   2   3
1   2
1
*/
		for(int col=5;col>=1;col--) {
		for(int row=1;row<=col;row++) {
			System.out.print(row+" ");
		}
		System.out.println();
		}
		
	}

}
