//Problem Statement
//
//Implement a program to generate and display the next date of a given date.
//
//The date will be provided as day, month and year as shown in the below table.
//
//The output should be displayed in the format: day-month-year.
//
//Assumption: The input will always be a valid date.
package com.example.ControlStructure;

import java.util.Scanner;

public class AssignmentEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		int month;
		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day: ");
		day = sc.nextInt();
		System.out.println("Enter the month: ");
		month = sc.nextInt();
		System.out.println("Enter the year: ");
		year = sc.nextInt();
		
		//check leap year.
		if((year % 4) != 0) {
				switch(month) {
				case 1:	if(day >= 1 && day <31) {
							++day;
							break;
						}
						else if(day == 31) {
							++month;
							++day;
							break;
						}
				case 2: if(day >= 1 && day <28) {
							++day;
							break;
						}
						else if(day == 28) {
							++month;
							++day;
							break;
						}
				case 3: if(day >= 1 && day <31) {
							++day;
							break;
						}
						else if(day == 31) {
							++month;
							++day;
							break;
						}
				case 4: if(day >= 1 && day <30) {
							++day;
							break;
						}
						else if(day == 30) {
							++month;
							++day;
							break;
						}
				case 5: if(day >= 1 && day <31) {
							++day;
							break;
						}
						else if(day == 31) {
							++month;
							++day;
							break;
						}
				case 6: if(day >= 1 && day <30) {
							++day;
							break;
						}
						else if(day == 30) {
							++month;
							++day;
							break;
						}
				case 7: if(day >= 1 && day <31) {
							++day;
							break;
						}
						else if(day == 31) {
							++month;
							++day;
							break;
						}
				case 8: if(day >= 1 && day <31) {
							++day;
							break;
						}
						else if(day == 31) {
							++month;
							++day;
							break;
						}
				case 9: if(day >= 1 && day <30) {
							++day;
							break;
						}
						else if(day == 30) {
							++month;
							++day;
							break;
						}
				case 10: if(day >= 1 && day <31) {
							++day;
							break;
						}
						else if(day == 31) {
							++month;
							++day;
							break;
						}
				case 11: if(day >= 1 && day <30) {
							++day;
							break;
						}
						else if(day == 30) {
							++month;
							++day;
							break;
						}
				case 12: if(day >= 1 && day <31) {
							++day;
							break;
						}
						else if(day == 31) {
							++month;
							++year;
							++day;
							break;
						}
				}
		}
		else {
			switch(month) {
			case 1:	if(day >= 1 && day <31) {
						++day;
						break;
					}
					else if(day == 31) {
						++month;
						++day;
						break;
					}
			case 2: if(day >= 1 && day <29) {
						++day;
						break;
					}
					else if(day == 29) {
						++month;
						++day;
						break;
					}
			case 3: if(day >= 1 && day <31) {
						++day;
						break;
					}
					else if(day == 31) {
						++month;
						++day;
						break;
					}
			case 4: if(day >= 1 && day <30) {
						++day;
						break;
					}
					else if(day == 30) {
						++month;
						++day;
						break;
					}
			case 5: if(day >= 1 && day <31) {
						++day;
						break;
					}
					else if(day == 31) {
						++month;
						++day;
						break;
					}
			case 6: if(day >= 1 && day <30) {
						++day;
						break;
					}
					else if(day == 30) {
						++month;
						++day;
						break;
					}
			case 7: if(day >= 1 && day <31) {
						++day;
						break;
					}
					else if(day == 31) {
						++month;
						++day;
						break;
					}
			case 8: if(day >= 1 && day <31) {
						++day;
						break;
					}
					else if(day == 31) {
						++month;
						++day;
						break;
					}
			case 9: if(day >= 1 && day <30) {
						++day;
						break;
					}
					else if(day == 30) {
						++month;
						++day;
						break;
					}
			case 10: if(day >= 1 && day <31) {
						++day;
						break;
					}
					else if(day == 31) {
						++month;
						++day;
						break;
					}
			case 11: if(day >= 1 && day <30) {
						++day;
						break;
					}
					else if(day == 30) {
						++month;
						++day;
						break;
					}
			case 12: if(day >= 1 && day <31) {
						++day;
						break;
					}
					else if(day == 31) {
						++month;
						++year;
						++day;
						break;
					}
			}
		}
		System.out.println(day + "-" + month + "-" + "20" + year);
	}
}
