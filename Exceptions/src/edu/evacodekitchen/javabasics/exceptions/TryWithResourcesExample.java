package edu.evacodekitchen.javabasics.exceptions;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		writeToFile("resources/fileToBeEdited.txt", "Hi from the file! My random number is: " + new Random().nextInt());
	}

	public static void writeToFile(String filePath, String text) {
		Path file = Paths.get(filePath);

		try (OutputStream outputStream = Files.newOutputStream(file)) {
			outputStream.write(text.getBytes());
		} catch (IOException e) {
			System.out.println("Some problem occured: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Done. Bye!");
	}
}
