package com.namesorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NameSorter {
	
	/**
	 * Sorts given list of full names (first by last name, then by given names) 
	 * and returns a sorted list of full names
	 * 
	 * @param allNames a list of full name strings that need to be sorted
	 * @return         sorted list of full name strings
	 */
	public static List<String> sortNames (List<String> allNames) {
		
		//Create list of people from list of full name strings
		List<Person> people = convertStringsToPeople(allNames);
		
		//Sort list of people (first by last name, then by given names)
		people.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getGivenNames));
		
		//Use the sorted list of people to create sorted list of full name strings
		return convertPeopleToStrings(people);
	}
	
	/**
	 * Creates a list of Person objects given a list of full names
	 * @param allNames list of full names
	 * @return         list of Person objects
	 */
	private static List<Person> convertStringsToPeople (List<String> allNames) {
		//Create empty list of people
		List<Person> people = new ArrayList<>();
		
		//Check that given list is not null
		if (allNames != null) {
			for (String fullName : allNames) {
				
				//Extract last name and given names
				String givenNames = FullNameParser.parseForGivenNames(fullName);
				String lastName = FullNameParser.parseForLastName(fullName);
				
				if (givenNames != null && lastName != null) {
					
					//Create new person with associated given and last names
					Person current = new Person(givenNames, lastName);
					
					//Add person to list of people
					people.add(current);
				}
			}
		}
		
		return people;
		
	}
	
	/**
	 * Creates a list of full names given a list of Person objects
	 * @param people list of Person objects
	 * @return       list of full names
	 */
	private static List<String> convertPeopleToStrings (List<Person> people) {
		List<String> lines = new ArrayList<>();
		for (Person person : people) {
			lines.add(person.getGivenNames() + " " + person.getLastName());
		}
		
		return lines;
	}
}
