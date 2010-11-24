

/*$Id: TagHelper.java,v 1.4 2008-07-08 13:18:39 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	TagHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.language.helpers;

import java.util.Iterator;

import org.kermeta.language.structure.ModelingUnit;
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
	 * @param packageQualifiedName
	 * @return
	 */
	static public Package getOrCreatePackage(ModelingUnit modelingUnit, String packageQualifiedName) {
		Package result = findPackage(modelingUnit, packageQualifiedName);
		if ( result != null ) {
			return result;
		}
		String[] parts = packageQualifiedName.split("::");
		StringBuffer currentQualifiedName = new StringBuffer();
		String currentName = "";
		Package currentPackage = null;
		
		for ( int i = 0; i < parts.length; i++ ) {
			
			currentQualifiedName.append(parts[i]);
			currentName = parts[i];
			
			Package p = findPackage(modelingUnit, currentQualifiedName.toString() );
			if ( p == null ) {
				p = StructureFactory.eINSTANCE.createPackage();
				p.setName( currentName );
				
				modelingUnit.getPackages().add( p );
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
		String[] parts = packageQualifiedName.split("::");
		String currentName = "";
		Package currentPackage = null;
		for ( int i = 0; i < parts.length; i++ ) {
			currentName = parts[i];
			Iterator<Package> it;
			if(currentPackage == null){
				it = modelingUnit.getPackages().iterator();
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


