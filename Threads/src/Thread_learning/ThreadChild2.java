package Thread_learning;

public class ThreadChild2 extends Thread {
	public void run()
	  {
	    try {
	      Thread.sleep(5000);
	    } catch (InterruptedException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    for(int no=1; no<=5; no++)
	    {
	      System.out.println(no);
	    }
	  }

}
