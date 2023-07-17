package Thread_learning;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// thread Practice
		ThreadChild tc = new ThreadChild();
	    System.out.println(tc.getId()); 
	    System.out.println(tc.getName()); 
	    System.out.println(tc.getPriority());
	    System.out.println(tc.isDaemon());
	    System.out.println(tc.isAlive());
	    tc.setName("siva");
	    System.out.println(tc.getName()); 
	    tc.setPriority(10);
	    System.out.println(tc.getPriority());
	    tc.start();
	    ThreadChild tc1 = new ThreadChild(); 
	    tc1.start();
	    for(int no=1; no<=5; no++)
	    {
	      System.out.println("ThreadDemo "+ no);
	    }

	}

}
