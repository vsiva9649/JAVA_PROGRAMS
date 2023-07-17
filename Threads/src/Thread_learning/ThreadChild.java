package Thread_learning;

public class ThreadChild extends Thread{
	public void run()
	  {
	    for(int no=1; no<=5; no++)
	    {
	      System.out.println("ThreadChild "+ no);
	    }
	  }

}
