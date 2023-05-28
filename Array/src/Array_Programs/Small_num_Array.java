package Array_Programs;

public class Small_num_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		10) Finding smallest no. in given array
		
		int[] marks= {100,78,89,99,92};
		int smallest=marks[0];// s=100
		for(int i=0;i<marks.length;i++) { //0,1,2,3,4
			if(marks[i]<smallest)//100<100,78<100,89<78,99<78,92<78
			{
				smallest=marks[i];//s=78,
			}
		}
		
		System.out.println("Smallest number is : "+smallest);

	}

}
