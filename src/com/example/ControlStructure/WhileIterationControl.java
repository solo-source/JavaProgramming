package com.example.ControlStructure;

import java.util.Scanner;

public class WhileIterationControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalCost = 0;
		int quantity = 1;
		int UnitPrice = 10;
		char wantToAddFoodItem = 'N';
		
//		while(wantToAddFoodItem == 'Y') {
//			totalCost = totalCost + (quantity * UnitPrice);
//			System.out.println("Order Placed Successfully");
//			System.out.println("Total Cost: " + totalCost);
//			System.out.println("Do you want to add more food item? Y or N");
//			//String input = sc.next(); //accepting input from customer.
//			
//			//Extracting first character from String input. We cannot typecast String to char.
//			//wantToAddFoodItem = input.charAt(0);
//			//Be carefull while writing statements inside a while loop and the while loop condition. if 
//			//the condition inside the while loop always evaluates to true, it leads to an infinite loop.
//		}
		
		do {
			totalCost = totalCost + (quantity * UnitPrice);
			System.out.println("Order Placed Successfully");
			System.out.println("Total Cost: " + totalCost);
			System.out.println("Do you want to add more food item? Y or N");
			String input = sc.next();
			wantToAddFoodItem = input.charAt(0);
		}while(wantToAddFoodItem == 'Y');
	}

}
