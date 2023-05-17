package Array_Programs;

public class Addition_of_2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		20) Addition of two integer arrays                                              ?
				
		int[]a = {10,20,30};
		  int[]b = {40,50,60,70};
		  int big = a.length>b.length?a.length:b.length;
		  int small = a.length<b.length?a.length:b.length;
		  int []c = new int [big];
		  int i =0;
		  while(i<c.length)
		  {
		    if(i<small) 
		    {
		      c[i]=a[i]+b[i];//c = 10+40,
		    
		    }
		    else {
		      c[i]=b[i];
		    }
		    
		    System.out.println(c[i]);
		    i++;
		  }
		 
		
	}

}
