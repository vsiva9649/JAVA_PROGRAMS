package Array_Programs;

public class Second_small_num_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {92, 78, 89, 99,96};
		
//		12) Finding first two smallest numbers in a given array
		
		Second_small_num_Array sm = new Second_small_num_Array();
		sm.Find_Second_small(marks);

	}
	
	 private void Find_Second_small(int[] marks) {
		// TODO Auto-generated method stub
//		    find first two small no. in given array

		int small=Integer.MAX_VALUE,ssmall=Integer.MAX_VALUE;

//		int[] marks = {92, 78, 89, 99,96};
		

		for(int i=0;i<marks.length;i++)//o-92,1-78,2-89,3-99,4-96
		{
		if(marks[i]<small)//92<2147483647,78<92,89<78,99<78,96<78
		{
		ssmall = small;  //ss=2147483647,ss=92,ss=89
		small = marks[i];//s=92,s=78,s=78
		}
		else if(marks[i]<ssmall) //89<92,99<89,96<89
		{
		ssmall = marks[i];//ss=89,
		}
		
		}
		System.out.println("smallest is "+small); 
		System.out.println("Second smallest is "+ssmall);
		
		
	}

	

}
