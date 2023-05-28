package Pattern_sample;



public class pattern21_05_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern21_05_23 p = new pattern21_05_23();
		
		p.pattern1();
//		p.pattern2();

	}

	private void pattern2() {
		// TODO Auto-generated method stub
		for(int row = 5; row>=1; row--)
	    {
	        for(int star =1; star<row; star++)
	        {
	        System.out.print("  ");
	        }
	        for(int no = 5; no>=row; no--)
	        {
	        System.out.print(no+" "); 
	        }  
	        System.out.println(); 
	    }
		
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int row =1; row<=5; row++)
	    {
	    for(int star=1; star<=5-row;star++)
	      {
	      System.out.print("  "); 
	      }
	    for(int num=5; num>=6-row; num--)
	    {
	      System.out.print(num+" "); 
	    }
	    System.out.println(); 
	    }
		
	}

}
