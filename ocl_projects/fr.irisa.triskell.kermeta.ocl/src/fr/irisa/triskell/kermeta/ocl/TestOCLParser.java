package fr.irisa.triskell.kermeta.ocl;

import java.io.IOException;
import java.util.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ocl.parser.EnvironmentFactory;
import org.eclipse.emf.ocl.parser.EvaluationEnvironment;
//import org.eclipse.emf.ocl.expressions.ExpressionsFactory;
//import org.eclipse.emf.ocl.expressions.OCLExpression;
//import org.eclipse.emf.ocl.expressions.impl.ExpressionsFactoryImpl;
//import org.eclipse.emf.ocl.internal.parser.OCLLexer;
//import org.eclipse.emf.ocl.parser.EcoreEnvironmentFactory;
//import org.eclipse.emf.ocl.parser.EnvironmentFactory;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.internal.parser.OCLLexer;

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
		 filenames.add("definition");
		 filenames.add("preAndPost");
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
	 }
	 
	public static void main(String[] args) {
		new TestOCLParser().generateAllXmi();
		//ifTest();
	}
	
	public void generateAllXmi(){
		//String baseDir = "/udd/barais/runtime-New_configuration/fr.irisa.triskell.kermeta.ocl/";
		String baseDir = "/home/mskipper/runtime-EclipseApplication/fr.irisa.triskell.kermeta.ocl/";
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
		MyOCLParser result = new MyOCLParser(lexer, new MyEnvironement<Object, Object, Object, Object, Object, Object, Object, Object,Object,Object,Object,Object>());
		return result;
	}

}
