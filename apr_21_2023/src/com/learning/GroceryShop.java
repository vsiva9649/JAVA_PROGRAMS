package com.learning;

public class GroceryShop {
	int mrp, discount, actual_price; 
	GroceryShop(){
		System.out.println("Today offer");
	}
	
	GroceryShop(int mrp, int discount) // No-args Constructor
	//Zero args Constructor
	{
		this();
		this.mrp = mrp; 
		this.discount = discount; 
		this.actual_price = calculate_price(mrp, discount);
		System.out.println("Welcome "+this.actual_price);
	}
	private int calculate_price(int mrp, int discount) {
		// TODO Auto-generated method stub
		return mrp - discount; 
		
	}
	 public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    GroceryShop prod1 = new GroceryShop(100,10);
		    
		  }

		}
