package com.example.calculator;

public class Calculator {
	int num1, num2, num3 = 0;
	
	public double findAverage(int number1, int number2, int number3) {
		double avg = ((double)(number1 + number2 + number3)) / 3;
		return (Math.round(avg*100.0)/100.0);
	}
}
