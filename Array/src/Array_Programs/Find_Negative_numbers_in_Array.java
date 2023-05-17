package Array_Programs;

public class Find_Negative_numbers_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,-20,30,-40,50};
		
		Find_Negative_numbers_in_Array nn = new Find_Negative_numbers_in_Array();
		
//		nn.Finding_negative_numbers_array(a);
//		nn.Copying_negative_numbers_another_array_(a);
		
	}


	private void Copying_negative_numbers_another_array_(int[] a) {
		// TODO Auto-generated method stub
		int count=0;
		int j=0;
		int[] b=new int[a[j]];

		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				System.out.println(a[i]);
				count++;
				b[j]=a[i];
				j++;
			}
		}
		System.out.println( "new Array : ");
		for(j=0;j<count;j++) {

		System.out.println(b[j]);
		}
	}

		
		
	


	private void Finding_negative_numbers_array(int[] a) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				System.out.println(a[i]);
				count++;
			}
		}
		System.out.println("count value is : "+count);
	}

}
