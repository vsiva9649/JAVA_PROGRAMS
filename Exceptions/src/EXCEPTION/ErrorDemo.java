package EXCEPTION;

public class ErrorDemo {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, Exception {
		// TODO Auto-generated method stub
		int[] marks = {100,90,97, 96, 92};
		display(marks);

		  }

	public static void display(int[] ar)
	throws ArrayIndexOutOfBoundsException,
	Exception{
			    int total = 0; 
			    for(int i=0; i<5;i++)
			    {
			      total = total + ar[i];
			    }
			    
			  System.out.println("total "+ total);
			  }
}