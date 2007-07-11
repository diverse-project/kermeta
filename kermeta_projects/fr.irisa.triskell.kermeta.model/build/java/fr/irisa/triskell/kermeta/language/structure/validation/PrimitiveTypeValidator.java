/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitiveTypeValidator.java,v 1.1 2007-07-11 14:41:54 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.validation;

import fr.irisa.triskell.kermeta.language.structure.Type;

/**
 * A sample validator interface for {@link fr.irisa.triskell.kermeta.language.structure.PrimitiveType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PrimitiveTypeValidator {
	boolean validate();

	boolean validateInstanceType(Type value);
}
