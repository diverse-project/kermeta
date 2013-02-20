

/*$Id: TagHelper.java,v 1.4 2008-07-08 13:18:39 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	TagHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.language.utilities.helpers;

import java.util.Iterator;

import org.kermeta.language.util.ModelingUnit;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.Package;
import org.kermeta.language.structure.StructureFactory;

public class ModelingUnitHelper {

	/** 
	 * This is a helper class containing static operations, cannot create instance of it
	 */
	private ModelingUnitHelper(){		
	}
	
	/**
	 * recursively create a Package from a qualified name
	 * If already exist, simply return the existing Package
	 * The qulified name must use the metamodelname#
	 * @param packageQualifiedName
	 * @return
	 */
	static public Package getOrCreatePackage(ModelingUnit modelingUnit, String packageQualifiedName) {
		Package result = findPackage(modelingUnit, packageQualifiedName);
		if ( result != null ) {
			return result;
		}
		
		String[] mmParts = packageQualifiedName.split("#");
		
		Metamodel mm = null;
		for(Metamodel aMM : modelingUnit.getMetamodels()){
			if(aMM.getName().equals(mmParts[0])){
				mm = aMM;
				break;
			}
		}
		if(mm == null) return null;
		
		String[] packageParts = mmParts[1].split("::");
		StringBuffer currentQualifiedName = new StringBuffer();
		String currentName = "";
		Package currentPackage = null;
		
		for ( int i = 0; i < packageParts.length; i++ ) {
			
			currentQualifiedName.append(packageParts[i]);
			currentName = packageParts[i];
			
			Package p = findPackage(modelingUnit, currentQualifiedName.toString() );
			if ( p == null ) {
				p = StructureFactory.eINSTANCE.createPackage();
				p.setName( currentName );
				
				mm.getPackages().add( p );
				if ( currentPackage != null ){
					currentPackage.getNestedPackage().add( p );
				}
			} 
			currentPackage = p;
			
			currentQualifiedName.append("::");
			
		}
		return currentPackage;	
	}
	
	/**
	 * finds the Package with the given QalifiedName or null if not in this ModelingUnit
	 * @param modelingUnit
	 * @param packageQualifiedName
	 * @return
	 */
	static public Package findPackage(ModelingUnit modelingUnit, String packageQualifiedName) {
		Package result = null;
		String[] mmParts = packageQualifiedName.split("#");
		
		Metamodel mm = null;
		for(Metamodel aMM : modelingUnit.getMetamodels()){
			if(aMM.getName().equals(mmParts[0])){
				mm = aMM;
				break;
			}
		}
		if(mm == null) return null;
		
		String[] packageParts = mmParts[1].split("::");
		String currentName = "";
		Package currentPackage = null;
		for ( int i = 0; i < packageParts.length; i++ ) {
			currentName = packageParts[i];
			Iterator<Package> it;
			if(currentPackage == null){
				it = mm.getPackages().iterator();
			}
			else{
				it = currentPackage.getNestedPackage().iterator();
			}
			boolean found = false;
			Package internalPackage = null;
			while (it.hasNext() && !found){
				internalPackage = it.next();
				if(internalPackage.getName().equals(currentName)){
					found = true;
				}
			}
			if(found){
				currentPackage = internalPackage;
			}
			else{
				return null;
			}
		}
		return result;
	}
	
}


