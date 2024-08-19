//Implement a program to display the geometric sequence as given below for a given value n, 
//where n is the number of elements in the sequence.
//1, 2, 4, 8, 16, 32, 64, ......, 1024
package com.example.ControlStructure;

public class GeometricSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int temp = 1;
		for(int i = 1; i <= n; i++) {
			System.out.print(temp + ",");
			temp += temp;
		}
	}

}
