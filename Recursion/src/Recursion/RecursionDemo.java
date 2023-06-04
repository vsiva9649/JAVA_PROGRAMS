package Recursion;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionDemo rd = new RecursionDemo();
		rd.Display(10);

	}

	private void Display(int no) {
		// TODO Auto-generated method stub
		System.out.println(no);
		no=no+10;
		if(no<=50) {
		Display(no);
		}
	}

}
