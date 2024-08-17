package com.example.TestingExamples;

public class TempratureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempFahrenheit = 50;
		
		float tempCelsius = (((float)tempFahrenheit - 32)/9) * 5;
		System.out.println(tempCelsius);
	}

}
