/* $Id: $
* Project    : org.kermeta.kp.migrateV1ToV2
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 22 juin 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/

package org.kermeta.kp.migraterequirev1tokp.eclipse.ui.parser;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** This class parses all require element in Kermeta V1 files  */
public class RequireParser {
	
	private File parsedFile;
	
	
	/** Constructor */
	public RequireParser (String pathFile) {
		parsedFile = new File(pathFile);	
	}
	
//-------------------------------------------------------------------------------------------------------------
// Global parse method
//-------------------------------------------------------------------------------------------------------------
	/** Process a line and search if it contains a require element 
	 @param aLine : the given line to be processed
	 @param parsedElt : the String we want to parse
	 @result : the requiredFile if the line contains a require element*/
	protected String processLine(String aLine, String parsedElt){
	    //use a second Scanner to parse the content of each line 
		String requiredFile ="";
	    Scanner scanner = new Scanner(aLine);
	    Pattern p = Pattern.compile(parsedElt);
	
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
	
	/** Add all lines of a given file in a list
	 @result : the list that contains all of the file lines */
	public List<String> parseInList() throws FileNotFoundException {
		  List<String> fileLines = new ArrayList <String>();
		  Scanner scanner = new Scanner(new FileReader(parsedFile));
		    try {
		      //first use a Scanner to get each line
		      while ( scanner.hasNextLine() ){
		       fileLines.add(scanner.nextLine());
		      }
		    }
		    finally {
		      //ensure the underlying stream is always closed
		      //this only has any effect if the item passed to the Scanner
		      //constructor implements Closeable (which it does in this case).
		      scanner.close();
		    }
		    return fileLines;
		}
		
	
	
//--------------------------------------------------------------------------------------------------------------	
//	Parse require
//--------------------------------------------------------------------------------------------------------------
	
	/** Process all the Kermeta file to find require elements
	 @result : the list of required files contained in the require */
	public final List<String> processLineByLine() throws FileNotFoundException {
	    //Note that FileReader is used, not File, since File is not Closeable
	    Scanner scanner = new Scanner(new FileReader(parsedFile));
	    List<String> requiredFiles = new ArrayList <String>();
	    try {
	      //first use a Scanner to get each line
	      while ( scanner.hasNextLine() ){
	       String resultLine = processLine( scanner.nextLine(), "require" );
	       
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
	
	
//---------------------------------------------------------------------------------------------------------------
// Parse mainClassAnnotation and mainOperation annotation
//---------------------------------------------------------------------------------------------------------------
	
	/** Parse the whole Kermeta file to search a given annotation
	 @param : annotationName : the name of the searched annotation
	 @result : the value of the searched annotation */
	public String parseAnnotation(String annotationName)  throws FileNotFoundException {
	    //Note that FileReader is used, not File, since File is not Closeable
		String annotationValue = "";
	    Scanner scanner = new Scanner(new FileReader(parsedFile));
	    try {
		      //first use a Scanner to get each line
		      while ( scanner.hasNextLine() ){
		       String resultLine = processLine( scanner.nextLine(), annotationName );
		       if (!resultLine.isEmpty()) {
		    	   annotationValue = resultLine;
		    	   
		    	// We do not want to have "main::Main" but main::Main (remove the quotes)
		    	   String [] splitquote =  annotationValue.split("\"");
			    	annotationValue = splitquote[1];
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
	
	
	//------------------------------------------------------------------------------------------
	// Parse stdio to change in Kermeta::Io::Stdio (by adding an using)
	//------------------------------------------------------------------------------------------
	
	public boolean has_element( String elt) throws FileNotFoundException {
	    //Note that FileReader is used, not File, since File is not Closeable
		// Init has stdio to false
		boolean has_stio = false;
	    Scanner scanner = new Scanner(new FileReader(parsedFile));
	   
	    try {
	      //first use a Scanner to get each line
	      while ( scanner.hasNextLine() ){
	       // stdio.writeln is considered as an only one token
	       String resultLine = processLine( scanner.nextLine(), "" );
	       
	       // Remove require Kermeta to improve
	       if (!resultLine.contains(elt) ) { // The line starts with a require
	    	   has_stio = true;
	       }
	      }
	    }
	    finally {
	      //ensure the underlying stream is always closed
	      //this only has any effect if the item passed to the Scanner
	      //constructor implements Closeable (which it does in this case).
	      scanner.close();
	    }
	    return  has_stio;
	}
}
