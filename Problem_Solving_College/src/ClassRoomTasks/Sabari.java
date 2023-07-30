package ClassRoomTasks;

public class Sabari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sabari s = new Sabari();
		s.neon();

	}

	private void neon() {
		// TODO Auto-generated  stub
//		9 ^2= 81; 8+1=9
		int no=10;
		int sum=0;
		
		int sqr=no*no;//100 10
		while(sqr>0) {//100>0 10>0
		sum=sum+(sqr%10);//0+(100%10) 0+(10%10) 0+(1%10)
		sqr=sqr/10;//100/10 10
	}
//		System.out.println(sum)`;
		if(no==sum) {
			System.out.println("neon no");
		}
		else {
			System.out.println("not a neon ");
		}
	}	
	

}
