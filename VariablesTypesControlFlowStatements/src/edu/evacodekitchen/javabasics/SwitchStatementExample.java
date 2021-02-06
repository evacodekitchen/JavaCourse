package edu.evacodekitchen.javabasics;

public class SwitchStatementExample {
	
	public static void main(String[] args) {
		int discountPercentage = 0;
		
		int dayOfWeek = 7;
		
		switch (dayOfWeek) {
		  case 6:
		    discountPercentage = 40;
		    break; //do not forget the break from each branch!
		  case 7:
		    discountPercentage = 60;
		    break;
		  default:
		    discountPercentage = 10;
		    break;
		}
		
//		the same as:
		
//		if (dayOfWeek == 6) {
//			discountPercentage = 40;
//		}else if (dayOfWeek == 7) {
//			discountPercentage = 60;
//		}else {
//			discountPercentage = 10;
//		}

		System.out.println(discountPercentage);
		
	}

}
