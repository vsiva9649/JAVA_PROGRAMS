package com.learning;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child ch = new Child(); 
		System.out.println(ch.balance);
//		ch.receive();
		//Dynamic Binding
		Parent pa = new Child(); 
		pa.cook();
		pa.receive();
		pa.sleep();
//		ch.develop_java_applications();

	}
	public void develop_java_applications()
	{
		System.out.println("Java Developer");
	}
	public void receive()
	{System.out.println("Taking Care "
				+ "of Relatives and friends");
//	super.receive();
	}
	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Sleept at 11.am");
	}

}
