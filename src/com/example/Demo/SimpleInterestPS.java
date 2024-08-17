package com.example.Demo;

public class SimpleInterestPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float principle = 3250f;
		int rate = 7;
		float time = 3f;
		
		double simpleInterest = ((principle * (double)rate * time)/100);
		System.out.println(simpleInterest);
	}

}
