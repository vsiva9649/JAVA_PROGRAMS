package Array_Programs;

public class Addition_of_odd_Index_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		14) Finding addition of odd index numbers in a given array
		
		int arr[]= {10,20,30,40,50};
		Addition_of_odd_Index_Array ad = new Addition_of_odd_Index_Array();
		ad.FindEvenIndex(arr);
//		ad.AdditionOddIndex(arr);
		
		
		
		}

	

	private void AdditionOddIndex(int[] arr) {
		// TODO Auto-generated method stub
		int total=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				
				System.out.println(arr[i]);
				total=total+arr[i];//0+20=20,20+40=60
			}
		}
		System.out.println(total);
		
		
	}



	private void FindEvenIndex(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
			System.out.println(arr[i]);
			}
		}
		
	}
		
	

}
