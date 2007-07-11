/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeContainerValidator.java,v 1.1 2007-07-11 14:41:54 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.validation;

import fr.irisa.triskell.kermeta.language.structure.Type;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.irisa.triskell.kermeta.language.structure.TypeContainer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TypeContainerValidator {
	boolean validate();

	boolean validateContainedType(EList value);
}
