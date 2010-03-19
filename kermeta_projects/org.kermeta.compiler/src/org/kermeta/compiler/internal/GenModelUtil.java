

/*$Id: GenModelUtil.java,v 1.3 2009-02-20 13:27:46 dvojtise Exp $
* Project : org.kermeta.compiler
* File : 	GenModelUtil.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 juil. 2008
* Authors : paco
*/

package org.kermeta.compiler.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;

public class GenModelUtil {
	
	final static public Logger internalLog = LoggerFactory.getLogger("KermetaCompiler");

	static public GenPackage getGenPackage(GenModel genModel, String uri) {
		for ( GenPackage genPackage : genModel.getGenPackages() ) {
			GenPackage p = getGenpackage(genPackage, uri);
			if ( p != null )
				return p;
		}
		return null;
	}
	
	static private GenPackage getGenpackage(GenPackage genPackage, String uri) {
		if ( genPackage.getNSURI().equals(uri) )
			return genPackage;
		for ( GenPackage subPackage : genPackage.getSubGenPackages() ) {
			GenPackage p = getGenpackage(subPackage, uri);
			if ( p != null )
				return p;
		}
		return null;
	}
	
	
	/**
	 * Fixer on the genModel
	 * @param genModel
	 */
	public static void ePackageFixerAll(GenModel genModel) {
		for ( GenPackage _genPackage : genModel.getAllGenPackagesWithClassifiers() ) {
			prefixFixer(_genPackage);
			multipleEditorPagesFixer(_genPackage);			
		}
		multipleEqualsIgnoreCasePackageFixer(genModel);
	}
	
	/**
	 * 
	 * Fix the prefix of all the EPackages contained by a GenModel
	 * @param genModel
	 */
	public static void ePackagePrefixFixer(GenModel genModel) {
		for ( GenPackage _genPackage : genModel.getAllGenPackagesWithClassifiers() ) {
			prefixFixer(_genPackage);
		}
	}
	
	/**
	 * To avoid the use of 'Initialization By Loading' on all the genPackages
	 * @param genModel
	 */
	public static void ePackageLoadInitializationFixer(GenModel genModel) {
		for ( GenPackage _genPackage : genModel.getAllGenPackagesWithClassifiers() ) {
			loadInitializationFixer(_genPackage);
		}
	}
	
	/**
	 * Fixing the Prefix on a genPackage
	 * @param genPackage
	 */
	private static void prefixFixer(GenPackage genPackage) {
		genPackage.setPrefix(CodeGenUtil.capName(genPackage.getEcorePackage().getName()));
	}
	
	/**
	 * To avoid the use of 'Initialization of the EMF reflection by an Ecore file loading instead of generated Java code' on a genPackage
	 * Example: for UML metamodel, the Initialization by loading must be true to avoid too large generated body in methods
	 * @param genPackage
	 */
	private static void loadInitializationFixer(GenPackage genPackage) {
		genPackage.setLoadInitialization(false);
	}
	
	/**
	 * To avoid the generation of 'Multiple Editor Pages' on a genPackage
	 * @param genPackage
	 */
	private static void multipleEditorPagesFixer(GenPackage genPackage) {
		genPackage.setMultipleEditorPages(false);
	}
	
	/**
	 * If several packages use a similar name (ie. equalsIgnoreCase returns true)
	 * then some of them must be renamed
	 * @param genPackage
	 * @param genModel
	 */
	private static void multipleEqualsIgnoreCasePackageFixer(GenModel genModel) {
		boolean firstOccurence = true;
		HashMap<String,List<GenPackage>> hm = new HashMap<String,List<GenPackage>>();
		
		// build hash map that doesn't take into account the case of the qualified name
		for ( GenPackage genPackage : genModel.getAllGenPackagesWithClassifiers() ) {
			String caseInsensitiveQualifiedName = EcoreHelper.getQualifiedName(genPackage.getEcorePackage()).toLowerCase();
			if(!hm.containsKey(caseInsensitiveQualifiedName)){
				//add an entry
				hm.put(caseInsensitiveQualifiedName, new ArrayList<GenPackage>());
			}
			hm.get(caseInsensitiveQualifiedName).add(genPackage);			
		}
		// for each conflicting entry, apply a renaming rule
		for(String key : hm.keySet()){
			List<GenPackage> listGenPackage = hm.get(key);
			if(listGenPackage.size() > 1){
				int renameNumber = 1;
				boolean hasSkippedOne = false;
				for(GenPackage genPackage : listGenPackage){
					if(EcoreHelper.getQualifiedName(genPackage.getEcorePackage()).equals("ecore")){
						// this one must not be renamed, we should rather rename the other ones
						hasSkippedOne = true;
					}
					else{
						if(hasSkippedOne || renameNumber < listGenPackage.size()){
							genPackage.setBasePackage("renamed"+(renameNumber));
							genPackage.setPrefix("Renamed"+(renameNumber)+genPackage.getPrefix());	
						}
					}					
					renameNumber++;	
				}
			}
		}		
	}
}


