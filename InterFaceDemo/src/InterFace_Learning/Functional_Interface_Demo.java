package InterFace_Learning;

@FunctionalInterface
public interface Functional_Interface_Demo {

	default void display()
	  {
	    System.out.println("Displaying");
	  }
	  default void display2()
	  {
	    System.out.println("Displaying");
	  }
	  abstract int add(int a, int b); 
	  
	  static void test() {
	    System.out.println("Testing"); 
	  }
	  static void test2() {
	    System.out.println("Testing"); 
	  }
}
