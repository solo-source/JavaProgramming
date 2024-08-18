package com.example.ControlStructure;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 4;
		int num2 = 4;
		int num3 = 1;
		
		if(num1 > num2) {
			if(num1 > num3)
				System.out.println(num1 + " is greater.");
			else
				System.out.println(num3 + " is greater.");
		}
		else {
			if(num2 > num3)
				System.out.println(num2 + " is greater.");
			else
				System.out.println(num3 + " is greater.");
		}
	}

}
