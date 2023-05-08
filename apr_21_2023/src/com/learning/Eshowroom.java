package com.learning;

public class Eshowroom {
	int price;
	int discount;
	Eshowroom(){
		System.out.println("welcome to eshowroom");
	}


	public Eshowroom(int price, int discount) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.discount = discount;
		System.out.println("price is "+price);
		System.out.println("discount is "+discount);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eshowroom tv = new Eshowroom();
		Eshowroom fridge = new Eshowroom();
		Eshowroom wm = new Eshowroom();
		Eshowroom ac = new Eshowroom(25000,5);
		ac.buy();
		

	}


	private void buy() {
		// TODO Auto-generated method stub
		System.out.println(price+" "+discount);
		
	}

}
