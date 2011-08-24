package org.kermeta.utils.helpers;

public class StringHelper {

	
	public static String trimDocumentation(String input) {
		
		System.err.println("trimDocumentation for");
		System.err.println(input);
		System.err.println();
		System.err.println("line.separator:(" + System.getProperty("line.separator") + ")");
		String[] contents = input.split(System.getProperty("line.separator"));
		System.err.println("number of lines in the string : " + contents.length);
		for (int i=0;i<contents.length;i++) {
			System.err.println("line read:"+contents[i]);
		}
		
		
		return null;
	}
}
