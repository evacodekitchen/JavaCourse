package edu.evacodekitchen.javabasics.interfaces.withinterfaces;

public interface MyInterface {
	
	static int somePublicStaticField = 2;
	
	void someAbstractMethod(); //it is inherited by the classes that implement the interface
	
	default int someDefaultMethod() { //it is inherited by the classes that implement the interface
		//implementation
		return 0;
	}
	
	static void someStaticMethod() { //it is not inherited by the classes that implement the interface
		//implementation
	}
	
	class SomeNestedClass{
		//class body
	}
	
	interface SomeNestedInterface{
		//interface body
	}
	
	enum SomeNestedEnum{
		//enum body
	}
	
	@interface SomeNestedAnnotation{
		//annotation body
	}
	
	private void somePrivateMethod() { //not inherited by the classes that implement the interface
		//implementation
	}
	
	private static void somePrivateStaticMethod() { //not inherited by the classes that implement the interface
		//implementation
	}

}
