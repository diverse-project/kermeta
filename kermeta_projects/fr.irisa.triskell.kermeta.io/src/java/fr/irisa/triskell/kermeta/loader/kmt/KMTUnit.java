/* $Id: KMTUnit.java,v 1.26 2007-01-08 17:17:34 ftanguy Exp $
 * Project : Kermeta (First iteration)
 * File : KMTUnit.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 23, 2005
 * Author : ffleurey
 * Description : 
 *   -
 * 	 -
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.ast.CompUnit;
import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.message.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.message.KMUnitParseError;
import fr.irisa.triskell.kermeta.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.KermetaParser;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.parser.KermetaParserHelper;


/**
 * A class that contains methods that load a KermetaUnit from a kermeta text
 */
public class KMTUnit extends KermetaUnit {

	CompUnit mctAST = null;
	
	
	/**
	 * 
	 */
	public KMTUnit(String uri, Hashtable packages) {
		super(uri, packages);
	}
	
	public void discardTraceabilityInfo() {
	    KermetaUnit.internalLog.info("Clearing traceability from text to model in order to free memory");
	    mctAST = null;
	    traceM2T.clear();
	    traceT2M.clear();
	}
	
	public KermetaASTNode getKMTAstNodeForModelElement(fr.irisa.triskell.kermeta.language.structure.Object element) {
	    return (KermetaASTNode)getNodeByModelElement(element);
	}
	
	public void parse() {
		
		
		URI uri = URI.createURI(this.uri);
		URIConverter converter = new URIConverterImpl();
		KermetaParser p;
		try {
			KermetaUnit.internalLog.info("PARSE UNIT : " + uri.toString());
			InputStream stream = converter.createInputStream(uri);
			// (remove the annoying tabs)
		    p = new KermetaParser(new KermetaLexer(new StringReader(readAll(stream).replace('\t', ' '))));
			//p = new KermetaParser(new KermetaLexer(new BufferedReader(new StringReader(readAll(stream)))));
		} 
		catch (IOException e1) {
		    //messages.addError("i/o error loading ressource '"+this.uri+"': " + e1, null);
		    messages.addError("i/o error : " + e1.getMessage(), null);
		    KermetaUnit.internalLog.debug("i/o error loading ressource '"+this.uri+"': " + e1, null);
		    return;
		}
		
		try {
			mctAST = p.compUnit();
		}
		catch(Exception e) {
		    messages.addMessage(new KMUnitParseError(e));
		    return;
		}
	}
	
	public void parseString(String document) {
		//KermetaParser p;
		//p = new KermetaParser(new KermetaLexer(new StringReader(document.replace('\t', ' '))));
		//p = new KermetaParser(new KermetaLexer(new StringReader(document)));
		try {
			
			mctAST = KermetaParserHelper.parse(document);
			
			//mctAST = p.compUnit();
		}
		catch(Exception e) {
			messages.addMessage(new KMUnitParseError(e));
		    return;
		}
	}
	
	public void preLoad() {
		if (mctAST == null) parse();
	}
	
	protected static String readAll(InputStream in)
	{ 
	    StringBuffer output = new StringBuffer();
	    try
	    {
	        int c; 
	       // int charcount = 0; int linenum = 1; int c_old = -1;
	        while ((c = in.read()) != -1) {
	            output.append((char)c);
	        }
	        in.close();
	    }
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    }
	    return output.toString();
	}
	
    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadAnnotations()
     */
    public void loadAnnotations() {
        KMT2KMPass pass = new KMT2KMPass7(this);
       mctAST.accept(pass);

    }
	public void loadBodies() {
		KMT2KMPass pass = new KMT2KMPass6(this); 
		mctAST.accept(pass);

	}
	public void loadImportedUnits() {
		KMT2KMPass pass = new KMT2KMPass1(this); 
		mctAST.accept(pass);

	}
	public void loadOppositeProperties() {
		KMT2KMPass pass = new KMT2KMPass4(this); 
		mctAST.accept(pass); 
		if (this.messages.hasError()) return;
		pass = new KMT2KMPass5(this); mctAST.accept(pass);

	}
	public void loadStructuralFeatures() {
		KMT2KMPass pass = new KMT2KMPass3(this); 
		mctAST.accept(pass);

	}
	public void loadTypeDefinitions() {
		KMT2KMPass pass = new KMT2KMPass2(this); 
		mctAST.accept(pass);
		if (this.messages.hasError()) return;
		pass = new KMT2KMPass2_1(this);
		mctAST.accept(pass);
	}
	
    public CompUnit getMctAST() {
        return mctAST;
    }
    
}