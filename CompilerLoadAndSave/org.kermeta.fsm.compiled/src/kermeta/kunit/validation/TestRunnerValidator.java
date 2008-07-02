/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: TestRunnerValidator.java,v 1.1 2008-07-02 09:13:30 ftanguy Exp $
 */
package kermeta.kunit.validation;

import kermeta.kunit.Log;

/**
 * A sample validator interface for {@link kermeta.kunit.TestRunner}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TestRunnerValidator
{
  boolean validate();

  boolean validateLog(Log value);
}
