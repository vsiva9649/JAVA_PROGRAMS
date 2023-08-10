package FriendsTask;

public class mugil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] a =  new int [9][9];
		int no = 1;
		int minrow = 0;
		int maxrow = 8;
		int mincol = 0;
		int maxcol = 8;
		while(no<=17) {
			for(int i = mincol;i<=maxcol;i++)
			{
				a[minrow][i]= no;
				
			}
			no++;
			minrow++;

			for(int i = minrow;i<=maxrow;i++)
			{
				a[i][maxcol]=no;
			}
			no++;
			maxcol--;
			for(int i = maxcol;i>=mincol;i--)
			{
				a[maxrow][i]=no;
			}
			no++;
			maxrow--;
			for(int i =maxrow;i>=minrow;i--)
			{
				a[i][mincol]=no;
			}
			no++;
			mincol++;
			
		
		}
		
		for(int row = 0;row<=8;row++)
		{
			for(int col = 0;col<=8;col++)
			{
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
		
	}

}
