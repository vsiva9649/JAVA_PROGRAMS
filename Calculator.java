class Calculator
{
	int a ;
	int b ;
	
	void multiply(int no1,int no2)
	{
		System.out.println(no1*no2);
	}
	public static void main(String[] args)
	{
 	Calculator calc=new Calculator();
	calc.add();
	calc.sub();
	calc.multiply(10,"siva");
	calc.div();
	}
	private void multiply(int no1, String string) {
	}
	private void multiply(int no1) {
	}
	void div() {
		a = 40;
		b = 4;
		System.out.println(a/b);
	}
	void add() {
	System.out.println(10+20);
	}
	void sub() {
		System.out.println(20-10);
	}
}