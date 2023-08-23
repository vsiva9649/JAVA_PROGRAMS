package JavaInterviewPoint_40;

public class Pattern41_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern41_50 p = new Pattern41_50();
		/*
* * * * 0 * * * * 
* * * 0 0 0 * * * 
* * 0 0 0 0 0 * * 
* 0 0 0 0 0 0 0 * 
0 0 0 0 0 0 0 0 0 
* 0 0 0 0 0 0 0 * 
* * 0 0 0 0 0 * * 
* * * 0 0 0 * * * 
* * * * 0 * * * * 
		 */
		p.patter1();

	}

	private void patter1() {
		// TODO Auto-generated method stub
/*
* * * * 0 * * * * 
* * * 0 0 0 * * * 
* * 0 0 0 0 0 * * 
* 0 0 0 0 0 0 0 * 
0 0 0 0 0 0 0 0 0 
* 0 0 0 0 0 0 0 * 
* * 0 0 0 0 0 * * 
* * * 0 0 0 * * * 
* * * * 0 * * * * 
 */

			int n=5;

			for(int i=1; i<=n; i++) 
		{
			for(int j=1; j<=n-i; j++) {
				System.out.print("* ");
			}

			for(int j=1; j<=i*2-1; j++) { 
				System.out.print("0 ");
			}

			for(int j=1; j<=n-i; j++) {
				System.out.print("* ");

			}

			System.out.println();

		}

			for (int i=n-1; i>0; i--) 
		{
				for(int j=1; j<=n-i; j++) {

					System.out.print("* "); 
				}

			for(int j=1; j<=i*2-1; j++) {
				System.out.print("0 ");
			}

			for(int j=1; j<=n-i; j++) {

			System.out.print("* "); 
			}
			System.out.println();

		}


	}
}

