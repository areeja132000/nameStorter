package com.namesorter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class NameSorterTest {

	@Test
	void testNullList() {
		List<String> unsortedNames = null; 
		
		List<String> sortedNames = new ArrayList<>();
		
		assertEquals(sortedNames, NameSorter.sortNames(unsortedNames));
	}
	
	@Test
	void testEmptyList() {
		List<String> unsortedNames = new ArrayList<>();
		unsortedNames.add("");
		
		List<String> sortedNames = new ArrayList<>();
		
		assertEquals(sortedNames, NameSorter.sortNames(unsortedNames));
	}
	
	@Test
	void testValidList() {
		List<String> unsortedNames = new ArrayList<>();
		unsortedNames.add("Gary Anne Jock");
		unsortedNames.add("Gary Bob Abel");
		unsortedNames.add("Gary Sheppard Cain");
		
		List<String> sortedNames = new ArrayList<>();
		sortedNames.add("Gary Bob Abel");
		sortedNames.add("Gary Sheppard Cain");
		sortedNames.add("Gary Anne Jock");
		
		assertEquals(sortedNames, NameSorter.sortNames(unsortedNames));
	}
	
	@Test
	void testSameLastName() {
		List<String> unsortedNames = new ArrayList<>();
		unsortedNames.add("Gary Anne Jock");
		unsortedNames.add("Gary Sheppard Jock");
		unsortedNames.add("Gary Bob Jock");
		
		List<String> sortedNames = new ArrayList<>();
		sortedNames.add("Gary Anne Jock");
		sortedNames.add("Gary Bob Jock");
		sortedNames.add("Gary Sheppard Jock");
		
		assertEquals(sortedNames, NameSorter.sortNames(unsortedNames));
	}
	
	@Test
	void testDuplicateLastNames() {
		List<String> unsortedNames = new ArrayList<>();
		unsortedNames.add("Gary Anne Jock");
		unsortedNames.add("Gary Sheppard Ferdenand");
		unsortedNames.add("Gary Sheppard Jock");
		unsortedNames.add("Gary Sheppard Antonio");
		unsortedNames.add("Gary Bob Jock");
		unsortedNames.add("Amy Anne Ferdenand");
		unsortedNames.add("Gary Bob Ferdenand");
		unsortedNames.add("Gary Bob Antonio");
		
		
		List<String> sortedNames = new ArrayList<>();
		sortedNames.add("Gary Bob Antonio");
		sortedNames.add("Gary Sheppard Antonio");
		sortedNames.add("Amy Anne Ferdenand");
		sortedNames.add("Gary Bob Ferdenand");
		sortedNames.add("Gary Sheppard Ferdenand");
		sortedNames.add("Gary Anne Jock");
		sortedNames.add("Gary Bob Jock");
		sortedNames.add("Gary Sheppard Jock");

		assertEquals(sortedNames, NameSorter.sortNames(unsortedNames));
	}
	
	@Test
	void testInvalidNames() {
		List<String> unsortedNames = new ArrayList<>();
		unsortedNames.add("Bobby");
		unsortedNames.add("Gary Sheppard Antonio");
		unsortedNames.add("Gary Bob Jock");
		unsortedNames.add("Amy Anne Ferdenand");
		unsortedNames.add("4523");
		
		
		List<String> sortedNames = new ArrayList<>();
		sortedNames.add("Gary Sheppard Antonio");
		sortedNames.add("Amy Anne Ferdenand");
		sortedNames.add("Gary Bob Jock");

		assertEquals(sortedNames, NameSorter.sortNames(unsortedNames));
	}

}
