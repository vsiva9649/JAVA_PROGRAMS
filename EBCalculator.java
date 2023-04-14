class EBCalculator
{
	public static void main(String[] args)
	{
	EBCalculator reader = new EBCalculator();
	int bill = reader.calculate_units();
	System.out.println(bill);
		int amount = 500;
	}
	int calculate_units()
	{
		int units = 150;
        int price = 2;
        System.out.println(units*price);
		return units*price;
	

	}
	
}
