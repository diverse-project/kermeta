/**
 * <copyright>
 * </copyright>
 *
 * $Id: RuleValidator.java,v 1.1 2007-07-24 13:47:11 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.validation;

import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.In;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.RuleType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.irisa.triskell.kermeta.kpm.Rule}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RuleValidator {
	boolean validate();

	boolean validateIn(In value);
	boolean validateEvent(Event value);
	boolean validateOuts(EList value);
	boolean validateName(String value);
	boolean validateType(RuleType value);
}
