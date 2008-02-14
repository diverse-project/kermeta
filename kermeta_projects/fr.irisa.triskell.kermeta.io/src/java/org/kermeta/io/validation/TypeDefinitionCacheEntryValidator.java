/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeDefinitionCacheEntryValidator.java,v 1.2 2008-02-14 07:13:17 uid21732 Exp $
 */
package org.kermeta.io.validation;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.kermeta.io.TypeDefinitionCacheEntry}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TypeDefinitionCacheEntryValidator {
	boolean validate();

	boolean validateQualifiedName(String value);
	boolean validateTypeDefinition(EList<TypeDefinition> value);

	boolean validateTypeDefinition(TypeDefinition value);
}
