package edu.evacodekitchen.javabasics.finalkeyword;

public class FinalMethodExample {
	
	class A{
		public void foo() {
			//something
		}
	}
	
	class B extends A{
		
		@Override
		public void foo() { //compilation error, because foo from A cannot be overriden
			// some other thing
		}
	}
	
}
