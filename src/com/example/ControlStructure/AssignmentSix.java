//Problem Statement
//
//You have x number of $5 notes and y number of $1 notes. You want to purchase an item for amount z. 
//The shopkeeper wants you to provide exact change. You want to pay using a minimum number of notes. 
//How many $5 notes and $1 notes will you use?
//
//Implement a program to find out how many $5 notes and $1 notes will be used. 
//If an exact change is not possible, then display -1.
//
//sample Input 					|	sample output
//$1 notes available = 2		|	$1 notes needed = 1
//$5 notes available = 4		|	$5 notes needed = 4
//Purchase amt = 21				|	
//								|
//$1 notes available = 3		|	-1
//$5 notes available = 3		|	
//Purchase amt = 19				|	
package com.example.ControlStructure;

import java.util.Scanner;

public class AssignmentSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oneDollarsWithMe;
		int fiveDollarsWithMe;
		int oneDollarsNeeded;
		int fiveDollarsNeeded;
		int purchaseAmt;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of $1 bills: ");
		oneDollarsWithMe = sc.nextInt();
		System.out.println("Enter no. of $5 bills: ");
		fiveDollarsWithMe = sc.nextInt();
		System.out.println("Enter your Purchase amount: ");
		purchaseAmt = sc.nextInt();
		
		int totalAmt = oneDollarsWithMe + (fiveDollarsWithMe * 5);
		
		if(totalAmt >= purchaseAmt) {
			fiveDollarsNeeded = purchaseAmt / 5;
			oneDollarsNeeded = purchaseAmt % 5;
			System.out.println("$1 notes needed = " + oneDollarsNeeded);
			System.out.println("$5 notes needed = " + fiveDollarsNeeded);
		}else
			System.out.println(-1);
	}

}
