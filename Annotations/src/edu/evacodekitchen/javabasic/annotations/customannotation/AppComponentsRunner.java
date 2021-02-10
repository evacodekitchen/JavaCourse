package edu.evacodekitchen.javabasic.annotations.customannotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class AppComponentsRunner {
	
	public static void main(String[] args) {
		runAllExecuteMethods(getClassesFromConfigFile());
	}

	private static List<Class> getClassesFromConfigFile() {
		//read class names from some config file
		List<Class> classes = Arrays.asList(Component1.class, Component2.class); //let's say we read this from a config file
		return classes;
	}

	private static void runAllExecuteMethods(List<Class> classes) {
		for (Class clazz : classes) {
			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				if (method.isAnnotationPresent(Execute.class)) {
					method.setAccessible(true);
					try {
						System.out.println(method.getAnnotation(Execute.class).startMessage());
						method.invoke(clazz);
						System.out.println(method.getAnnotation(Execute.class).endMessage());
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
