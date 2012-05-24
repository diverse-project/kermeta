/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational.validation;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.EntryOperation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Module}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModuleValidator {
	boolean validate();

	boolean validateConfigProperty(EList value);
	boolean validateEntry(EntryOperation value);
	boolean validateIsBlackbox(Boolean value);
	boolean validateModuleImport(EList value);
	boolean validateOwnedTag(EList value);
	boolean validateOwnedVariable(EList value);
	boolean validateUsedModelType(EList value);
}
