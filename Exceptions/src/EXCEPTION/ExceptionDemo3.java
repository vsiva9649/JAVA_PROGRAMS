package EXCEPTION;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo3 ee = new ExceptionDemo3();
		
//		ee.div();
		
		LowAttendanceException le= new LowAttendanceException();
		le.allowForExams(7);

	}

	

	private void div() {
		// TODO Auto-generated method stub
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		System.out.println("Hi");
	}
	
	

}
