package edu.evacodekitchen.javabasics.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class TryCatchBlockExample {
	
	public static void main(String[] args) {
		readLinesFromFile();
	}
	
	public static void readLinesFromFile() {
		System.out.println("Enter a file name, please!");
		Scanner in = new Scanner(System.in);
				
		boolean correctInputFileNotProvided = true;
		while (correctInputFileNotProvided) {
			String filename = in.nextLine();
			Path path = Paths.get(filename);
		    try {
				List<String> allLines = Files.readAllLines(path);
				System.out.println("Lines of the given file " + filename);
				System.out.println(allLines);
				correctInputFileNotProvided = false;
			} catch (IOException e) {
				System.out.println("Some exception occured. Please make sure that you provide an existing file path:");
			}
		}
		System.out.println("Thanks, bye!");
	}
}
