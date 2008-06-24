/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EStringToStringMapEntryValidator.java,v 1.1 2008-06-24 14:23:22 cfaucher Exp $
 */
package ecore.validation;


/**
 * A sample validator interface for {@link ecore.EStringToStringMapEntry}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EStringToStringMapEntryValidator
{
  boolean validate();

  boolean validateValue(String value);
  boolean validateKey(String value);
}
