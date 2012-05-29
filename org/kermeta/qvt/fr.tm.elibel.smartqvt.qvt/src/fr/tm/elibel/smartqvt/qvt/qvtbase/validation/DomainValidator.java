/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtbase.validation;

import fr.tm.elibel.smartqvt.qvt.qvtbase.Rule;
import fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel;

/**
 * A sample validator interface for {@link fr.tm.elibel.smartqvt.qvt.qvtbase.Domain}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DomainValidator {
	boolean validate();

	boolean validateIsCheckable(Boolean value);
	boolean validateIsEnforceable(Boolean value);
	boolean validateRule(Rule value);
	boolean validateTypedModel(TypedModel value);
}