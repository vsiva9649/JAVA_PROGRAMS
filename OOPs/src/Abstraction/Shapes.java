package Abstraction;

public abstract class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shapes square = new Shapes();
//		Shapes rectangle = new Shapes();
//		Shapes cone=new Shapes();
//		Shapes circle = new Shapes();
////		
//		square.calculate_area(4);
//		rectangle.calculate_area(40,30);
		

	}
	abstract void calculate_area();



	 void calculate_area(int l, int b) {
		// TODO Auto-generated method stub
		System.out.println(l*b);
	}



	 void calculate_area(int a) {
		// TODO Auto-generated method stub
		System.out.println(a*a);
		
	}

}
