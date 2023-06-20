package FriendsTask;
import java.util.Scanner;

public class FriendlyTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FriendlyTask f=new FriendlyTask();
		f.Task1();

	}

	public void Task1() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		//read string
		sc.nextLine();
		String S=sc.nextLine();
		System.out.println(N*2);
		System.out.println(S);
		
	}

}
