package org.kermeta.language.umlprofile2ecore.api;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Profile;

public interface UmlProfile2Ecore {

	/**
	 * Converts the given uml profile into a collection of ecore packages.
	 * @param umlProfile The UML profile to convert.
	 * @return A collection of Ecore packages.
	 */
	public Collection<EPackage> convertUmlProfile(Profile umlProfile);
	
}
