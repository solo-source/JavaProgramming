package com.example.calculator;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator object = new Calculator();
		object.num1 = 12;
		object.num2 = 8;
		object.num3 = 15;
		
		//calling findAverage()
		double result = object.findAverage(object.num1, object.num2, object.num3);
		System.out.println(result);
	}

}
