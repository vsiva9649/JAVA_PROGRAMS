package Abstraction;

public class ShapesChild extends Shapes
{

	@Override
	void calculate_area() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}
public static void main(String[] args) {
	ShapesChild sc = new ShapesChild();
	sc.calculate_area(10, 20);
	sc.calculate_area();
	sc.calculate_area(10);
}
}
