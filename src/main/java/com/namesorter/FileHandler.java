package com.namesorter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHandler implements IHandler {
	
	Path inputPath;
	Path outputPath;
	
	public FileHandler(String inputPath, String outputPath) {
		this.inputPath = Path.of(inputPath); 
		this.outputPath = Path.of(outputPath);
	}
	
	public List<String> readAllLines() throws IOException {
		return Files.readAllLines(inputPath);
	}
	
	public void writeAllLines(List<String> sortedNames) {
		try {
			Files.write(this.outputPath, sortedNames);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
