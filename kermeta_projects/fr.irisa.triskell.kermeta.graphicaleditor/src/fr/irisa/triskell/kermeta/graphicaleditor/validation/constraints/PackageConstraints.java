/* $Id: PackageConstraints.java,v 1.2 2006-03-29 08:55:38 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : PackageConstraints.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Mar 14, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
/**
 * 
 */
package fr.irisa.triskell.kermeta.graphicaleditor.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;

/**
 * @author zdrey
 *
 */
public class PackageConstraints extends AbstractModelConstraint {

	public PackageConstraints()
	{
		super();
		System.err.println("Package constraint!");
	}
	
	/** (non-Javadoc)
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	public IStatus validate(IValidationContext ctx)
	{
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {
			String name = null;
			// no visitor implemented...
			if (eObj instanceof Package) {
				name = ((Package)eObj).getName(); 
			} else if (eObj instanceof ClassDefinition) {
				name = ((ClassDefinition)eObj).getName();
			}
			
			if (name == null || name.length() == 0) {
				return ctx.createFailureStatus(new Object[] {eObj.eClass().getName()});
			}
		}
		return ctx.createSuccessStatus();
	}
}
