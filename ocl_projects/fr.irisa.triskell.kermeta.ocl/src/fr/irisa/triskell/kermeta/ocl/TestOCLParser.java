package fr.irisa.triskell.kermeta.ocl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.parser.OCLAnalyzer;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class TestOCLParser {
	static Resource resource;

	public static void saveList(EList l) {
		for (Object o1 : l) {
			EObject o = (EObject) o1;
			resource.getContents().add(o);
			saveList(o.eCrossReferences());
		}
	}

	/*
	 *  Invoke the parser statically from Kermeta
	 *  for a file whose path is given in oclSourcePath
	 *  generating an output xmi file in the xmiOutputPath location
	 */
	public static void callParser(RuntimeObject oclSourcePath, RuntimeObject xmiOutputPath) throws ParserException {
		String sourcePath = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(oclSourcePath); 
		String targetPath = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(xmiOutputPath); 
		new TestOCLParser().run(sourcePath, targetPath);
	}
	
	public static void run(String ocltextfileUri, String uri) throws ParserException {
		// URI to file path
		URI oclfileURI = URI.createURI(ocltextfileUri);
		
		File oclSourceFile = new File(oclfileURI.toFileString());//new File(ocltextfile);
		String oclSource =  getContents(oclSourceFile);
		
		
		MyOCLParser parser = new MyOCLParser(oclSource);
		//MyOCLParser parser = createParser(oclSource); //$NON-NLS-1$
		EObject constraint = null;
			//System.err.println(ocltext + " essai");
			constraint = parser.parseConcreteSyntax();
			System.out.println(constraint.toString());
		

		if (constraint != null) {
			URI fileURI = URI.createURI(uri);
			resource = new XMIResourceFactoryImpl().createResource(fileURI);
			resource.getContents().add(constraint);
			saveList(constraint.eCrossReferences());
			try {
				resource.save(Collections.EMPTY_MAP);
				System.out.println("save");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	  /**
	  * Fetch the entire contents of a text file, and return it in a String.
	  * This style of implementation does not throw Exceptions to the caller.
	  *
	  * @param aFile is a file which already exists and can be read.
	  */
	  static public String getContents(File aFile) {
	    //...checks on aFile are elided
	    StringBuffer contents = new StringBuffer();

	    //declared here only to make visible to finally clause
	    BufferedReader input = null;
	    try {
	      //use buffering, reading one line at a time
	      //FileReader always assumes default encoding is OK!
	      input = new BufferedReader( new FileReader(aFile) );
	      String line = null; //not declared within while loop
	      /*
	      * readLine is a bit quirky :
	      * it returns the content of a line MINUS the newline.
	      * it returns null only for the END of the stream.
	      * it returns an empty String if two newlines appear in a row.
	      */
	      while (( line = input.readLine()) != null){
	        contents.append(line);
	        contents.append(System.getProperty("line.separator"));
	      }
	    }
	    catch (FileNotFoundException ex) {
	      ex.printStackTrace();
	    }
	    catch (IOException ex){
	      ex.printStackTrace();
	    }
	    finally {
	      try {
	        if (input!= null) {
	          //flush and close both "input" and its underlying FileReader
	          input.close();
	        }
	      }
	      catch (IOException ex) {
	        ex.printStackTrace();
	      }
	    }
	    return contents.toString();
	  }
	  
	 public static List<String> filenames = new ArrayList(); 
	 static {
		 filenames.add("01-booleanLiteralTrue");
		 filenames.add("02-booleanLiteralFalse");
		 filenames.add("03-logicalConjunction");
		 filenames.add("04-logicalDisjunction");
		 filenames.add("05-equality");
		 filenames.add("06-integerLiteral");
		 filenames.add("07-integerAddition");
		 filenames.add("08-integerSubtraction");
		 filenames.add("09");
		 filenames.add("10");
		 filenames.add("11");
		 filenames.add("12");
		 filenames.add("13");
		 filenames.add("14");
		 filenames.add("15");
		 filenames.add("16");
		 filenames.add("17");
		 filenames.add("18");
		 filenames.add("19");
		 filenames.add("20");
		 filenames.add("21");
		 filenames.add("22");
		 filenames.add("23");
		 filenames.add("24");
		 filenames.add("25");
		 filenames.add("26");
		 filenames.add("27");
		 filenames.add("28");
		 filenames.add("29");
		 filenames.add("30");
		 filenames.add("31");
		 filenames.add("32");
		 filenames.add("33");
		 filenames.add("34");
		 filenames.add("35");
		 filenames.add("36");
		 filenames.add("37");
		 filenames.add("38");
		 filenames.add("39");
		 filenames.add("40");
		 filenames.add("41");
		 filenames.add("42");
		 filenames.add("43");
		 filenames.add("44");
		 filenames.add("45");
		 filenames.add("46");
		 filenames.add("47");
		 filenames.add("48");
		 filenames.add("49");
		 filenames.add("50");
		 filenames.add("51");
		 filenames.add("52"); 
		 filenames.add("53"); 
		 filenames.add("54"); 
		 filenames.add("55"); 
		 filenames.add("56");
		 filenames.add("57"); 
		 filenames.add("58"); 
		 filenames.add("59");
		 filenames.add("60");
		 filenames.add("61"); 
		 filenames.add("62");
		 filenames.add("63");
		 filenames.add("64");
		 filenames.add("65");
		 filenames.add("66");
		 filenames.add("67");
		 filenames.add("68");
		 filenames.add("69");
		 filenames.add("70"); 
		 filenames.add("71"); 
		 filenames.add("72"); 
		 filenames.add("73"); 
		 filenames.add("74"); 
//		 filenames.add("ASMLogoStaticSemantics");
	//	 filenames.add("NamedElements");
	 }
	 
	public static void main(String[] args) {
		//String baseDir = "/udd/barais/runtime-New_configuration/fr.irisa.triskell.kermeta.ocl/";
		/*String baseDir = "/home/mskipper/runtime-EclipseApplication/fr.irisa.triskell.kermeta.ocl/";
		for (String fn: filenames){*/
			String oclSourceFileName = "ocl/" + "c04" + ".ocl";
			String xmiOutputFileName = "test/" + "c04" + ".xmi";
			System.out.println("Processing: " + oclSourceFileName + " --> " + xmiOutputFileName  );
			try {
				run(oclSourceFileName, xmiOutputFileName);
			} catch (ParserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	

}
