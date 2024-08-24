//Problem Statement
//
//Implement a program to check whether a given number is a palindrome.
//
//Palindrome is a sequence that reads the same backwards as forwards.
//
//E.g.: 121, 1331, 2332, 78900987, 123456654321,  etc.
package com.example.ControlStructure;

import java.util.Scanner;

public class AssignmentNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input, fakeInput, mainValue;
		int counter = 0;
		boolean status = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		input = sc.nextInt();
		fakeInput = mainValue = input;
		
		//counting no of digits in input
		while(input > 0) {
			input /= 10;
			counter++;
		}
//		System.out.println(counter);
		
		var arr = new int[counter];
		int i = 0;
		
		//feeding each digit as an element of an array of size of digit
		while(fakeInput > 0) {
			if(i < counter) {
				arr[i] = fakeInput % 10;
				fakeInput /= 10;
				i++;
			}
		}
		
//		for(int j = 0; j < arr.length; j++) {
//			System.out.println(arr[j]);
//		}
//		
//		System.out.println(arr.length);
		
		
		//Checking for palindrome by comparing j'th and arr.length - (j + 1)'th elements of the array.
		for(int j = 0; j < arr.length; j++) {
			
			if(arr[j] == arr[arr.length - (j + 1)]) {
				status = true;
			}
			else
				status = false;
		}
		if(status == true)
			System.out.println(mainValue + " is a palindrome");
		else
			System.out.println(mainValue + " is not a palindrome");
		
		sc.close();
	}

}
