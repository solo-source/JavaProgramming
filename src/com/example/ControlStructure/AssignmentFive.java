//Problem Statement
//
//The Metro Bank provides various types of loans such as car loans, business loans and house loans to its account 
//holders, i.e., customers.
//
//Implement a program to determine the eligible loan amount and the EMI that the bank can provide 
//to its customers based on their salary and the loan type they expect to avail.
//
//The values required for determining the eligible loan amount and the EMI are:
//
//    1. account number of the customer
//
//    2. account balance of the customer
//
//    3. salary of the customer
//
//    4. loan type 
//
//    5. expected loan amount
//
//    6. expected no. of EMIs
//
//The following validations should be performed:
//
//    The account number should be of 4 digits and its first digit should be 1
//
//    The customer should have a minimum balance of $1000 in the account
//
//Display appropriate error messages if the validations fail.
//
//If the validations pass, determine whether the bank would provide the loan or not. 
//
//The bank would provide the loan, only if the loan amount and the number of EMIs expected by the 
//customer is less than or equal to the loan amount and the number of EMIs decided by the bank respectively. 
//The bank decides the eligible loan amount and the number of EMIs based on the below table.
//
//Salary		LoanType		EligibleAmount		No_of_EMIs
//>25000		car				500000				36
//>50000		house			6000000				60
//>75000		Business		7500000				84
//
//Display the account number, eligible and requested loan amount and the number of EMIs if the bank provides the loan.
//
//Display an appropriate message if the bank does not provide the loan.
package com.example.ControlStructure;

import java.util.Scanner;

public class AssignmentFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input variables
		int accountNo;
		int accountBalance;
		int salary;
		String loanType;
		int expLoanAmount;
		int expNoOfEMI;
		
		//defined variables
		final int eligibleCarLoanAmt = 500000;
		final int eligibleCarEMIs = 36;
		final int eligibleHouseLoanAmt = 6000000;
		final int eligibleHouseEMIs = 60;
		final int eligibleBusinessLoanAmt = 7500000;
		final int eligibleBusinessEMIs = 84;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		accountNo = sc.nextInt();
		System.out.println("Enter account balance: ");
		accountBalance = sc.nextInt();
		System.out.println("Salary: ");
		salary = sc.nextInt();
		
		System.out.println("Enter the loan type you are expecting? Car, House or Business: ");
		loanType = sc.next();
		System.out.println("Enter Expected loan amount: ");
		expLoanAmount = sc.nextInt();
		System.out.println("Enter expected no. of EMIs: ");
		expNoOfEMI = sc.nextInt();
		
		
//		int length = String.valueOf(accountNo).length();
//		String accountString = String.valueOf(accountNo);
//		char firstDigit = accountString.charAt(0);
//		System.out.println(firstDigit);
//		System.out.println(length);
//		System.out.println(accountString);
//		System.out.println(1);
		
		
		//checking the length of accountNumber and its first digit by converting 
		//accountNumber to String and using charAt() to access first element of string.
		//when comparing strings use x.equals(y) method only, can't compare String using ==.
		if(String.valueOf(accountNo).length() == 4 && String.valueOf(accountNo).charAt(0)== '1') {
			if(accountBalance >= 1000) {
				if("Car".equals(loanType)) {
					if(expLoanAmount <= eligibleCarLoanAmt && expNoOfEMI <= eligibleCarEMIs) {
						System.out.println("Loan Eligible!");
						System.out.println("Account Number: " + accountNo);
						System.out.println("Requested loan type: " + loanType);
						System.out.println("Requested loan amount: " + expLoanAmount);
						System.out.println("Eligible loan amount: " + eligibleCarLoanAmt);
						System.out.println("No. of EMIs: " + eligibleCarEMIs);
					}
				}
				else if("House".equals(loanType)) {
					if(expLoanAmount <= eligibleHouseLoanAmt && expNoOfEMI <= eligibleHouseEMIs) {
						System.out.println("Loan Eligible!");
						System.out.println("Account Number: " + accountNo);
						System.out.println("Requested loan type: " + loanType);
						System.out.println("Requested loan amount: " + expLoanAmount);
						System.out.println("Eligible loan amount: " + eligibleHouseLoanAmt);
						System.out.println("No. of EMIs: " + eligibleHouseEMIs);
					}
				}
				else if("Business".equals(loanType)) {
					if(expLoanAmount <= eligibleBusinessLoanAmt && expNoOfEMI <= eligibleBusinessEMIs) {
						System.out.println("Loan Eligible!");
						System.out.println("Account Number: " + accountNo);
						System.out.println("Requested loan type: " + loanType);
						System.out.println("Requested loan amount: " + expLoanAmount);
						System.out.println("Eligible loan amount: " + eligibleBusinessLoanAmt);
						System.out.println("No. of EMIs: " + eligibleBusinessEMIs);
					}
				}
				else
					System.out.println("You do meet the requirements for the loan. You are ineligible.");
			}
			else 
				System.out.println("Customer does not meet minimum balance requirement. They are not eligible for loan.");
		}
		else
			System.out.println("Invalid Account Number Entered. Try again.");
	}
}
