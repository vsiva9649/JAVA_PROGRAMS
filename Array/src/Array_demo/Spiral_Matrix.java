package Array_demo;

public class Spiral_Matrix {
public static void main(String[] args) {
	Spiral_Matrix sm=new Spiral_Matrix();
//	sm.OrderMatrix();
//	sm.UnOrderMatrix();
//	sm.MyUnderStanding4x4();
//	sm.MyUnderStanding5x5();
//    sm.Rev_MyUnderstand4x4();
//    sm.Rev_MyUnderstand5x5();
	
	
}

private void Rev_MyUnderstand5x5() {
	// TODO Auto-generated method stub
	int a[][] =new int[5][5];
	int minrow=0,maxrow=4,
	    mincol=0,maxcol=4;
	int no=1;
while(no<=25) {
	for(int col=maxcol;col>=mincol;col--) {
		a[minrow][col]=no;
		no++;
		
	}
	minrow++;
	for(int row=minrow;row<=maxrow;row++) {
		a[row][mincol]=no;
		no++;
	}
	mincol++;
	for(int col=mincol;col<=maxcol;col++) {
		a[maxrow][col]=no;
		no++;
	}
	maxrow--;
	for(int row=maxrow;row>=mincol;row--) {
		a[row][maxcol]=no;
		no++;
	}
	maxcol--;
}
	
	// print a array
			for(int row=0; row<=4; row++)
		    {
		      for(int col=0; col<=4; col++)
		      {
		        System.out.print(a[row][col]+"\t");
		      }
		      System.out.println();
		    }
	
}

private void Rev_MyUnderstand4x4() {
	// TODO Auto-generated method stub
	int a[][] =new int[4][4];
	int minrow=0,maxrow=3,
	    mincol=0,maxcol=3;
	int no=1;
while(no<=16) {
	for(int col=maxcol;col>=mincol;col--) {
		a[minrow][col]=no;
		no++;
		
	}
	minrow++;
	for(int row=minrow;row<=maxrow;row++) {
		a[row][mincol]=no;
		no++;
	}
	mincol++;
	for(int col=mincol;col<=maxcol;col++) {
		a[maxrow][col]=no;
		no++;
	}
	maxrow--;
	for(int row=maxrow;row>=mincol;row--) {
		a[row][maxcol]=no;
		no++;
	}
	maxcol--;
}
	
	// print a array
			for(int row=0; row<=3; row++)
		    {
		      for(int col=0; col<=3; col++)
		      {
		        System.out.print(a[row][col]+"\t");
		      }
		      System.out.println();
		    }
}

private void MyUnderStanding5x5() {
	// TODO Auto-generated method stub
	int a[][] =new int[5][5];
	int minrow=0,maxrow=4,
	    mincol=0,maxcol=4;
	int no=1;
while(no<=25) {
	for(int col=mincol;col<=maxcol;col++) {
		a[minrow][col]=no;
		no++;
	}
	minrow++;
	for(int row=minrow;row<=maxrow;row++) {
		a[row][maxcol]=no;
		no++;
	}
	maxcol--;
	for(int col=maxcol;col>=mincol;col--) {
		a[maxrow][col]=no;
		no++;
	}
	maxrow--;
	for(int row=maxrow;row>=minrow;row--) {
		a[row][mincol]=no;
		no++;
	}
	mincol++;
}
	
	// print a array
		for(int row=0; row<=4; row++)
	    {
	      for(int col=0; col<=4; col++)
	      {
	        System.out.print(a[row][col]+"\t");
	      }
	      System.out.println();
	    }
}

private void MyUnderStanding4x4() {
	// TODO Auto-generated method stub
	int[][] a=new int[4][4];
	
	int no=1;
	/*
	 * rows= row start
	 * rowe= row end
	 * cols= col start
	 * cole= col end
	 */
	int rows=0,rowe=3,
		cols=0,cole=3;
	while(no<=16) {
	for(int col=cols;col<=cole;col++) {
		a[rows][col]=no;
		no++;
	}
	rows++;
	for(int row=rows;row<=rowe;row++) {
		a[row][cole]=no;
		no++;
	}
	cole--;
	for(int col=cole;col>=cols;col--) {
		a[rowe][col]=no;
		no++;
	}
	rowe--;
	for(int row=rowe;row>=rows;row--) {
		a[row][cols]=no;
		no++;
	}
	cols++;
	//while end
		}
	// print a array
	for(int row=0; row<=3; row++)
    {
      for(int col=0; col<=3; col++)
      {
        System.out.print(a[row][col]+"\t");
      }
      System.out.println();
    }
	
	
}

private void UnOrderMatrix() {
	// TODO Auto-generated method stub
	int[][] a = new int[4][4];
    int no =1; 
    int minrow=0, maxrow=3, mincol=0, maxcol=3;
   
    
    for(int col=maxcol;col>=mincol;col--)
    {
    	a[mincol][col]=no;
    	no++;
    } mincol++;
    
    for(int row=mincol;row<=maxrow;row++)
    {
    	a[row][minrow]=no;
    	no++;
    }
    minrow++;
    for(int col=minrow;col<=maxcol;col++)
    {
    	a[maxcol][col]=no;
    	no++;
    }
	maxcol--;
	for(int col=maxcol;col>=mincol;col--)
	{
		a[col][maxrow]=no;
		no++;
	}
	for(int col=maxcol;col>=mincol;col--)
	{
		a[minrow][col]=no;
		no++;
	}
	for(int col=minrow;col<=maxcol;col++)
	{
		a[maxcol][col]=no;
		no++;
	} 
	
    
	for(int row=0;row<=3;row++)
	{
		for(int col=0;col<=3;col++)
		{
			System.out.print(a[row][col]+"\t");
		}
		System.out.println();
	}
    
	
}

private void OrderMatrix() {
	// TODO Auto-generated method stub
	int[][] a = new int[5][5];
    int no =1; 
    int minRow=0,minCol=0,
    	maxRow=4,maxCol=4;
    
    //1 2 3 4 
while(no<=25)
{
    for(int col=minCol; col<=maxCol; col++){
        a[minRow][col] = no; 
        no++;  
        } 
    minRow++; //minRow = 1

    // 5 6 7 
    for(int row=minRow; row<=maxRow; row++) {
        a[row][maxCol] = no; 
        no++; 
        } 
    maxCol--; //maxCol = 2; 

    //8 9 10 
    for(int col=maxCol;col>=minCol; col--){
    a[maxRow][col] = no; 
    no++; 
    } 
    maxRow--; 

    //11 12
    for(int row=maxRow; row>=minRow; row--){
        a[row][minCol] = no; no++; 
        }
    minCol++; 
   
}

    for(int row=0; row<=4; row++)
    {
      for(int col=0; col<=4; col++)
      {
        System.out.print(a[row][col]+"\t");
      }
      System.out.println();
    }
	
}
}
