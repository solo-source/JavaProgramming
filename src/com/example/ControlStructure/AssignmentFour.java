//Problem Statement
//
//Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.
//
//A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. 
//Apart from the cost per plate of food, customers are also charged for home delivery based on the 
//distance in kms from the restaurant to the delivery point. 
//The delivery charges are as mentioned below:
//First 3kms: $0
//Next 3kms: $1
//Remaining kms: $2
//
//Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, 
//implement a program to calculate the final bill amount to be paid by a customer.
//
//The below information must be used to check the validity of the data provided by the customer: 
//
//    Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.
//
//    Distance in kms must be greater than 0.
//
//    Quantity ordered should be minimum 1.
//
//If any of the input is invalid, the bill amount should be displayed as -1.
package com.example.ControlStructure;

import java.util.Scanner;

public class AssignmentFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputValueFood;
		char typeOfFood; 
		int quantity = 1;
		int distance;
		int vegUnitPrice = 12;
		int nonVegUnitPrice = 15;
		int billAmount = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the type of food ordered? V or N");
			inputValueFood = sc.next();
			typeOfFood = inputValueFood.charAt(0);
			System.out.println("Enter quantity: ");
			quantity = sc.nextInt();
			System.out.println("Enter distance in kms: ");
			distance = sc.nextInt();
		}
		if(typeOfFood == 'V' || typeOfFood == 'N') {
			if(quantity >= 1) {
				if(distance > 0) {
					if(typeOfFood == 'V') {
						billAmount = quantity * vegUnitPrice;
						if(distance <= 3)		//No delivery charges
							System.out.println(billAmount);
						else if(distance > 3 && distance <= 6) {
							//$1 delivery charge per km for 3km = $3
							billAmount += 3;
							System.out.println(billAmount);
						}
						else {
							int temp = distance - 6;
							billAmount = billAmount + 3 + (temp * 2);	//$1 per km for 3km to 6km and the $2 for remaining kms.
							System.out.println(billAmount);
						}
					}
					else {
						billAmount = quantity * nonVegUnitPrice;
						if(distance <= 3)		//No delivery charges
							System.out.println(billAmount);
						else if(distance > 3 && distance <= 6) {
							//$1 delivery charge per km for 3km = $3
							billAmount += 3;
							System.out.println(billAmount);
						}
						else {
							int temp = distance - 6;
							billAmount = billAmount + 3 + (temp * 2);	//$1 per km for 3km to 6km and the $2 for remaining kms.
							System.out.println(billAmount);
						}
					}
				}
				else {
					billAmount = -1;
					System.out.println("Bill Amount for invalid distance: " + billAmount);
				}
			}
			else {
				billAmount = -1;
				System.out.println("Bill Ammount for Invalid quantity: " + billAmount);
			}
		}
		else {
			billAmount = -1;
			System.out.println("Bill Amount for Invalid food type: " + billAmount);
		}
	}
}
