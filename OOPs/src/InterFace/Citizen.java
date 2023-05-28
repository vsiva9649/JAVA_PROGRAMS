package InterFace;

public class Citizen extends Parent implements Govt,Zoho 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Citizen c1 = new Citizen();
		Citizen c2 = new Citizen();
		c1.change2000Rupees();
//		c1.displayAddressProof();
//		c1.watch_movie();
//		c2.displayIDProof();
		c2.wearHelmet();
		System.out.println(Govt.fine_for_helmet);
	    System.out.println(Citizen.last_date);
//	    Govt.fine_for_helmet=100;

	}
	public void watch_movie() {
		System.out.println("watching movies");
	}

	@Override
	public void change2000Rupees() {
		// TODO Auto-generated method stub
		System.out.println("changeing in Bank");
	}

	@Override
	public void displayIDProof() {
		// TODO Auto-generated method stub
		System.out.println("ADHARCARD");
	}

	@Override
	public void displayAddressProof() {
		// TODO Auto-generated method stub
		System.out.println("ration card");
		
	}

	@Override
	public void wearHelmet() {
		// TODO Auto-generated method stub
		System.out.println("follow taffic rules");
	}
	@Override
	public void develop() {
		// TODO Auto-generated method stub
		System.out.println("developer");
		
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("testing");
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("update");
		
	}
	@Override
	void study() {
		// TODO Auto-generated method stub
		System.out.println("parent studying");
		
	}
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("parent work");
		
	}

}
