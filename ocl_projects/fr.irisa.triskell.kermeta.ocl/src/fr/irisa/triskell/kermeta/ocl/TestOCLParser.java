package fr.irisa.triskell.kermeta.ocl;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ocl.expressions.ExpressionsFactory;
import org.eclipse.emf.ocl.expressions.OCLExpression;
import org.eclipse.emf.ocl.expressions.impl.ExpressionsFactoryImpl;
import org.eclipse.emf.ocl.internal.parser.OCLLexer;
import org.eclipse.emf.ocl.parser.EcoreEnvironmentFactory;
import org.eclipse.emf.ocl.parser.EnvironmentFactory;
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

	public static final String trivial = "package p1 \n \n context  Test inv : \n 2 > 1 endpackage";   
	public static final String speeds1 = "package p1 \n \n context Function inv: \n  self.parameter->isUnique(name) \n endpackage";
	public static final String speeds2 = "package p1 \n \n context BindingEnd inv: \n  role->isEmpty() implies port.end = binding.end \n endpackage";
	public static final String speeds3 = "package p2 \n \n " +
		"context SwitchAction inv:     let dt : DataType = self.switchExpression.type()" +
		" in    self.case.value->forAll(ex | ex.conformsTo(dt))  endpackage";
	public static final String speeds4 = "package p2 \n \n " +
		"context PinLink inv: " +
		"   self.pin->forAll( p | " + 
		"      p.oclIsKindOf(BlockPin)" + 
		"       implies" +  
		"          p.oclAsType(BlockPin).block = self.block   or " +
		"			p.oclAsType(BlockPin).block.compositeBlock = self.block   ) endpackage";
	public static final String speeds5 = "package p2 \n \n " +
		" context RecordNavigation inv:" +
		"     self.mycontext.type().oclAsType(Record).field->includes(self.field) " +
	    " endpackage";

	public static final String oclInputFileName = "AllSpeeds.ocl";
	
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
	
	public static void main(String[] args) {
		TestOCLParser oclp = new TestOCLParser();
		URI oclSourceURI = URI.createFileURI(oclInputFileName);
		File oclSourceFile = new File("/home/mskipper/runtime-EclipseApplication//fr.irisa.triskell.kermeta.ocl/ocl/allSpeeds.ocl");
		
		String oclSource =  getContents(oclSourceFile);
		//System.out.println(oclSource);
		//oclp.run(trivial, "essai.xmi");
		//oclp.run(speeds1, "speedsOCL1.xmi");
		//oclp.run(speeds2, "speedsOCL2.xmi");
		//oclp.run(speeds3, "speedsOCL3.xmi");
		//oclp.run(speeds4, "speedsOCL4.xmi");
		//oclp.run(speeds5, "speedsOCL5.xmi");
		oclp.run(oclSource, "model/allSpeedsOCL.xmi");
	}

	private static MyOCLParser createParser(String text) {
		OCLLexer lexer = new OCLLexer((text).toCharArray());
		MyOCLParser result = new MyOCLParser(lexer);
		return result;
	}

}
