/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: BlockValidator.java,v 1.1 2008-07-02 09:13:25 ftanguy Exp $
 */
package kermeta.language.behavior.validation;

import kermeta.language.behavior.Expression;
import kermeta.language.behavior.Rescue;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link kermeta.language.behavior.Block}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BlockValidator
{
  boolean validate();

  boolean validateStatement(EList<Expression> value);
  boolean validateRescueBlock(EList<Rescue> value);
}
