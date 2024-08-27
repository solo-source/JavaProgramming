//Problem Statement
//
//Implement a program that displays a message for a given number based on the below conditions.
//
//    If the number is a multiple of 3, display "Zip".
//
//    If the number is a multiple of 5, display "Zap".
//
//    If the number is a multiple of both 3 and 5, display "Zoom",
//    For all other cases, display "Invalid".

package com.example.ControlStructure;

import java.util.Scanner;

public class AssignmentSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int digit = 0;
		int digitSum = 0;
		int temp;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Number: ");
		number = sc.nextInt();
		temp = number;
		
		while(temp > 0) {
			digit = temp % 10;
			digitSum += digit;
			temp = temp / 10;				
		}
		
		if(digitSum % 3 == 0 && number % 5 == 0) {
			System.out.println("Zoom");
		}
		else if(number % 5 == 0) {
			System.out.println("Zap");
		}
		else if(digitSum % 3 == 0) {
			System.out.println("Zip");
		}
		else
			System.out.println("Invalid");
	}

}
