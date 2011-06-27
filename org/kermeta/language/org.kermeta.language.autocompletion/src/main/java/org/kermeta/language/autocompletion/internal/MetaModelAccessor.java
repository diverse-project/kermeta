package org.kermeta.language.autocompletion.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.language.behavior.VariableDecl;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Package;


public class MetaModelAccessor {
	
	HashMap<String,ArrayList<EObject>> metamodelObjects = new HashMap<String, ArrayList<EObject>>(); 
	
	public MetaModelAccessor(ModelingUnit aModelingUnit) {
		
		TreeIterator<EObject> objects = aModelingUnit.eAllContents();				
		while (objects.hasNext()) {
			
			EObject element = objects.next();
			
			ArrayList<EObject> theObjects = metamodelObjects.get(element.eClass().getName());
			
			if (theObjects != null) {
				theObjects.add(element);				
			} else {
				theObjects = new ArrayList<EObject>();
				theObjects.add(element);
				metamodelObjects.put(element.eClass().getName(), theObjects);
			}
		}
	}
	
	public List<String> getAllVariableDecl() {
		List<String> result = new ArrayList<String>();
		try {
			for (EObject oneVariable : metamodelObjects.get("VariableDecl")) {
				result.add(((VariableDecl)oneVariable).getIdentifier());
			}
			return result;
		} catch (NullPointerException e) {
			return result;
		}
	}
	
	public List<String> getAllOperations() {
		List<String> result = new ArrayList<String>();
		try {
			for (EObject oneOperation : metamodelObjects.get("Operation")) {
				result.add(((Operation)oneOperation).getName());
			}
			return result;
		} catch (NullPointerException e) {
			return result;
		}
	}
	
	public List<String> getAllClassDefinition() {
		List<String> result = new ArrayList<String>();
		try {
			for (EObject oneClassDef : metamodelObjects.get("ClassDefinition")) {
				result.add(((ClassDefinition)oneClassDef).getName());
			}
			return result;
		} catch (NullPointerException e) {
			return result;
		}
	}
	
	public List<String> getAllPackages() {
		List<String> result = new ArrayList<String>();
		try {
			for (EObject onePackage : metamodelObjects.get("Package")) {
				result.add(((Package)onePackage).getName());
			}
			return result;
		} catch (NullPointerException e) {
			return result;
		}
	}

}
