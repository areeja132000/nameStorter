package com.namesorter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHandler {
	
	public static List<String> readAllLines(String readPath) throws IOException {
		return Files.readAllLines(Path.of(readPath));
	}
	
	public static void writeAllLines(String writePath, List<String> sortedNames) throws IOException {
		Files.write(Path.of(writePath), sortedNames);
	}

}
