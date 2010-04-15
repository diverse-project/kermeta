package org.kermeta.language.filegraph.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTraversal {

	public static List<String> getRequires(String uri) {
		List<String> requires = new ArrayList<String>();
		try {

			String sCurrentLine;
			//read each line of the file
			BufferedReader br = new BufferedReader(new FileReader(uri));
			
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println("sCurrentLine" + sCurrentLine);
				if (sCurrentLine.contains("require")&& !sCurrentLine.startsWith("//")&& 
						!sCurrentLine.startsWith("/*")&& !sCurrentLine.startsWith("*")){
					int uriStart = sCurrentLine.indexOf("\"")+1;
					int uriEnd = sCurrentLine.lastIndexOf("\"");
					String currUri = sCurrentLine.substring(uriStart, uriEnd);
					if (currUri != null){
						requires.add(currUri);
					}
				}
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

		return requires;
	}
}
