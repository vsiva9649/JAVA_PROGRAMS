package Array_Programs;

public class Towards_left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		15) Moving all elements towards left in a given array
//		16) Moving all elements towards left twice in a given array 
		
		
		Towards_left tl = new Towards_left();
		
		int[] ar= {10,20,30,40,50};
//				   20,30,40,50,10
		
//		tl.Moving_All_Element_Towards_Left(ar);
		tl.Moving_All_Element_Towards_Left_Twice(ar);

	
	}
		
		

	private void Moving_All_Element_Towards_Left_Twice(int ar[]) {
		// TODO Auto-generated method stub
		for(int j=0;j<=2;j++) {
		
		int i=0;
		int temp = ar[i];
		for(;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
			System.out.print(ar[i]+" ");
		}
		ar[i]=temp;
		System.out.println(ar[i]+" ");
		
		
		}
		
	}



	private void Moving_All_Element_Towards_Left(int[] ar) {
		// TODO Auto-generated method stub
		
		//		 //   10,20,30,40,50= 20,30,40,50,10
		
		int i=0;//0	
		int temp=ar[i];//a[0]  //temp=10
		while(i<ar.length-1) { //0<4,1<4,2<4,3<4,4<4
			ar[i]=ar[i+1]; //ar[0](10)= ar[0+1],ar[1]=ar[1+1],ar[2]=ar[2+1],ar[3]=ar[3+1]
		//	ar[0]=20,a[1]=30,a[2]=40,a[3]=50
			System.out.print(ar[i]+" ");//20,30,40,50,
			i++;
		}
		ar[i]=temp;//||52line= a[4]=10
		System.out.println(ar[i]+" "); //20,30,40,50,10
		
	
		
	}

}
