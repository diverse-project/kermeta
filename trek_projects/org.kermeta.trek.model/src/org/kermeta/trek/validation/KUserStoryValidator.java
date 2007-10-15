/**
 * <copyright>
 * </copyright>
 *
 * $Id: KUserStoryValidator.java,v 1.1 2007-10-15 16:54:08 fmunoz Exp $
 */
package org.kermeta.trek.validation;

import org.eclipse.emf.common.util.EList;

import org.kermeta.trek.KUseCase;

/**
 * A sample validator interface for {@link org.kermeta.trek.KUserStory}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface KUserStoryValidator {
	boolean validate();

	boolean validateCoveredBy(EList<KUseCase> value);
	boolean validateName(String value);
	boolean validateId(String value);
	boolean validateSummary(String value);
	boolean validateShortSummary(String value);
}
