/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: TypeDefinitionValidator.java,v 1.1 2008-07-02 09:13:23 ftanguy Exp $
 */
package kermeta.language.structure.validation;


/**
 * A sample validator interface for {@link kermeta.language.structure.TypeDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TypeDefinitionValidator
{
  boolean validate();

  boolean validateIsAspect(boolean value);
}
