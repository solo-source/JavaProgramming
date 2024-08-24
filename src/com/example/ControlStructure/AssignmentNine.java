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
		
		int input, fakeInput;
		int counter = 0;
		boolean status = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		input = sc.nextInt();
		fakeInput = input;
		//counting no of digits in input
		while(input > 0) {
			input /= 10;
			counter++;
		}
		
		var arr = new int[counter];
		int i = 0;
		
		while(input > 0 && i < counter) {
			arr[i] = input % 10;
			input /= 10;
			i++;
		}
		
		for(int j = 1; j < arr.length - 1; j++) {
			if(arr[j] == arr[arr.length - j]) {
				status = true;
			}
			else
				status = false;
		}
		if(status == true)
			System.out.println(fakeInput + " is a palindrome");
		else
			System.out.println(fakeInput + " is not qa palindrome");
		
		sc.close();
	}

}
