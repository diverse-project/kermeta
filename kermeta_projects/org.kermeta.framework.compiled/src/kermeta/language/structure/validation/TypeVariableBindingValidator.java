/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: TypeVariableBindingValidator.java,v 1.1 2008-06-24 14:23:25 cfaucher Exp $
 */
package kermeta.language.structure.validation;

import kermeta.language.structure.Type;
import kermeta.language.structure.TypeVariable;

/**
 * A sample validator interface for {@link kermeta.language.structure.TypeVariableBinding}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TypeVariableBindingValidator
{
  boolean validate();

  boolean validateType(Type value);
  boolean validateVariable(TypeVariable value);
}
