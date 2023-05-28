package Array_Programs;

public class Towards_Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		17) Moving all elements towards right in a given array
//		18) Moving all elements towards right twice in a given array  
		
		Towards_Right tr = new Towards_Right();
		
		int[] a= {10,20,30,40,50};
		//		  50,10,20,30,40
		
		
//		tr.Moving_All_Elements_Towards_Right(a);
		tr.Moving_All_Elements_Towards_Right_Twice(a);


	}

	private void Moving_All_Elements_Towards_Right_Twice(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("Before Right Shift");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
		for(int k=0;k<2;k++) {//right shift 3 times
		int i=a.length-1;//i value 4
		int temp=a[i];//temp=a[4]=>50
		for(;i>0;i--) {//4>0,3>0,2>0,1>0,(0>0)i=0
			a[i]=a[i-1];//a[4]=a[4-1],a[3]=a[3-1],a[2]=a[2-1],a[1]=a[1-1]
			//a[4]=40,a[3]=30,a[2]=20,a[1]=10,
		}
		a[i]=temp;//a[0]=50
		System.out.println();
		System.out.println("After Right Shift");
		for(int j=0;j<a.length;j++) {
		System.out.print(a[j]+" ");
		// 50,10,20,30,40
		// 40,50,10,20,30
		// 30,40,50,10,20
		}
		
		}
		
		
	}

	private void Moving_All_Elements_Towards_Right(int[] a) {
		// TODO Auto-generated method stub
//		int[] a= {10,20,30,40,50};input

		System.out.println("Before right shift");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
		int i=a.length-1;//5-1=4, i value is 4
		int temp=a[i];//temp-[4]=>50
		while(i>0) { //4>0,3>0,2>0,1>0,(0>0x)
			a[i]=a[i-1];//a[4]=a[4-1]=>40,a[3]=a[3-1]=>30,a[2]=a[2-1]=>20,a[1]=a[1-1]=>10
	//result: a[4]=40,a[3]=30,a[2]=20,a[1]=10
//			System.out.println(a[i]);
			i--;
		}
		a[i]=temp;//i value is 0 |59 line| temp value is 50|58 line|;a[0]=50  
		System.out.println();
		System.out.println("After Shifting");
		for(int j=0;j<a.length;j++) {
		System.out.print(a[j]+" "); 
		// 50,10,20,30,40
		}
		
	}

}
