//Implement a program to display the sum of two given numbers if the numbers are same. 
//If the numbers are not same, display the double of the sum.

package com.example.ControlStructure;

public class AssingmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 5;
		int sum = 0;
		
		if(num1 != num2)
			sum = 2 * (num1 + num2);
		else
			sum = num1 + num2;
		
		System.out.println(sum);
	}

}
