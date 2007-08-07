/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassValidator.java,v 1.4 2007-08-07 13:35:01 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.validation;

import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.irisa.triskell.kermeta.language.structure.Class}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ClassValidator {
	boolean validate();

	boolean validateOwnedAttribute(EList value);
	boolean validateOwnedOperation(EList value);
	boolean validateSuperClass(EList value);
	boolean validateIsAbstract(boolean value);
	boolean validateName(String value);
}
