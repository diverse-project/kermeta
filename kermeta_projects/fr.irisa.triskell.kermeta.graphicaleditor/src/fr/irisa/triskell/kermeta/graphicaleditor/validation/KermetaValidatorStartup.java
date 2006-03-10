/* $Id: KermetaValidatorStartup.java,v 1.1 2006-03-10 16:07:21 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : KermetaConstraintValidator.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Mar 10, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.validation;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

public class KermetaValidatorStartup implements IStartup {

	public void earlyStartup() {
		System.err.println("Ton tonton ton mon tonton");
		EValidator.Registry.INSTANCE.put(
				StructurePackage.eINSTANCE,
				new EcoreValidatorAdapter());
	}
}
