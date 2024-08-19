package com.example.ControlStructure;

public class AnotherVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerType = "Guest";
		int quantity = 3;
		int unitPrice = 10;
		int discount = 5;
		int deliveryCharge = 5;
		float totalCost = unitPrice * quantity;
		
		if (customerType == "Regular") {
			totalCost = totalCost * (1 - ((float)discount/100));
			System.out.println("You are a regular customer and are eligible for 5% diiscount.");
			System.out.println("Total Cost: " + totalCost);
		}
		else if(customerType == "Guest") {
			totalCost = totalCost + deliveryCharge;
			System.out.println("You need to pay an additional delivery charge of $5.");
			System.out.println("Total Cost: " + totalCost);
		}
		else 
			System.out.println("Invalid Customer Type.");
	}

}
