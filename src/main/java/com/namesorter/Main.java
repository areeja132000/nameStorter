package com.namesorter;

public class Main {

	public static void main(String[] args) {
		
		if (args.length < 2) {
			System.out.println("Not enough arguments.");
			System.exit(1);
		}
		
        String inputFile = args[0];
        String outputFile = args[1];
        
        IHandler fileHandler = new FileHandler(inputFile, outputFile);
        NameSorterHandler.sorterHandler(fileHandler);
	    
	}

}
