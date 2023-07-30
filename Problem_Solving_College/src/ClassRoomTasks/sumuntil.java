package ClassRoomTasks;

public class sumuntil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumuntil su = new sumuntil();
		su.suma(10);

	}

	private void suma(int no) {
		// TODO Auto-generated method stub
		int sum =0;
		while(no>0)
		{
			sum=sum+(no%10);
			no/=10;
		
		}
		if(sum>9)
		{
			suma(sum);
			
			}
		else
		{
			System.out.println(sum);
		}
		}

}
