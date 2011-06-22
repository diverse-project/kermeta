/* $Id: $
* Project    : org.kermeta.kp.migrateV1ToV2
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 22 juin 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/

package org.kermeta.kp.migratev1tov2.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RequireParser {
	
	private File parsedFile;
	
	public RequireParser (String pathFile) {
		parsedFile = new File(pathFile);	
	}
	
//--------------------------------------------------------------------------------------------------------------	
//	Parse require
//--------------------------------------------------------------------------------------------------------------
	public final List<String> processLineByLine() throws FileNotFoundException {
	    //Note that FileReader is used, not File, since File is not Closeable
	    Scanner scanner = new Scanner(new FileReader(parsedFile));
	    List<String> requiredFiles = new ArrayList <String>();
	    try {
	      //first use a Scanner to get each line
	      while ( scanner.hasNextLine() ){
	       String resultLine = processLine( scanner.nextLine() );
	       
	       // Remove require Kermeta to improve
	       if (!resultLine.isEmpty() && !resultLine.equals(" kermeta")) { // The line starts with a require
	    	   requiredFiles.add(resultLine);
	       }
	      }
	    }
	    finally {
	      //ensure the underlying stream is always closed
	      //this only has any effect if the item passed to the Scanner
	      //constructor implements Closeable (which it does in this case).
	      scanner.close();
	    }
	    return requiredFiles;
	}
	
	protected String processLine(String aLine){
	    //use a second Scanner to parse the content of each line 
		String requiredFile ="";
	    Scanner scanner = new Scanner(aLine);
	    Pattern p = Pattern.compile("require");
	
	    if ( scanner.hasNext() ){
	   String token = scanner.next();
	    Matcher m = p.matcher(token);
	    boolean b = m.matches();
	    if (b) { // there is a require in the line
	    	requiredFile = aLine.substring(m.regionEnd(), aLine.length());
	    }
	    }
	    //no need to call scanner.close(), since the source is a String
	    return requiredFile;
	  }
	
	
//---------------------------------------------------------------------------------------------------------------
// Parse mainClassAnnotation and mainOperation annotation
//---------------------------------------------------------------------------------------------------------------
	public String parseAnnotation(String annotationName)  throws FileNotFoundException {
	    //Note that FileReader is used, not File, since File is not Closeable
		String annotationValue = "";
	    Scanner scanner = new Scanner(new FileReader(parsedFile));
	    try {
		      //first use a Scanner to get each line
		      while ( scanner.hasNextLine() ){
		       String resultLine = processLineForAnnotation( scanner.nextLine(), annotationName );
		       if (!resultLine.isEmpty()) {
		    	   annotationValue = resultLine;
			      }
		      } 
		    }
		    finally {
		      //ensure the underlying stream is always closed
		      //this only has any effect if the item passed to the Scanner
		      //constructor implements Closeable (which it does in this case).
		      scanner.close();
		    }
		    return annotationValue;
	}
	
	
	protected String processLineForAnnotation(String aLine, String annotationName ){
	    //use a second Scanner to parse the content of each line 
		String annotationValue ="";
	    Scanner scanner = new Scanner(aLine);
	    Pattern p = Pattern.compile(annotationName);
	
	    if ( scanner.hasNext() ){
	   String token = scanner.next();
	    Matcher m = p.matcher(token);
	    boolean b = m.matches();
	    if (b) { // there is a value of an annotation in the line 
	    	// We do not want to have "main::Main" but main::Main
	    	String s = aLine.substring(m.regionEnd() + 1, aLine.length()-1);
	    	String [] splitquote =  s.split("\"");
	    	annotationValue = splitquote[1];
	    }
	    }
	    //no need to call scanner.close(), since the source is a String
	    return annotationValue;
	  }
	
}
