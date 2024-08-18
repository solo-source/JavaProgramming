package com.example.ControlStructure;

public class TestingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int discountPremium = 0;
		int discountRegular = 0; 
		String customerType = "Regular";
		
		switch(customerType) {
		case "Premium": discountPremium = 10;
						System.out.println(discountPremium);
		case "Regular": discountRegular = 5;
						System.out.println(discountRegular);
						break;
						
		default: discountPremium = 0;
				discountRegular = 0;
		}
		
//		int num1 = 20;
//		double num2 = 0;
//		if(num1 >= 20)
//			num2 = 1.5;
//		if(num1 < 30)
//			num2 = 2;
//		
//		System.out.println(num2);
//		
		
//		boolean x = true;
//		boolean y = false;
//		if(x && y)
//			System.out.println(true);
//		else
//			System.out.println(false);
		
//		float choice = 12;
//		switch(choice) {	//error: Cannot use float type in switch, only int, String, char and enum.
//		case
//		}
//		double i; //initialization of variable are not mandatory upon declaration.
//		char j = 'b';
//		switch(j) {
//		case 'a':	//empty case blocks are also accepted.
//		case 'b': System.out.println("Char is also acceptable as an expression in switch.");
//					break;
//		}
		
//		int k1 = 1;
//		switch(k1) {
//		default: System.out.println("Executing with no problems.");		//location of default statement doesn't matter if.
//		case 1: System.out.println("welcome");							//we have a case that matches our input value.
//		case 2: System.out.println("to");								//because default statement does not get executed
//		case 3: System.out.println("Infosys");							//in such a scenario.
//				
//		}
//		
//		int k = 1;
//		switch(k) {
//		default: System.out.println("Have");					//if there is no match for the case value
//		case 'a': System.out.println("Have");					//then the default statement is executed
//		case 'b': System.out.println("A");						//and subsequent statements that are below the default
//		}														//also get executed until they encounter a "break;" or end of switch block.
//		
//		switch(k) {
//		case 'a': System.out.println("Have");
//		case 'b': System.out.println("A");
//		default: System.out.println("Have");
//		}
		
		System.out.println("Discount Values are:" + discountPremium + discountRegular);
	}

}
