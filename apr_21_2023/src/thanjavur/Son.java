package thanjavur;

public class Son extends Father {
	// int age = 45;

	public static void main(String[] args) {
		
		
		Son s = new Son();
// 		// s.share_assets();
	s.yield();
// 		// int father_amount = s.getAmount();
// 		System.out.println("before"+father_amount);
		
// 		s.setAmount(100);
		
// 		father_amount = s.getAmount();
// 		System.out.println("after"+father_amount);
		
// 		System.out.println(s.age);
// 		Father f = new Father();
// 		System.out.println(f.age);
// 		s.work();

 	}
	 	void work() {
 		System.out.println(this.age);
 		System.out.println(super.age);
 	}

 }
