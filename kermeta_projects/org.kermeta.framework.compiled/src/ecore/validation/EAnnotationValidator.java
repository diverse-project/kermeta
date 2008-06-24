/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EAnnotationValidator.java,v 1.1 2008-06-24 14:23:23 cfaucher Exp $
 */
package ecore.validation;

import ecore.EModelElement;
import ecore.EObject;
import ecore.EStringToStringMapEntry;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ecore.EAnnotation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EAnnotationValidator
{
  boolean validate();

  boolean validateReferences(EList<EObject> value);
  boolean validateDetails(EList<EStringToStringMapEntry> value);
  boolean validateSource(String value);
  boolean validateContents(EList<EObject> value);
  boolean validateEModelElement(EModelElement value);
}
