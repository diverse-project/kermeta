package fr.irisa.triskell.kermeta.ocl;

import java.io.IOException;
import java.util.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import org.eclipse.emf.ocl.expressions.ExpressionsFactory;
//import org.eclipse.emf.ocl.expressions.OCLExpression;
//import org.eclipse.emf.ocl.expressions.impl.ExpressionsFactoryImpl;
import org.eclipse.emf.ocl.internal.parser.OCLLexer;
//import org.eclipse.emf.ocl.parser.EcoreEnvironmentFactory;
//import org.eclipse.emf.ocl.parser.EnvironmentFactory;
import org.eclipse.emf.ocl.parser.ParserException;
import java.io.*;

public class TestOCLParser {
	Resource resource;

	protected void saveList(EList l) {
		for (Object o1 : l) {
			EObject o = (EObject) o1;
			resource.getContents().add(o);
			this.saveList(o.eCrossReferences());
		}
	}

		
	
	public void run(String ocltext, String uri) {
		MyOCLParser parser = createParser(ocltext); //$NON-NLS-1$
		EObject constraint = null;
		try {
			constraint = parser.parse();
			System.out.println(constraint.toString());
		} catch (ParserException e) {
			e.printStackTrace();
		}

		if (constraint != null) {
			URI fileURI = URI.createFileURI(uri);
			resource = new XMIResourceFactoryImpl().createResource(fileURI);
			resource.getContents().add(constraint);
			this.saveList(constraint.eCrossReferences());
			try {
				resource.save(Collections.EMPTY_MAP);
				System.out.println("save");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

   // This is the example that causes output of invalid xmi file with 
	public static final String iftest = "package p \n \n " +
	" context Thing inv:" +
	"         if true and true then true else true endif " +
    " endpackage";

	//public static final String oclInputFileName = "AllSpeeds.ocl";
	
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
		 filenames.add("allSpeeds");
		 filenames.add("01-booleanLiterals");
		 filenames.add("02-logicalConjunction");
	 }
	 
	public static void main(String[] args) {
		new TestOCLParser().generateAllXmi();
		//ifTest();
	}
	
	public void generateAllXmi(){
		String baseDir = "/home/mskipper/runtime-EclipseApplication//fr.irisa.triskell.kermeta.ocl/";
		System.out.println("Processing: OCL SOURCE" );
		for (String fn: filenames){
			String oclSourceFileName = baseDir + "ocl/" + fn + ".ocl";
			String xmiOutputFileName = "model/" + fn + ".xmi";
			System.out.println("Processing: " + oclSourceFileName + " --> " + xmiOutputFileName  );
			File oclSourceFile = new File(oclSourceFileName);
			String oclSource =  getContents(oclSourceFile);
			new TestOCLParser().run(oclSource, xmiOutputFileName);
		}
	}

	public static void ifTest() {
		TestOCLParser oclp = new TestOCLParser();
		oclp.run(iftest, "model/iftest.xmi");
	}
	
	private static MyOCLParser createParser(String text) {
		OCLLexer lexer = new OCLLexer((text).toCharArray());
		MyOCLParser result = new MyOCLParser(lexer);
		return result;
	}

}
