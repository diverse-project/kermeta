/* $Id: KMTUnit.java,v 1.4 2005-03-03 15:28:14 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : KMTUnit.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 23, 2005
 * Author : ffleurey
 * Description : 
 *   -
 * TODO : 
 * 	 -
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

//import org.eclipse.emf.common.util.URI;
import java.net.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.ast.CompUnit;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.KermetaParser;
import fr.irisa.triskell.kermeta.utils.UserDirURI;


/**
 * A class that contains methods that load a KermetaUnit from a 
 */
public class KMTUnit extends KermetaUnit {

	CompUnit mctAST = null;
	
	/**
	 * 
	 */
	public KMTUnit(String uri) {
		super(uri);
	}
	
	
	public void parse() {
		URI _uri = UserDirURI.createURI(this.uri);
		KermetaParser p;
		System.out.println("URI="+_uri);
		try {
		    p = new KermetaParser(new KermetaLexer(new FileInputStream(new File(_uri))));
		} 
		catch (IOException e1) {
		    error.add(new KMUnitError("i/o error loading ressource '"+this.uri+"': " + e1, null));
		    return;
		}
			
		try {
			mctAST = p.compUnit();
		}
		catch(Exception e) {
		    error.add(new KMUnitError("Parse error : " + e, null));
		    return;
		}
	}
	
	public void parseString(String document) {
		KermetaParser p;
		p = new KermetaParser(new KermetaLexer(new StringReader(document)));
		try {
			mctAST = p.compUnit();
		}
		catch(Exception e) {
		    error.add(new KMUnitError("Parse error : " + e, null));
		    return;
		}
	}
	
	public void preLoad() {
		if (mctAST == null) parse();
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
		if (this.getError().size() > 0) return;
		pass = new KMT2KMPass5(this); mctAST.accept(pass);

	}
	public void loadStructuralFeatures() {
		KMT2KMPass pass = new KMT2KMPass3(this); 
		mctAST.accept(pass);

	}
	public void loadTypeDefinitions() {
		KMT2KMPass pass = new KMT2KMPass2(this); 
		mctAST.accept(pass);

	}
}