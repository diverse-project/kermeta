/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParameterizedTypeValidator.java,v 1.2 2007-07-20 15:08:59 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.validation;

import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;

import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.irisa.triskell.kermeta.language.structure.ParameterizedType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ParameterizedTypeValidator {
	boolean validate();

	boolean validateTypeParamBinding(EList value);
	boolean validateTypeDefinition(GenericTypeDefinition value);
	boolean validateVirtualTypeBinding(EList value);
}
