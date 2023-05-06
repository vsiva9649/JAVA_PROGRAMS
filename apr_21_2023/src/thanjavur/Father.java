package thanjavur;

public class Father {
	
	private int amount= 100000000;
	int age =75;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAmount1() {
		return amount1;
	}
	public void setAmount1(int amount1) {
		this.amount1 = amount1;
	}
	private int amount1=1234;
	
	
	
	void yield() {
		System.out.println("Yield paddy");
	}
	protected void share_assets() {
		System.out.println("Sharing Assets");
	}

}
