package org.kermeta.language.autocompletion.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.language.behavior.VariableDecl;
import org.kermeta.language.structure.ModelingUnit;


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

}