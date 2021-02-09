package edu.evacodekitchen.javabasics.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExceptionExample {
	
	public static void main(String[] args) throws IOException {
		readLinesFromFile();
	}
	
	public static void readLinesFromFile() throws IOException {
		System.out.println("Enter a file name, please!");
		Scanner in = new Scanner(System.in);
		String filename = in.nextLine();
		System.out.println("Lines of the given file " + filename);
		Path path = Paths.get(filename);
	    System.out.println(Files.readAllLines(path));
	}

}
