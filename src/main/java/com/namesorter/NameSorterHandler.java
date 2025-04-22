package com.namesorter;

import java.util.ArrayList;
import java.util.List;

public class NameSorterHandler {

	public static void sorterHandler (String inputFile, String outputFile) {
		
		List<String> allNames = new ArrayList<>();
		
		//Read names to be sorted. If fails, exit
		allNames = FileHandler.readAllLines(inputFile);
		
		//Sort names
		List<String> lines = NameSorter.sortNames(allNames);
		
		//Print sorted names to screen
		lines.forEach(System.out::println);
		
		//Print sorted names to file. If fails, exit
		FileHandler.writeAllLines(outputFile, lines);
	}
}
