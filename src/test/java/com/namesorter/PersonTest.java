package com.namesorter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPersonCreation() {
		Person testPerson = new Person("Gary", "Smith");
		
		assertEquals("Gary", testPerson.getGivenNames());
		assertEquals("Smith", testPerson.getLastName());
	}
	
	@Test
	void testMultipleGivenNames() {
		Person testPerson = new Person("Gary Henry Jack", "Smith");
		
		assertEquals("Gary Henry Jack", testPerson.getGivenNames());
		assertEquals("Smith", testPerson.getLastName());
	}
	
	@Test
	void testNull() {
		Person testPerson = new Person(null, null);
		
		assertNull(testPerson.getGivenNames());
		assertNull(testPerson.getLastName());
	}

}
