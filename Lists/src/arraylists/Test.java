package arraylists;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = display();
		System.out.println(no);
	}
	private static int display() {
	    // TODO Auto-generated method stub
	    try
	    {
//	      System.exit(0);
	      return 100;
	    }
	    catch(Exception e)
	    {
	      return 10; 
	    }
	    finally
	    {
	      System.out.println("hi");
	    }
	  }

}
