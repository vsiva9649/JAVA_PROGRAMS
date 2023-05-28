package Pattern_sample;

public class patterns_20_05_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patterns_20_05_23 p = new patterns_20_05_23();
//		p.pattern1();
//		p.pattern2();
//		p.pattern3();
//		p.pattern4();
//		p.pattern5();
		p.pattern6();

	}

	private void pattern6() {
		// TODO Auto-generated method stub
		for(int last = 1; last<=5; last++)
	    {
	        for(int no = 1; no<=last; no++) // 1
	        {
	        System.out.print(no+" "); 
	        }
	        System.out.println();
	    }
		
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		for(int no = 5; no>=1; no--)
	    {
	        for(int star = 1; star<no; star++)
	        {   System.out.print("  ");     }
	        for(int num=1;num<=6-no;num++) {//one line
	        	System.out.print(no+"   ");
	        }
	        System.out.println(); 
	    }
		
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		 for(int no = 5; no>=1; no--)
		    {
		        for(int star = 1; star<no; star++)
		        {   System.out.print("* ");     }
		        for(int num=1;num<=6-no;num++) {//one line
		        	System.out.print(1+" ");
		        }
		        System.out.println(); 
		    }
		
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		 for(int no = 5; no>=1; no--)
		    {
		        for(int star = 1; star<no; star++)
		        {   System.out.print("* ");     }
		        for(int num=1;num<=5;num++) {//one line
		        	System.out.print(1+" ");
		        }
		        System.out.println(); 
		    }
		
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		 for(int no = 5; no>=1; no--)
		    {
		        for(int star = 1; star<no; star++)
		        {   System.out.print("* ");     }
		        System.out.print(1);
		        System.out.println(); 
		    }
		
	}

	private void pattern1() {
		/** TODO Auto-generated method stub
*	*	*	*
*   *   *
*   *
*   
  

		 */
		
		 for(int no = 5; no>=1; no--)
		    {
		        for(int star = 1; star<no; star++)
		        {   System.out.print("* ");     }
		        System.out.println(); 
		    }
		
	}

}
