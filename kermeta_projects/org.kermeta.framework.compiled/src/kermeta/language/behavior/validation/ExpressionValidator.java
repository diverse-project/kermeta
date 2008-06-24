/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: ExpressionValidator.java,v 1.1 2008-06-24 14:23:14 cfaucher Exp $
 */
package kermeta.language.behavior.validation;

import kermeta.language.structure.Type;

/**
 * A sample validator interface for {@link kermeta.language.behavior.Expression}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExpressionValidator
{
  boolean validate();

  boolean validateStaticType(Type value);
}
