/*$Id: $
* Project : fr.irisa.triskell.kermeta.io
* File : 	ContainedTypeDefinitionfinder.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 2 avr. 2010
* Authors : Didier Vojtisek
*/

package fr.irisa.triskell.kermeta.modelhelper.tool;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

public class ContainedTypeDefinitionFinder  extends KermetaOptimizedVisitor {
	/**
	 * The typeDefinitions found
	 */
	protected List <TypeDefinition> containedTypeDefinitions = new ArrayList <TypeDefinition> ();
	
	public List<TypeDefinition> getContainedTypeDefinitions() {
		return containedTypeDefinitions;
	}

	public static List<TypeDefinition> findContainedTypeDefinitions(EObject root){
		ContainedTypeDefinitionFinder finder = new ContainedTypeDefinitionFinder();
		finder.accept(root);
		return finder.getContainedTypeDefinitions();
	}
	
	
}
