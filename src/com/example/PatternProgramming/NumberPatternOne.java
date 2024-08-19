package com.example.PatternProgramming;

public class NumberPatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int rows = 10;
//	
//		for(int i = 1; i <= rows; ++i) {	//deciding no of rows
//			for(int j = 1; j <= i; ++j) {	//deciding the no of columns 
//				System.out.print(j + " ");	//print all elements in the row column wise.
//			}
//			System.out.println(" ");		//switching to next row.
//		}
//		
//		for (int row = 1; row <= 4; row++) {
//			for (int value = 1; value <= row; value++) {
//				System.out.print(value + " ");
//			}
//			System.out.println();
//		}
//		int sum = 0;
//		for (int i = 0, j = 0; i < 5 && j < 5; ++i, j = i + 1) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		for(int i = 0; i < 3; i++) {
//			switch(i) {
//			case 0:
//			case 1: System.out.println("One ");
//					break; 
//			case 2: System.out.println("Two ");
//			}
//		}
//		
//		int a = 5;
//		int b = a++;			//a will increment and return back its old value
//		System.out.println(a);
//		System.out.println(b);
//		
//		int a1 = 5;
//		int b1 = ++a1;			//a will increment and return back its new value.
//		System.out.println(a1);
//		System.out.println(b1);
//		
//		System.out.println("/n");
//		System.out.println("/n");
//		System.out.println("/n");
		
		for(int  i = 0; i<3; i++)
			System.out.println(i);
		System.out.println("\n");
		for(int i = 0; i++ < 3;)
			System.out.println(i);
		System.out.println("\n");
		for(int i = 0; i < 3; ++i)
			System.out.println(i);
		System.out.println("\n"); 
		for(int i = 0; ++i < 3;)
			System.out.println(i);
	}
}