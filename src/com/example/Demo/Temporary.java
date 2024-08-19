package com.example.Demo;

public class Temporary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//logic to find sum of digits of a number
		int inputNumber = 4123;
		int sumOfDigits = 0;
		int temp = 0;
		
//		while(inputNumber > 0) {
//			temp = inputNumber % 10;
//			sumOfDigits += temp;
//			inputNumber = inputNumber / 10;
//		}
		
		do {
			temp = inputNumber % 10;
			sumOfDigits += temp;
			inputNumber = inputNumber / 10;
		}while(inputNumber > 0);
		
		System.out.println("Sum of digits: " + sumOfDigits);
	}

}
