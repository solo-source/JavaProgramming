package com.example.Demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//logic to find sum of digits
		int inputNumber = 28;
		int sumOfDigits = 0;
		int temp = 0;

		while (inputNumber > 0) {
			temp = inputNumber % 10;
			sumOfDigits += temp;
			inputNumber = inputNumber / 10;
		}

		System.out.println("Sum of digits are : " + sumOfDigits);		
	}

}
