/**
 * <copyright>
 * </copyright>
 *
 * $Id: TagValidator.java,v 1.1 2008-07-02 09:43:41 ftanguy Exp $
 */
package kermeta.language.structure.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link kermeta.language.structure.Tag}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TagValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateValue(String value);
	boolean validateObject(EList<kermeta.language.structure.Object> value);
}
