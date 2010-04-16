package org.kermeta.language.filegraph.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

public class FileTraversal {

	public static List<String> getRequires(String uri) {
		List<String> requires = new ArrayList<String>();
		try {

			String sCurrentLine;
			//read each line of the file
			URI _uri = URI.createURI(uri);
			URIConverter converter = new ExtensibleURIConverterImpl();
			 
			BufferedReader br = new BufferedReader(
					 new InputStreamReader(converter.createInputStream(_uri)));
			 
			while ((sCurrentLine = br.readLine()) != null) {
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
