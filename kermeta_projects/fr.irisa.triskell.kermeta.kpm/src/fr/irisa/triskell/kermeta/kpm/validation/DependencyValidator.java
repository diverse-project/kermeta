/**
 * <copyright>
 * </copyright>
 *
 * $Id: DependencyValidator.java,v 1.1 2007-07-24 13:47:11 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.validation;

import fr.irisa.triskell.kermeta.kpm.RuleType;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * A sample validator interface for {@link fr.irisa.triskell.kermeta.kpm.Dependency}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DependencyValidator {
	boolean validate();

	boolean validateType(RuleType value);
	boolean validateFrom(Unit value);
	boolean validateTo(Unit value);
}
