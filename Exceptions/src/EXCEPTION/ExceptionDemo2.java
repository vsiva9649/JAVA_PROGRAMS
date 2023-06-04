package EXCEPTION;

public class ExceptionDemo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] marks = {98,95,100,94};
		try {
		ErrorDemo.display(marks);
		}
		catch(ArrayIndexOutOfBoundsException aa)
		{
		  System.out.println("Check array ");
		}
	}
}
