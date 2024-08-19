//Problem Statement
//
//Implement a program to calculate the product of three positive integer values. 
//However, if one of the integers is 7, consider only the values to the right of 7 for calculation. 
//If 7 is the last integer, then display -1.
//
//Note: Only one of the three values can be 7.
package com.example.ControlStructure;

public class AssignmentThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2;
		int num2 = 6;
		int num3 = 7;
		
		if(num1 != 7 && num2 != 7 && num3 != 7) {
			int product = num1 * num2 * num3;
			System.out.println(product);
		}
		else {
			if(num1 == 7 && num2 != 7 && num3 != 7) {
				int product = num2 * num3;
				System.out.println(product);
			}
			else if(num1 != 7 && num2 == 7 && num3 != 7)
				System.out.println(num3);
			else
				System.out.println(-1);
		}
	}
}
