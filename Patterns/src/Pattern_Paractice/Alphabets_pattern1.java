package Pattern_Paractice;

public class Alphabets_pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabets_pattern1 p = new Alphabets_pattern1();
//		p.pattern_A();
//		p.pattern_B();
//		p.pattern_C();
//		p.pattern_D();
//		p.pattern_E();
//		p.pattern_F();
//		p.pattern_G();//pending
//		p.pattern_H();
//		p.pattern_I();
//		p.pattern_J();
//		p.pattern_K();
//		p.pattern_L();
//		p.pattern_M();
//		p.pattern_N();
//		p.pattern_O();
//		p.pattern_P();
//		p.pattern_Q();//pen
//		p.pattern_R();//pen
//		p.pattern_S();
//		p.pattern_T();
//		p.pattern_U();
//		p.pattern_V();
//		p.pattern_W();//pen
//		p.pattern_X();
//		p.pattern_Y();
//		p.pattern_Z();

	}


		private void pattern_K() {
		// TODO Auto-generated method stub
			for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
                if (col == 1 || row == col || row == 1 && col == 9/2) 
                	//1==1||1==1||1==1|1==4
				{
				System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
			}
		
	}


		private void pattern_N() {
		// TODO Auto-generated method stub
			int no1=0,no2=0;
			for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
				if(col==1 || col==9 || (col==no1) && row<=9)
				{
				System.out.print("* ");}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			if(row==1) {
				no1=1;
			}
			no1++;
			}
		
	}


		private void pattern_M() {
		// TODO Auto-generated method stub
			int no1=0,no2=0;
			for(int row=1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
				if(col==1 || col==9 || (col==no1 || col==no2) && row<=10/2)
				{
				System.out.print("* ");}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			if(row==1) {
				no1=1;
				no2=9;
			}
			no1++;
			no2--;
			}
			
		
	}


		private void pattern_V() {
		// TODO Auto-generated method stub
			for(int i=1;i<=9;i++) {
				if(i<=5) {
				for(int j=1;j<=9;j++) {
					if(j==i|| j==10-i) {
					System.out.print("* ");}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
				}
			}
		
	}


		private void pattern_X() {
		// TODO Auto-generated method stub
			for(int i=1;i<=9;i++) {
				if(i<=9) {
				for(int j=1;j<=9;j++) {
					if(j==i|| j==10-i) {
					System.out.print("* ");}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
				}else {
					for(int k=1;k<=4;k++) {
						System.out.print("  ");
					}
					System.out.println("*  ");
				}
				
			}
		
	}


		private void pattern_Y() {
		// TODO Auto-generated method stub
			for(int i=1;i<=9;i++) {
				if(i<=5) {
				for(int j=1;j<=9;j++) {
					if(j==i|| j==10-i) {
					System.out.print("* ");}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
				}else {
					for(int k=1;k<=4;k++) {
						System.out.print("  ");
					}
					System.out.println("*  ");
				}
				
			}
		
	}


		private void pattern_U() {
		// TODO Auto-generated method stub
			 for(int star=1; star<=9; star++)
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


		private void pattern_S() {
		// TODO Auto-generated method stub
			for(int col=1; col<=7; col++)
		      {
				if(col==1) {
					System.out.print(" ");
				}
		          System.out.print("* "); 
		      }
		    System.out.println();
			 for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      System.out.println();
		      }
			 for(int col=1; col<=7; col++)
		      {
				 if(col==1) {
						System.out.print(" ");
					}
		          System.out.print("* "); 
		      }
		    System.out.println();
		    for(int star=1; star<=7; star++)
		      {
		      for(int space=1; space<=7;space++)
		        {
		        System.out.print("  ");
		        }
		      System.out.println("*"); 
		      }
		    for(int col=1; col<=7; col++)
		      {
				if(col==1) {
					System.out.print(" ");
				}
		          System.out.print("* "); 
		      }
		   
		
	}


		private void pattern_P() {
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
		  for(int i=1;i<=7;i++) {
			  System.out.println("* ");
		  }
	}


		private void pattern_O() {
		// TODO Auto-generated method stub
			for(int col=1; col<=7; col++)
		      {
		      if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		    System.out.println();
		  for(int star=1; star<=9; star++)
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


		private void pattern_L() {
		// TODO Auto-generated method stub
			for (int i=1;i<9;i++) {
			System.out.println("* ");
			}
			for(int j=1;j<=9;j++) {
			 
				System.out.print("* ");
				
			}
		
	}


		private void pattern_J() {
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
		for(int star=1; star<=5; star++)
	    {
	    System.out.print("*"+" ");
	    }
	System.out.println();
		
	}


		private void pattern_I() {
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
		for(int star=1; star<=9; star++)
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


		private void pattern_G() {
		// TODO Auto-generated method stub
			for(int col=1; col<=7; col++)
		      {
				if(col==1) {
					System.out.print(" ");
				}
		          System.out.print("* "); 
		      }
		    System.out.println();
			 for(int star=1; star<=7; star++)
		      {
				 if(star<=4) {
		      System.out.print("* ");
				 }
				 else {
					 System.out.print(" ");
				 }
				 System.out.print("* ");
					 
		      System.out.println();
		      }
			 for(int col=1; col<=7; col++)
		      {
				 if(col==1) {
						System.out.print(" ");
					}
		          System.out.print("* "); 
		      }
		    System.out.println();
			
	}


		private void pattern_D() {
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
		      System.out.print("* "); 
		      System.out.println();
		      }
			 for(int col=1; col<=7; col++)
		      {
		          System.out.print("* "); 
		      }
		    System.out.println();
		    for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      System.out.println();
		      }
		    for(int col=1; col<=7; col++)
		      {
				
		          System.out.print("* "); 
		      }
		
	}


		private void pattern_H() {
		// TODO Auto-generated method stub
			
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
			 
		
	}


		private void pattern_F() {
		// TODO Auto-generated method stub
			for(int col=1; col<=7; col++)
		      {
				
		          System.out.print("* "); 
		      }
		    System.out.println();
			 for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      System.out.println();
		      }
			 for(int col=1; col<=7; col++)
		      {
		          System.out.print("* "); 
		      }
		    System.out.println();
		    for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      System.out.println();
		      }
		
	}


		private void pattern_C() {
		// TODO Auto-generated method stub
			for(int col=1; col<=7; col++)
		      {
				if(col==1) {
					System.out.print(" ");
				}
		          System.out.print("* "); 
		      }
		    System.out.println();
			 for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      System.out.println();
		      }
			 for(int col=1; col<=7; col++)
		      {
				 if(col==1) {
						System.out.print(" ");
					}
		          System.out.print("* "); 
		      }
		    System.out.println();
		
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


		private void pattern_A() {
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
		      System.out.println("* "); 
		      }
		  for(int col=1; col<=8; col++)
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

}
