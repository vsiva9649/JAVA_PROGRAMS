package InterviewPreparation;

public class Tasks {
/**
34) Printing 1 11 121                                           OK
35) Printing 1 8 27 64                                          OK
36) Printing 1 4 9 16 25 36 49 64 81 100 - HW                   OK
37) Printing 1 4 27 256 
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tasks t = new Tasks();
		t.Print1_11_121();
		t.Print1_8_27_64();
		t.Print1_4_9_16();
		t.Print1_4_27_256();

	}

private void Print1_4_27_256() {
	// 1^1=1, 2^2=4, 3^3=27,4^4=256
	for(int no=1;no<=4;no++) {
		System.out.print((int)(Math.pow(no, no))+" ");
	}
	System.out.println();
	
}

private void Print1_4_9_16() {
	// 1*1=>1, 2*2=>4, 3*3=>9,4*4=>16
	for(int no=1;no<=4;no++) {
		System.out.print((int)(Math.multiplyExact(no, no))+" ");
	}
	System.out.println();
	
}

private void Print1_8_27_64() {
	// 1*1*1=>1*1=>1
	// 2*2*2= 4*2=>8
	//3*3*3= 9*3=>27 , 16*4=>64
	
	for(int no=1;no<=4;no++) {
		System.out.print((int)Math.pow(no, 3)+" ");
	}
	System.out.println();
}

private void Print1_11_121() {
	// 1*11=>11, 11*11=>121,
	
	for(int no=1;no<=121;no*=11) {
		System.out.print(no+" ");
	}
	System.out.println();
}

}
