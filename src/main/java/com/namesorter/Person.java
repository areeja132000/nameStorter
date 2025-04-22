package com.namesorter;

/**
 * This class represents a person
 */
public class Person {
	private String lastName;
	private String givenNames;
	
	public Person (String givenNames, String lastName) {
		this.givenNames = givenNames;
		this.lastName = lastName;
	}
	
	public String getLastName () {
		return this.lastName;
	}
	
	public String getGivenNames () {
		return this.givenNames;
	}

}
