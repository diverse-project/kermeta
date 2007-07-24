/**
 * <copyright>
 * </copyright>
 *
 * $Id: OperationValidator.java,v 1.3 2007-07-24 13:47:31 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.validation;

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;

/**
 * A sample validator interface for {@link fr.irisa.triskell.kermeta.language.structure.Operation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OperationValidator {
	boolean validate();

	boolean validateBody(Expression value);
	boolean validateSuperOperation(Operation value);
	boolean validateOwningClass(ClassDefinition value);
	boolean validateTypeParameter(EList value);
	boolean validateRaisedException(EList value);
	boolean validateOwnedParameter(EList value);
	boolean validatePre(EList value);
	boolean validatePost(EList value);
	boolean validateIsAbstract(boolean value);
}
