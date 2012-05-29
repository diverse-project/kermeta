/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.essentialocl.validation;

import fr.tm.elibel.smartqvt.qvt.emof.Parameter;

import fr.tm.elibel.smartqvt.qvt.essentialocl.LetExp;
import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

/**
 * A sample validator interface for {@link fr.tm.elibel.smartqvt.qvt.essentialocl.Variable}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VariableValidator {
	boolean validate();

	boolean validateInitExpression(OclExpression value);
	boolean validateLetExp(LetExp value);
	boolean validateRepresentedParameter(Parameter value);
}