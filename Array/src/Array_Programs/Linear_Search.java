package Array_Programs;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 4) Linear Search
		Linear_Search ls = new Linear_Search();
		
		int[] a1= {10,20,30,40,50,70,90};
		int key=20;
		System.out.println(key+" is found at index : "+LinearSearch(a1,key));

	}

	private static int LinearSearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
