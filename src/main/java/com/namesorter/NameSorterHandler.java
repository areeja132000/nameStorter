package com.namesorter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NameSorterHandler {

	public static void sorterHandler (String inputFile, String outputFile) {
		
		List<String> allNames = new ArrayList<>();
		
		//Read names to be sorted. If fails, exit
		try {
			allNames = FileHandler.readAllLines(inputFile);
		} catch (IOException e) {
			System.out.println("Trouble reading from file.");
			System.exit(1);
		}
		
		//Sort names
		List<String> lines = NameSorter.sortNames(allNames);
		
		//Print sorted names to screen
		lines.forEach(System.out::println);
		
		//Print sorted names to file. If fails, exit
		try {
			FileHandler.writeAllLines(outputFile, lines);
		} catch (IOException e) {
			System.out.println("Trouble writing to file.");
			System.exit(1);
		}
	}
}
