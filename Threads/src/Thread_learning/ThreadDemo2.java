package Thread_learning;

public class ThreadDemo2 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		ThreadChild2 tc = new ThreadChild2(); 
	    tc.start();
	    tc.join();
	    for(int no=1; no<=5; no++)
	    {
	      System.out.println("TD");
	    }

	}

}
