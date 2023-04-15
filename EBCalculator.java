class EBCalculator
{
	public static void main(String[] args)
	{
	EBCalculator reader = new EBCalculator();
	int bill = reader.calculate_units();
	System.out.println("one\t"+bill);
		 int amount = 500;
		// int balance = amount-bill;
		// System.out.println(balance);

		reader.pay(amount , bill);
	}
	private void pay(int cost, int b) {
		System.out.println("two\t"+(cost-b));
	}
	int calculate_units()
	{
		int units = 150;
        int price = 2;
        System.out.println("three\t"+(units*price));
		return units*price;
		// System.out.println("hello");

	}
}
