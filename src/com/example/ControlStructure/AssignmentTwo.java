//Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
//Implement a program to solve a quadratic equation.
//
//Find the discriminant value using the formula given below.
//
//discriminant = b2 - 4ac
//
//    If the discriminant is 0, the values of both the roots will be same. Display the value of the root.
//
//    If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.
//
//    If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"
//
//Use the formula given below to find the roots of a quadratic equation.
//Import java.lang.Math; for calculating squareroots.
//x = (-b ± Math.sqrt(discriminant))/2a
package com.example.ControlStructure;

import java.lang.Math;

public class AssignmentTwo {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int a = 1;
		int b = 4;
		int c = 4;
		
//		double discriminant = ((b * b) - (4 * a * c));
//	
//		if(discriminant == 0) {
//			//equal and real roots
//			double root = ((-b) + (discriminant))/(2 * a);
//			System.out.println("The root is " + root);
//		}
//		else if(discriminant > 0) {
//			//unequal and real roots
//			double root1 = ((-b) + discriminant)/(2 * a);
//			double root2 = ((-b) - discriminant)/(2 * a);
//			System.out.println("The roots are " + root1 + " and " + root2);
//		}
//		else if(discriminant < 0) {
//			//imaginary(complex number) root
//			System.out.println("The equation has no real roots");
//		}
		
		
		double discriminant = ((b * b) - (4 * a * c));
		double discriminantValue = Math.sqrt(discriminant);
		if(discriminant == 0) {
			//equal and real roots
			double root = ((-b) + (discriminantValue))/(2 * a);
			System.out.println("The root is " + root);
		}
		else if(discriminant > 0) {
			//unequal and real roots
			double root1 = ((-b) + discriminantValue)/(2 * a);
			double root2 = ((-b) - discriminantValue)/(2 * a);
			System.out.println("The roots are " + root1 + " and " + root2);
		}
		else if(discriminant < 0) {
			//imaginary(complex number) root
			System.out.println("The equation has no real roots");
		}
	}
}
