package edu.evacodekitchen.javabasics.varkeyword;

import java.util.ArrayList;
import java.util.List;

public class VarKeywordExample {

//	var s = "someString"; //not allowed
	
	public static void main(String[] args) {
//		Integer g = Integer.valueOf(3);
		var g = Integer.valueOf(3);
		
		System.out.println(g + 3);
		
//		List<String> list = new ArrayList<>();
		var list = new ArrayList<>();
		list.add("hey");
		 
//		g = "dfg"; //not allowed
//		var n = null; //not allowed
	}
	
//	public void bar(var k) { //not allowed
//		
//	}
//	
}
