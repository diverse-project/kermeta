package fr.irisa.triskell.kermeta.ocl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.cst.CSTNode;
import org.eclipse.ocl.internal.l10n.OCLMessages;
import org.eclipse.ocl.parser.OCLAnalyzer;
import org.eclipse.ocl.parser.OCLLexer;
import org.eclipse.ocl.parser.OCLParser;

 
public class MyOCLParser extends OCLAnalyzer {

	protected String errorString=""; 
	
	private int errorReportLineOffset = 0;
	
	/**
	 * Creates an OCL parser ready to parse the given OCL source code.
	 * @param oclTextToParse
	 */
	public MyOCLParser(String oclTextToParse) {
		super(new MyEnvironement<Object, Object, Object, Object, Object, Object, Object, Object,Object,Object,Object,Object>(),oclTextToParse);
	}
	

}
