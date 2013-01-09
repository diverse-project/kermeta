package org2.kermeta.kompren.slicer.util;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public final class EcoreUtils {
	public static EcoreUtils INSTANCE = new EcoreUtils();

	private EcoreUtils() {
		super();
	}

	
	public String getQualifiedName(final EStructuralFeature elt, final String sep) {
		if(elt==null) return "";
		if(elt.getEContainingClass()==null) return elt.getName();
		return getQualifiedName(elt.getEContainingClass(), sep) + sep + elt.getName();
	}
	

	public String getQualifiedName(final EClassifier elt, final String sep) {
		if(elt==null) return "";
		if(elt.getEPackage()==null) return elt.getName();
		return getQualifiedName(elt.getEPackage(), sep) + sep + elt.getName();
	}


	public String getQualifiedName(final EPackage elt, final String sep) {
		if(elt==null) return "";
		if(elt.getESuperPackage()==null) return elt.getName();
		return getQualifiedName(elt.getESuperPackage(), sep) + sep + elt.getName();
	}
}
