/**
 * <copyright>
 * </copyright>
 *
 * $Id: KPMValidator.java,v 1.3 2008-06-12 07:13:50 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.validation;

import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.Filter;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Type;
import fr.irisa.triskell.kermeta.kpm.Unit;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.irisa.triskell.kermeta.kpm.KPM}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface KPMValidator {
	boolean validate();

	boolean validateActions(EList value);
	boolean validateFilters(EList value);
	boolean validateTypes(EList value);
	boolean validateRules(EList value);
	boolean validateEvents(EList value);
	boolean validateUnits(EList value);
	boolean validateRuleTypes(EList value);
}
