package oops_learning;

public class Gpay {

	int pwd = 1234;
	private void pay() {
System.out.println("paying through gpay");
	}
	
	public static void main(String [] args) {
		Gpay gp = new Gpay();
		System.out.println(gp.pwd);
		gp.pay();
	}
	
}
