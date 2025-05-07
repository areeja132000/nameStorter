package com.namesorter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NameSorterHandler {

	public static void sorterHandler (IHandler fileHandler) {
		
		List<String> allNames = null;
		
		//Read names to be sorted. If fails, exit
		try {
			allNames = fileHandler.readAllLines();
		} catch (IOException e) {
			System.out.println("Trouble reading from file.");
			System.exit(1);
		}
		
		//Sort names
		List<String> lines = NameSorter.sortNames(allNames);
		
		//Print sorted names to screen
		lines.forEach(System.out::println);
		
		fileHandler.writeAllLines(lines);
	}
}
