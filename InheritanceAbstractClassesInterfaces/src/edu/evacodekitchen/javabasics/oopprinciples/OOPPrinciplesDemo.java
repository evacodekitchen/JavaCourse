package edu.evacodekitchen.javabasics.oopprinciples;

import edu.evacodekitchen.javabasics.abstractclasses.Button;
import edu.evacodekitchen.javabasics.abstractclasses.View;

public class OOPPrinciplesDemo {
	public static void main(String[] args) {
		//inheritance
		Button button2 = new Button(123, 100, 10, "Press me");
		foo(button2);
		
		//polymorphism
		A a = new A();
		A b = new B();
		A c = new C();
		a.foo();
		b.foo();
		c.foo();
	}
	
	static void foo(View view) {
		
	}
	
}
