/*
 * Created on 21 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.emfatic;

import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import com.ibm.eclipse.emfatic.core.parser.EmfaticLexer;
import com.ibm.eclipse.emfatic.core.parser.EmfaticParser;

import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class EmfaticUnit extends KermetaUnit {

	
	com.ibm.eclipse.emfatic.core.ast.CompUnit emfaticAST = null;
	
	/**
	 * @param uri
	 */
	public EmfaticUnit(String uri) {
		super(uri);
		// TODO Auto-generated constructor stub
	}
	
	public void parse() {
		URI uri = URI.createURI(this.uri);
		URIConverter converter = new URIConverterImpl();
		EmfaticParser p;
		try {
		    p = new EmfaticParser(new EmfaticLexer(new InputStreamReader(converter.createInputStream(uri))));
		} 
		catch (IOException e1) {
		    error.add(new KMUnitError("i/o error loading ressource '"+this.uri+"': " + e1, null));
		    return;
		}
			
		try {
			emfaticAST = p.compUnit();
		}
		catch(Exception e) {
		    error.add(new KMUnitError("Parse error : " + e, null));
		    return;
		}
	}
	

	public void preLoad() {
		parse();
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadImportedUnits()
	 */
	public void loadImportedUnits() {
		ECore2KMPass pass = new ECore2KMPass1(this);
		emfaticAST.accept(pass);
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadTypeDefinitions()
	 */
	public void loadTypeDefinitions() {
		ECore2KMPass pass = new ECore2KMPass2(this);	
		emfaticAST.accept(pass);

	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadStructuralFeatures()
	 */
	public void loadStructuralFeatures() {
		ECore2KMPass pass = new ECore2KMPass3(this);	
		emfaticAST.accept(pass);

	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadOppositeProperties()
	 */
	public void loadOppositeProperties() {
		ECore2KMPass pass = new Ecore2KMPass4(this); 
		emfaticAST.accept(pass);

	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadBodies()
	 */
	public void loadBodies() {
		// NOTHING

	}

}
