/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: DynamicExpressionValidator.java,v 1.1 2008-06-24 14:23:41 cfaucher Exp $
 */
package kermeta.interpreter.validation;

import kermeta.interpreter.KermetaError;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Type;

import kermeta.utils.Hashtable;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link kermeta.interpreter.DynamicExpression}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DynamicExpressionValidator
{
  boolean validate();

  boolean validateExpression(Expression value);
  boolean validateErrors(EList<KermetaError> value);
  boolean validateFormalParameters(Hashtable<String, Type> value);
  boolean validateSelfClass(ClassDefinition value);
}
