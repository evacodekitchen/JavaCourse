package edu.evacodekitchen.javabasic.annotations.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Execute {
	
	String startMessage() default "--------- Start of method ------";
	String endMessage() default "--------- End of method ------";

}
