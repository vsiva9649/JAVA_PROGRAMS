package InterFace_Learning;

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lamda Expression demo
		/**
		Functional_Interface_Demo id =  () ->
	      {
	      System.out.println("Hi Siva"); 
	      };
	      
	      id.add();
	      */
//		Functional_Interface_Demo fid =  (a,b) ->
//	      {
//	      System.out.println(a+b); 
//	      };
//	      int a = 10, b = 20; 
//	      fid.add(a,b);
		Functional_Interface_Demo fid =  (a,b) ->
	      {
	      //System.out.println(a+b); 
	      return a+b;
	      };
	      //int a = 10, b = 20; 
	      int result = fid.add(100,200);
	      System.out.println(result);

	}

}
