package com.namesorter;

import java.io.IOException;
import java.util.List;

public interface IHandler {
	public List<String> readAllLines() throws IOException;
	public void writeAllLines(List<String> sortedNames);
}
