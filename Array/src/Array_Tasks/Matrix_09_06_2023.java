package Array_Tasks;

public class Matrix_09_06_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix_09_06_2023 m=new Matrix_09_06_2023();
//		m.Task1();
//		m.task2();
		m.Task3();
		

	}

	private void Task3() {
		// Chocolate sum 
		    
		    int eaten=15;
		    int cover=eaten;
		    int balance_cover=0;
		    int chocolates=0;
		    while(cover>=2)// cover 3 erunthathan 1 choco tharuvanga
		    {
		    chocolates=cover/3;// 3 cover 1 choco
		    balance_cover=balance_cover+cover%3;//0+5
		  
		    cover=chocolates; // 15
		    eaten=eaten+chocolates; //15+0
		    
		    }
		  balance_cover=balance_cover+cover;//
		  chocolates=balance_cover/3;
		  eaten=eaten+chocolates;
		  System.out.println("Total eaten chocolates "+eaten); 
		  }

	private void task2() {
		// Matrix 9x9 task
		int[][] a = new int[9][9];
	    int no = 5;
	    int MinRow = 0,MaxRow = 8,
	        MinCol = 0,MaxCol = 8;
	    
	    while(no>=1) {
//	    	1 2 3 4 (up)
	      for(int col = MinCol ;col<=MaxRow;col++)
	      {
	        a[MinRow][col] = no;
	        
	      }MinRow++;
	      
//	      5 6 7 (right hand)
	      for(int row = MinRow;row<=MaxRow;row++)
	      {
	        a[row][MaxCol] = no;
	      }MaxCol--;
	      
//	      8 9 10 (bottom)
	      for(int col = MaxCol;col>=MinCol;col--)
	      {
	        a[MaxRow][col] = no;
	      }MaxRow--;
	      
//	      11 12 (left hand)
	      for(int row = MaxRow;row>=MinRow;row--)
	      {
	        a[row][MinCol] =no;
	      }MinCol++;
	      no--;
	  }
	    
	    for(int row=0; row<=8; row++)
	          {
	            for(int col=0; col<=8; col++)
	            {
	              System.out.print(a[row][col]+"  ");
	            }
	            System.out.println();
	          }
		
		
	}

	private void Task1() {
		// TODO Auto-generated method stub
		  int eaten=6;
		    int cover=eaten;
		    int balance_cover=0;
		    int chocolates=0;
		    while(cover>=2)
		    {
		    chocolates=cover/3;
		    balance_cover=balance_cover+cover%3;
		    //System.out.println(balance_cover);
		    //System.out.println(chocolates);
		    cover=chocolates;
		    eaten=eaten+chocolates;
		    //System.out.println(cover);
		    //System.out.println(eaten);
		    
		    }
		    //System.out.println(eaten);
		  balance_cover=balance_cover+cover;
		  chocolates=balance_cover/3;
		  eaten=eaten+chocolates;
		  System.out.println("Total eaten chocolates "+eaten);
		  
		  
	}

}
