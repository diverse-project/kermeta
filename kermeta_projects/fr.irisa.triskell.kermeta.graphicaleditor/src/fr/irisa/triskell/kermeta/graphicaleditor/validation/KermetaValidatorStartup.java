/* $Id: KermetaValidatorStartup.java,v 1.2 2006-03-22 16:24:59 zdrey Exp $
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

	public KermetaValidatorStartup()
	{
		System.out.println("Construction of KemretaValidatorStartup");
	}
	
	public void earlyStartup() {
		System.err.println("Start up!");
		EValidator.Registry.INSTANCE.put(
				StructurePackage.eINSTANCE,
				new KermetaValidatorAdapter());
	}
}
