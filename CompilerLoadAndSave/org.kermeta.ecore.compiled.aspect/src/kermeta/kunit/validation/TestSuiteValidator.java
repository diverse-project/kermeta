/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuiteValidator.java,v 1.1 2008-07-02 09:43:57 ftanguy Exp $
 */
package kermeta.kunit.validation;

import kermeta.kunit.Test;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link kermeta.kunit.TestSuite}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TestSuiteValidator {
	boolean validate();

	boolean validateTests(EList<Test> value);
}
