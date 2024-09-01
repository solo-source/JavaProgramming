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
		        Scanner scanner = new Scanner(System.in);
	
		        // Input the number of heads and legs
		        System.out.print("Enter the number of heads: ");
		        int heads = scanner.nextInt();
	
		        System.out.print("Enter the number of legs: ");
		        int legs = scanner.nextInt();
	
		        // Compute the number of chickens and rabbits
		        String result = findAnimals(heads, legs);
		        System.out.println(result);
		    }
	
		    public static String findAnimals(int heads, int legs) {
		        // Check for invalid cases
		        if (legs < 2 * heads || (legs - 2 * heads) % 2 != 0) {
		            return "No valid solution";
		        }
	
		        // Calculate the number of rabbits (R) and chickens (C)
		        int R = (legs - 2 * heads) / 2;
		        int C = heads - R;
	
		        // Validate the results
		        if (C < 0 || R < 0) {
		            return "No valid solution";
		        }
	
		        return "Chickens: " + C + ", Rabbits: " + R;
		    }
}


