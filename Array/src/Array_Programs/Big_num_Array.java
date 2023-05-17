package Array_Programs;

public class Big_num_Array {

//	 9) Finding biggest no. in given array            
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {10,78,99,99,92};
		int highest=marks[0];
		for(int i=1;i<marks.length;i++) {
			if(marks[i]>highest) {
				highest=marks[i];
			}
		}
		System.out.println("Highest values is : "+highest);
	}

}
