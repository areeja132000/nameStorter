package com.namesorter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHandler {
	
	public static List<String> readAllLines(String readPath) {
		List<String> allLines = null;
		try {
			allLines = Files.readAllLines(Path.of(readPath));
		} catch (IOException e) {
			System.out.println("Trouble reading from file.");
			System.exit(1);
		}
		return allLines;
	}
	
	public static void writeAllLines(String writePath, List<String> sortedNames) {
		try {
			Files.write(Path.of(writePath), sortedNames);
		} catch (IOException e) {
			System.out.println("Trouble writing to file.");
			System.exit(1);
		}
	}

}
