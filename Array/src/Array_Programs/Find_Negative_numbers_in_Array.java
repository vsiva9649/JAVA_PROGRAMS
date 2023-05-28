package Array_Programs;

public class Find_Negative_numbers_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		22) Finding only negative numbers in given array
//		23) Copying only the negative numbers in given array - to another array
		int[] a= {10,-20,30,-40,50};///mixed
		
		Find_Negative_numbers_in_Array nn = new Find_Negative_numbers_in_Array();
		
//		nn.Finding_negative_numbers_array(a);
		nn.Copying_negative_numbers_another_array_(a);
		
	}


	private void Copying_negative_numbers_another_array_(int[] a) {
		// TODO Auto-generated method stub
//		int[] a= {10,-20,30,-40,50};///mixed

		int count=0;
		int j=0;//2
		int[] b=new int[a[j]];//

		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {//-20<0,-40<0
				System.out.println(a[i]);//-20,-40
				count++; //c=1,c=2
				b[j]=a[i]; //j-0=>-20,j-1=>-40
				j++;
			}
		}
		System.out.println( "'B' new Array : ");
		for(j=0;j<count;j++) {//j<2
		System.out.println(b[j]);
		}
	}

		
		
	


	private void Finding_negative_numbers_array(int[] a) {
		// TODO Auto-generated method stub
//		int[] a= {10,-20,30,-40,50};///mixed
		
		int count=0;//
		for(int i=0;i<a.length;i++) {//0=10,1=-20,2=30,3=-40,4=50
			if(a[i]<0) { //10<0,-20<0,30<0,-40<0,50<0
				System.out.println(a[i]);//-20,-40
				count++; //c=1,c=2
			}
		}
		System.out.println("count value is : "+count);
	}

}
