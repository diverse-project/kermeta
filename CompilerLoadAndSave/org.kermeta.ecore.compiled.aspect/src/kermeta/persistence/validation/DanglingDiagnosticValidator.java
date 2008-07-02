/**
 * <copyright>
 * </copyright>
 *
 * $Id: DanglingDiagnosticValidator.java,v 1.1 2008-07-02 09:43:40 ftanguy Exp $
 */
package kermeta.persistence.validation;

import kermeta.language.structure.Property;

/**
 * A sample validator interface for {@link kermeta.persistence.DanglingDiagnostic}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DanglingDiagnosticValidator {
	boolean validate();

	boolean validateReferencingElement(kermeta.language.structure.Object value);
	boolean validateDanglingElement(kermeta.language.structure.Object value);
	boolean validateReferencingProperty(Property value);
}
