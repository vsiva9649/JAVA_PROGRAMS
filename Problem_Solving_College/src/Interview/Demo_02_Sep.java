package Interview;

import java.util.Scanner;

public class Demo_02_Sep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo_02_Sep p = new Demo_02_Sep();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no :\n");
		int no=sc.nextInt();
//		p.sample(no);
		p.hardx3(no);
	}

	private void hardx3(int no1) {
		// TODO Auto-generated method stub
		/*
		 *   3
		 *  6 6
		 * 9 9 9
		 */
		int no=no1;
		
		
	}

	private void sample(int no) {
		// TODO Auto-generated method stub
		for (int row = 1; row <=no; row++) {
			for (int space = no; space > row; space--) {
				System.out.print("  ");
			}
			for (int col = 1; col <=row; col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
		for (int row = no-1; row >=1; row--) {
			for (int space =no; space >row; space--) {
				System.out.print("* ");
			}
			for (int col = row; col >=1; col--) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

}
