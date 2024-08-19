package com.example.UnaryOperators;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOne = 10;
		int numTwo = 5;
		boolean isTrue = true;
		
		System.out.println(~numTwo);
		System.out.println(numOne++ + " " + numOne + " " + ++numOne + " " + numOne);
		System.out.println(numTwo-- + " " + numTwo + " " + --numTwo + " " + numTwo);
		System.out.println(!isTrue + " " + ~numOne + " " + ~numTwo);
	}

}
