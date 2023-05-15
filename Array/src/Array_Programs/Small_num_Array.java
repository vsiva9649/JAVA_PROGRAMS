package Array_Programs;

public class Small_num_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks= {100,78,89,99,92};
		int smallest=marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<smallest)
			{
				smallest=marks[i];
			}
		}
		
		System.out.println("Smallest number is : "+smallest);

	}

}
