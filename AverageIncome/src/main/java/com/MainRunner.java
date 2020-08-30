package com;
import com.Reader;

import java.util.Iterator;

public class MainRunner {

	public static void main(String[] args) {
		Reader read = new Reader();
		String filename= "src/main/resources/Sample_input.csv";
		read.Read(filename);
		
	}

}
