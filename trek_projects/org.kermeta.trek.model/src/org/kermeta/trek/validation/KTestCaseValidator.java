/**
 * <copyright>
 * </copyright>
 *
 * $Id: KTestCaseValidator.java,v 1.1 2007-10-15 16:54:08 fmunoz Exp $
 */
package org.kermeta.trek.validation;

import org.kermeta.trek.KUseCase;

/**
 * A sample validator interface for {@link org.kermeta.trek.KTestCase}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface KTestCaseValidator {
	boolean validate();

	boolean validateVerifies(KUseCase value);
	boolean validateTestCase(String value);
	boolean validateFile(String value);
}
