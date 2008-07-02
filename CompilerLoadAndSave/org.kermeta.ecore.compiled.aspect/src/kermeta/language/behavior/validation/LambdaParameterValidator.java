/**
 * <copyright>
 * </copyright>
 *
 * $Id: LambdaParameterValidator.java,v 1.1 2008-07-02 09:43:41 ftanguy Exp $
 */
package kermeta.language.behavior.validation;

import kermeta.language.behavior.TypeReference;

/**
 * A sample validator interface for {@link kermeta.language.behavior.LambdaParameter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LambdaParameterValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateType(TypeReference value);
}
