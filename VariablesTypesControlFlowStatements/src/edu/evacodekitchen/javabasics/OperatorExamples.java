package edu.evacodekitchen.javabasics;

public class OperatorExamples {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;

		// multiplicative
		int c = a * b;
		int d = a / b;
		int e = a % b;

		System.out.println("kjdfhsjfo kjdhgsfi");
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e); 

        // additive
		int f = a - b;
		int g = a + b;

		System.out.println("f = " + f);
		System.out.println("g = " + g);

		// relational
		boolean isAGreaterThanB = a < b;
		System.out.println("isAGreaterThanB = " + isAGreaterThanB);

		// equality
		boolean isAEqualToB = a == b;
		System.out.println("isAEqualToB = " + isAEqualToB);

		// logical
		boolean isDecember = false;
		boolean isJanuary = true;
		boolean isFebruary = false;
		boolean isWinter = isDecember || isJanuary || isFebruary;

		System.out.println("isWinter = " + isWinter);

		// ternary
		int max = a >= b ? a : b;
		System.out.println("max = " + max);

		// unary prefix
		int i = 3;
		System.out.println("i = " + i);
		
		++i; //the same as i = i + 1
		System.out.println("(after ++i) i = " + i);

		--i; //the same as i = i - 1
		System.out.println("(after --i) i = " + i);
		
		System.out.println("(during ++i) i = " + ++i);

		System.out.println("(during --i) i = " + --i);

		// unary postfix
		int j = 3;
		System.out.println("j = " + j);
		
	
		j++; 
		System.out.println("(after j++) j = " + j);

		j--; //the same as: use the original value of j in the current expression, then j = j - 1
		System.out.println("(after j--) j = " + j);

		int k = 3;

		System.out.println("k = " + k);
		
		System.out.println("(during k++) k = " + k++); //use the original value of k in the current expression, then k = k + 1
		System.out.println("(after k++) k = " + k);

		System.out.println("(during k--) k = " + k--); //use the original value of k in the current expression, then k = k + 1
		System.out.println("(after k--) k = " + k);
	}

}
