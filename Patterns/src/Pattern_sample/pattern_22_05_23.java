package Pattern_sample;

public class pattern_22_05_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pattern_22_05_23 p = new pattern_22_05_23();
		p.pattern1();
//		p.pattern2();
//		p.pattern_c();
//		p.pattern_E();
//		p.pattern_o();
//		p.pattern_8();
//		p.pattern_B();
//		p.pattern_T();
//		p.pattern_Z();
//		p.pattern_R();

	}

	private void pattern_R() {
		// TODO Auto-generated method stub
		for(int col=1; col<=8; col++)
        {
    if(col==8)
        System.out.print("  "); 
        else
            System.out.print("* "); 
        }
      System.out.println();
    for(int star=1; star<=7; star++)
        {
        System.out.print("* "); 
        for(int space=1; space<=6;space++)
          {
          System.out.print("  ");
          }
  System.out.println("*"); 
        }
  
    for(int col=1; col<=8; col++)
        {
     if(col==8)
       System.out.print("  "); 
    else
            System.out.print("* "); 
        }
      System.out.println();
      int no1=2;
      for(int row=1;row<=8;row++)
      {
        for(int col=1;col<=9;col++)
        {
          if((col==1)|| (col==no1))
              {
            System.out.print("*  ");
              }
          else
            System.out.print(" ");
        }
        System.out.println();
        no1++;
      }
	}

	private void pattern_Z() {
		// TODO Auto-generated method stub
		int num=1;
		for(int col=1; col<=9; col++)
	    {
	    System.out.print("*"+" ");
	    }
	System.out.println(); 
	for(int star=1; star<=7; star++)
	    {
	    for(int space=1; space<9-num; space++)
	        {
	        System.out.print("  ");
	        }
	    System.out.println("*"); 
	    num++;
	    
	}
	for(int col=1; col<=9; col++)
    {
    System.out.print("*"+" ");
    }
System.out.println(); 
	}

	private void pattern_T() {
		// TODO Auto-generated method stub
		for(int star=1; star<=9; star++)
	    {
	    System.out.print("*"+" ");
	    }
	System.out.println(); 
	for(int star=1; star<=7; star++)
	    {
	    for(int space=1; space<=4; space++)
	        {
	        System.out.print("  ");
	        }
	    System.out.println("*"); 
	}
		
	}

	private void pattern_B() {
		// TODO Auto-generated method stub
		  for(int col=1; col<=7; col++)
	      {
	    
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	     
	          System.out.print("* "); 
	      }
	    System.out.println();
	    for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	    for(int col=1; col<=7; col++)
	      {
	      
	          System.out.print("* "); 
	      }
		
	}

	private void pattern_8() {
		// TODO Auto-generated method stub
		  for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	    for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	    for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
		
	}

	private void pattern_o() {
		// TODO Auto-generated method stub
	    for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
		
	}

	private void pattern_c() {
		// TODO Auto-generated method stub
		   for(int col=1; col<=7; col++)
		      {
		      if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		    System.out.println();
		  for(int star=1; star<=7; star++)
		      {
		      System.out.println("* "); 
		      }
		  for(int col=1; col<=7; col++)
		      {
		       if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		
	}

	private void pattern_E() {
		// TODO Auto-generated method stub
		 for(int col=1; col<=7; col++)
	      {
	     
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	     
	          System.out.print("* "); 
	      }
	  ///my own try
	  
    System.out.println();
  for(int star=1; star<=7; star++)
      {
      System.out.println("* "); 
      }
  for(int col=1; col<=7; col++)
      {
          System.out.print("* "); 
      }
		
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		int num=1;
		for(int row = 5; row>=1; row--)
	    {
	      for(int star=1; star<=5-row; star++)
	        {
	        System.out.print("\t");
	        }
	    for(int col=1; col<=row; ++col)
	        {
	        System.out.print(num+"\t");
	        num++;
	        }
	    System.out.println(); 
	    }
		
	}

	private void pattern1() {
		/* TODO Auto-generated method stub
		 * patter sample 1
		 1 2 3 4 5
		 * 1 2 3 4
		 * * 1 2 3
		 * * * 1 2
		 * * * * 1
		 
		 */
	    for(int row = 5; row>=1; row--)
	    {
	      for(int star=1; star<=5-row; star++)
	        {
	        System.out.print("  ");
	        }
	    for(int col=1; col<=row; ++col)
	        {
	        System.out.print(col+" "); 
	        }
	    System.out.println(); 
	    }
	}

}
