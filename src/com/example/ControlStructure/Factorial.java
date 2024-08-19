package com.example.ControlStructure;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;
		int number = 7;
		
		while(number >= 1) {
			factorial *= number;
			--number;
		}
		
//		for(int i = 1; i <= number; i++) {
//			factorial *= i; 
//		}
		System.out.println(factorial);
	}

}
