package edu.evacodekitchen.javabasic.annotations.customannotation;

public class Component2 {
	
	@Execute(startMessage = "Start of method sayHello", endMessage = "End of method sayhello")
	public static void sayHello() {
		System.out.println("Hello, from Component2 sayHello method!");
	}

	@Execute
	public static void sayBello() {
		System.out.println("Hello, from Component2 sayBello method!");
	}

}
