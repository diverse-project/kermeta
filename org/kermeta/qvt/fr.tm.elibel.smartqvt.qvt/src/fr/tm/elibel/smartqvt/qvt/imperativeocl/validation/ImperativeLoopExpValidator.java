/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.imperativeocl.validation;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

/**
 * A sample validator interface for {@link fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeLoopExp}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ImperativeLoopExpValidator {
	boolean validate();

	boolean validateCondition(OclExpression value);
}
