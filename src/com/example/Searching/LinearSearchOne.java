//Linear Search in array. - Pulling each element from the array in order and comparing it to the search_element
//one by one until match is found.
package com.example.Searching;

import java.util.Scanner;

public class LinearSearchOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,30,20,40,69,76,100};
		int searchElement;
		boolean flag = false;
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the serach element: ");
		searchElement = sc.nextInt();
		
		for(i = 0; i < arr.length; i++) {
			if(arr[i] == searchElement) {
				flag = true;
				System.out.println(searchElement + " found at the " + (i + 1) + "th place and at " + i + "th position in the array.");
				break;
			}else {
				flag = false;
			}
		}
		
		if(!flag)//can also be written as if(flag != true)
			System.out.println("Element does not exists in the array.");
		
		sc.close();
		
	}

}
