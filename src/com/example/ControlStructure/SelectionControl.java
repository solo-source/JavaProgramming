package com.example.ControlStructure;

public class SelectionControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerType = "Regular";
		int quantity = 2;
		int unitPrice = 10;
		float totalCost = 0f;
		int discount = 5;
		int deliveryCharge = 5;
		totalCost = unitPrice * quantity;
		if(customerType == "Regular") {
			totalCost = totalCost * (1 - ((float)discount/100));
			System.out.println("You are a Regular customer and eligible for a 5% discount.");
			System.out.println("Total Cost: " + totalCost);
		}
		else {
			totalCost = totalCost + deliveryCharge;
			System.out.println("You need to pay an additional delivery charge of $5.");
			System.out.println("Total Cost: " + totalCost);
		}
	}

}
