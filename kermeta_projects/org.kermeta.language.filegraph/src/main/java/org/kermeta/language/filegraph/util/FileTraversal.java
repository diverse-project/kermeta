/*$Id : $
* Project : org.kermeta.language.filegraph
* File : 	FileTraversal.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 avr. 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.language.filegraph.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

public class FileTraversal {

	public static List<String> getRequires(URI uri) {
		List<String> requires = new ArrayList<String>();
		try {

			String sCurrentLine;
			// read each line of the file
			URI _uri = uri;
			URIConverter converter = new ExtensibleURIConverterImpl();
			 
			BufferedReader br = new BufferedReader(
					 new InputStreamReader(converter.createInputStream(_uri)));

			boolean inBlockComment = false;
			while ((sCurrentLine = br.readLine()) != null) {
				boolean inLineCommment = false;
				StringTokenizer st = new StringTokenizer(sCurrentLine);
				while (st.hasMoreTokens()) {
					String token = st.nextToken(); 
					if(token.startsWith("//"))
						inLineCommment = true;
					if(token.startsWith("/*"))
						inBlockComment =  true;
					if(token.endsWith("*/"))
						inBlockComment =  false;
					if(!inLineCommment && !inBlockComment){
						// ignore commented tokens
						if(token.equals("require")){
							// next token is our string 
							// TODO deal with require split on 2 lines ?
							String rawUri = st.nextToken();
							if (rawUri != null){
								String currUri = rawUri.replaceAll("\"", "");
								requires.add(currUri);
							}
						}
					}
			    }
				inLineCommment = false; // reset for next line
				
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

		return requires;
	}
}
