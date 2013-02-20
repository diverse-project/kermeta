package org.kermeta.utils.helpers;

public class StringHelper {

	
	public static String trimDocumentation(String input) {
		
		String result="";
				
		String[] contents = input.split("\n|\r|\r\n");
		
		for (int i=0;i<contents.length;i++) {
			
			String localTrimmed = contents[i].trim();
			
			int index=returnFirstIndex(localTrimmed);
			String lineResult="";
			if (index!=localTrimmed.length()) {
				lineResult=localTrimmed.substring(index);
			} 
				
			// if this is the last line, there is a "*/" at the end to trim
			if ((i==contents.length-1)&&(lineResult.length()>0)) {
				lineResult=lineResult.substring(0,lineResult.lastIndexOf("*"));
			}
			
			result=result+lineResult+System.getProperty("line.separator");
		
		}		
		
		return result;
	}
	
	private static int returnFirstIndex(String input) {
		
		char[] chars = input.toCharArray();
		for(int i=0;i<chars.length;i++) {
			char c = chars[i];
			if (c!=' ' && c!='/' && c!='*') {
				return i;
			}
			if (i==chars.length-1) {
				// The whole line must be trimmed
				return i+1;
				
			}
		}
		
		return 0;
		
	}
}
