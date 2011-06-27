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
import org.kermeta.language.structure.Using;


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
	
	public List<String> getAllClassDefinition(String thePackages) {
		List<String> result = new ArrayList<String>();
		try {
			Package concernedPackage = getPackage(thePackages);
			
			TreeIterator<EObject> objects = concernedPackage.eAllContents(); 
			while (objects.hasNext()) {
				EObject anObject = objects.next();
				if (anObject.eClass().getName().equals("ClassDefinition")) {
					result.add(((ClassDefinition)anObject).getName());
				}
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
				if (((Package)onePackage).getNestingPackage() == null) {
					result.add(((Package)onePackage).getName());
				}
			}
			return result;
		} catch (NullPointerException e) {
			return result;
		}
	}
		
	public List<String> getSubPackages(String thePackage) {
		List<String> result = new ArrayList<String>();
				
		try {
					
			for (EObject aPackage : getSubPackagesPackage(thePackage,false)) {
				result.add(((Package)aPackage).getName());
			}
			
			return result;
		} catch (NullPointerException e) {
			return result;
		}
	}
	
	private Package getPackage(String packageToFind) {
		
		String[] temp = packageToFind.split("::");
		String packageToGet = temp[temp.length-1];
		
		List<EObject> thePackages = getSubPackagesPackage(packageToFind,true);
		for (EObject onePackage : thePackages) {
			if (((Package)onePackage).getName().equals(packageToGet)) {
				return ((Package)onePackage);
			}
		}
		
		return null;		
	}
	
	private List<EObject> findSubPackages(String packageToFind, List<EObject> packagesToUse) {
		
		List<EObject> result = new ArrayList<EObject>();
		
		for (EObject aPackageToUse : packagesToUse) {
			if (((Package)aPackageToUse).getName().equals(packageToFind)) {
				result.addAll(((Package)aPackageToUse).getNestedPackage());
			}
		}
		
		return result;
	}
	
	private List<EObject> getSubPackagesPackage(String thePackage, boolean removeTheLast) {
		String[] allPackages = thePackage.split("::");

		List<EObject> listToUse = metamodelObjects.get("Package");
		int limit = removeTheLast?allPackages.length-1:allPackages.length;
		for (int i=0;i<=limit-1;i++) {
			String packageToFind = allPackages[i];
			List<EObject> temp = findSubPackages(packageToFind, listToUse);
			listToUse = temp;
		}
		
		return listToUse;
	}

}
