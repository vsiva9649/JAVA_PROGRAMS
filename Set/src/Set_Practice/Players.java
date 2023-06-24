package Set_Practice;

public class Players implements Comparable
 {
	int score;
	String name;
	public Players(int score) {
		this.score=score;
//		System.out.println(score);
	}
	public Players(String name,int score) {
		this.score=score;
		this.name=name;
//		System.out.println(score);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players mahi = new Players(199);
		Players virat = new Players(99);
		Players rohit = new Players(200);
		Players sing = new Players(100);

	}
	public String toString()
	  {
	    return this.name+" "+this.score;
	  }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
