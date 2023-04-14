class EBCalculator
{
	public static void main(String[] args)
	{
	EBCalculator reader = new EBCalculator();
		reader.calculate_units();
		reader.add();
	}
	void calculate_units()
	{
		int units = 150;
        int price = 2;
        System.out.println(units*price);
	}
	void add()
	{
		System.out.println(10+20);
		
	}
}
